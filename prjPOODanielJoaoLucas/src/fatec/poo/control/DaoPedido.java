package fatec.poo.control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.model.*;
import java.util.ArrayList;
import java.util.HashSet;

public class DaoPedido {

    private Connection conn;
    private DaoCliente daoCliente;
    private DaoVendedor daoVendedor;
    private DaoProduto daoProduto;
    private DaoItemPedido daoItemPedido;
    private int idCliente;
    private int idVendedor;
    
    private ArrayList<ItemPedido> itensPedidos;
        
    public DaoPedido(Connection conn) {
         this.conn = conn;
         this.daoCliente = new DaoCliente(conn);
         this.daoVendedor = new DaoVendedor(conn);
         this.daoProduto = new DaoProduto(conn);
         this.daoItemPedido = new DaoItemPedido(conn);
         itensPedidos = new ArrayList<ItemPedido>(); 
    }
    
    public void inserir(Pedido pedido) {
        PreparedStatement ps = null;   
        
        consultaIdClienteVendedor(pedido);
        try {
            ps = conn.prepareStatement("INSERT INTO tbPedido VALUES (?,?,?,?,?,?,?)");
            ps.setString(1, pedido.getNumero());
            ps.setString(2, pedido.getDataEmissao());
            ps.setString(3, pedido.getDataPagto());
            ps.setString(4, pedido.isFormatoPagto() ? "A vista" : "A Prazo");
            ps.setString(5, pedido.getSituacao() ? "true" : "false");
            ps.setInt(6, idCliente);
            ps.setInt(7, idVendedor);

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());   
        }      
    }
    
    public void alterar(Pedido p) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tbPedido SET numero=?, dtEmissao=?, dtPagto=?, formapagto=?, situacao=?, cliente=?, vendedor=? WHERE numero = ?");
            
            ps.setString(1, p.getNumero());
            ps.setString(2, p.getDataEmissao());
            ps.setString(3, p.getDataPagto());
            ps.setString(4, p.isFormatoPagto()?"A vista" : "A prazo");
            ps.setString(5, p.isSituacao()?"true" : "false");
            consultaIdClienteVendedor(p);
            ps.setInt(6, idCliente);
            ps.setInt(7, idVendedor);
            
            ps.execute();
            
            daoItemPedido.alterar(itensPedidos);
            
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }        
    }
        
     public  Pedido consultar (String numero) {
        Pedido p = null;       
        PreparedStatement ps = null;
        
        try {
                ps = conn.prepareStatement("SELECT NUMERO, DTEMISSAO, DTPAGTO, FORMAPAGTO, SITUACAO, CPFCLIENTE,LIMITECRED,LIMITEDISP,CPFVENDEDOR,SALARIOBASE,TAXACOMISSAO FROM tbPedido PD\n" +
                                            "INNER JOIN TBCLIENTE C\n" +
                                            "ON PD.CLIENTE = C.IDCLIENTE\n" +
                                            "INNER JOIN TBVENDEDOR V\n" +
                                            "ON PD.VENDEDOR = V.IDVENDEDOR\n" +
                                            "WHERE numero = ?");  
                
                ps.setString(1, numero);
                
                ResultSet rs = ps.executeQuery();
                
                while(rs.next()){
                    p = new Pedido(numero, rs.getString("DTEMISSAO"));
                    
                    //consulta cliente e vendedor e os associa ao pedido
                    p.setCliente(daoCliente.consultar(rs.getString("cpfCliente")));
                    p.setVendedor(daoVendedor.consultar(rs.getString("CPFVENDEDOR"))); 
                    
                    p.setDataPagto(rs.getString("DTPAGTO"));
                    p.setSituacao(Boolean.parseBoolean(rs.getString("SITUACAO")));
                    
                    if("A vista".equals(rs.getString("FORMAPAGTO")))
                        p.setFormatoPagto(true);
                    else
                        p.setFormatoPagto(false);
                 
                    itensPedidos = daoItemPedido.consultar(numero);
                    
                    for(int i=0; i < itensPedidos.size(); i++){
                        p.addItemPedido(itensPedidos.get(i));
                        
                        p.getCliente().setLimiteDisponivel(p.getCliente().getLimiteDisp()+ p.getItensPedidos().get(i).getSubTotal());
                    }
                    
                }
            }        
        
        catch (SQLException ex) { 
            System.out.println("ERRO");
            System.out.println(ex.toString());   
        }
        return (p);
    }    
     
    public void excluir(Pedido p) {
        PreparedStatement ps = null;
        try {                        
            
            daoItemPedido.excluir(p);
            
            ps = conn.prepareStatement("DELETE FROM tbPedido WHERE numero = ?");
            ps.setString(1, p.getNumero());
            
            ps.execute();      
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void consultaIdClienteVendedor(Pedido pedido){ 
        PreparedStatement ps = null; 
        try {
            ps = conn.prepareStatement("SELECT idCliente FROM tbCliente WHERE cpfCliente = ?");
            ps.setString(1, pedido.getCliente().getCpf());

            ResultSet rs = ps.executeQuery();

            while(rs.next())
                idCliente = Integer.parseInt(rs.getString("idCliente"));

            ps = conn.prepareStatement("SELECT idVendedor FROM tbVendedor WHERE cpfVendedor = ?");
            ps.setString(1, pedido.getVendedor().getCpf());

            rs = ps.executeQuery();

            while(rs.next())
                idVendedor = Integer.parseInt(rs.getString("idVendedor"));

        } catch (SQLException ex) {
            System.out.println(ex.toString());   
        }
    }
}






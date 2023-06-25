package fatec.poo.control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.model.*;
import java.util.ArrayList;
import java.util.HashSet;

public class DaoItemPedido {

    private Connection conn;
    private DaoProduto daoProduto;
    private int idCliente;
    private int idVendedor;
    
    private ArrayList<ItemPedido> itensPedidos;
    
    
    public DaoItemPedido(Connection conn) {
         this.conn = conn;
         this.daoProduto = new DaoProduto(conn);
         itensPedidos = new ArrayList<ItemPedido>(); 
    }
    
    public void inserir(ItemPedido itemPedido) {

        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement("SELECT idCliente FROM tbCliente WHERE cpfCliente = ?");
            ps.setString(1, itemPedido.getPedido().getCliente().getCpf());
            
            ResultSet rs = ps.executeQuery();
             
            while(rs.next())
                idCliente = Integer.parseInt(rs.getString("idCliente"));
            
                ps = conn.prepareStatement("SELECT idVendedor FROM tbVendedor WHERE cpfVendedor = ?");
                ps.setString(1, itemPedido.getPedido().getVendedor().getCpf());

                rs = ps.executeQuery();
             
            while(rs.next())
                idVendedor = Integer.parseInt(rs.getString("idVendedor"));
            
        } catch (SQLException ex) {
            System.out.println(ex.toString());   
        } 
        
                 
        try {
            ps = conn.prepareStatement("INSERT INTO tbItemPedido VALUES(seq_itemPedido.nextval,?,?,?)");

            ps.setDouble(1, itemPedido.getQtdeVendida());
            ps.setString(2, itemPedido.getPedido().getNumero());
            ps.setInt(3, Integer.parseInt(itemPedido.getProduto().getCodigo()));
            
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
       
    }
    
    public void alterar(ArrayList<ItemPedido> itensPedidos) {
        PreparedStatement ps = null;
        try {
            
            for(int i=0; i < itensPedidos.size(); i++){
                ps = conn.prepareStatement("UPDATE tbItemPedido SET seq=?, qtdeVendida=?, numPedido=?, codProd=? WHERE numero = ?");
                ps.setInt(1, itensPedidos.get(i).getSequencia());
                ps.setDouble(2, itensPedidos.get(i).getQtdeVendida());
                ps.setString(3, itensPedidos.get(i).getPedido().getNumero());
                ps.setInt(4, Integer.parseInt(itensPedidos.get(i).getProduto().getCodigo()));
                
                ps.execute();
            }
            
            
            
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }        
    }
        
     public  ArrayList<ItemPedido> consultar (String numero) {
        ItemPedido ip = null;       
        PreparedStatement ps = null;
        
        try {                
                ps = conn.prepareStatement("SELECT * FROM TBITEMPEDIDO WHERE NUMPEDIDO = ?");                  
                ps.setString(1, numero);
             
                ResultSet rs = ps.executeQuery();
                
                while(rs.next()){
                    //consulta produto, cria item pedido e adiciona ao pedido
                    
                    ip = new ItemPedido( rs.getInt("SEQ"), 
                                        rs.getDouble("QTDEVENDIDA"), 
                                        daoProduto.consultar(Integer.toString(rs.getInt("CODPROD"))));     
                    itensPedidos.add(ip);                    
                }
            }                
        catch (SQLException ex) { 
            System.out.println("ERRO");
            System.out.println(ex.toString());   
        }
        return (itensPedidos);
    }    
     
    public void excluir(Pedido p) {
        PreparedStatement ps = null;
        try {                        
            ps = conn.prepareStatement("DELETE FROM tbItemPedido WHERE numpedido = ?");
            ps.setString(1, p.getNumero());   
                            
            ps.execute();      
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}






package fatec.poo.control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.model.*;
import java.util.ArrayList;

public class DaoVendedor {

    private Connection conn;
    private ArrayList<Integer> numPedido;
    
    public DaoVendedor(Connection conn) {
         this.conn = conn;
         numPedido = new ArrayList<Integer>();
    }
    
    public void inserir(Vendedor vendedor) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tbPessoa(cpf,nome,endereco,cidade,uf,cep,ddd, telefone) VALUES(?,?,?,?,?,?,?,?)");
            ps.setString(1, vendedor.getCpf());
            ps.setString(2, vendedor.getNome());
            ps.setString(3, vendedor.getEndereco());
            ps.setString(4, vendedor.getCidade());
            ps.setString(5, vendedor.getUf());
            ps.setString(6, vendedor.getCep());
            ps.setString(7, vendedor.getDdd());
            ps.setString(8, vendedor.getTelefone());
            
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }

        try {
            ps = conn.prepareStatement("INSERT INTO tbVendedor VALUES (seq_vendedor.nextval,?,?,?)");
            ps.setString(1, vendedor.getCpf());
            ps.setDouble(2, vendedor.getSalarioBase());
            ps.setDouble(3, vendedor.getTaxaComissao());
                     
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }        
    }
    
    public void alterar(Vendedor vendedor) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE TBPESSOA SET cpf = ?,nome= ?, endereco= ?, cidade= ?, uf= ?, cep= ?, ddd= ?, telefone= ? WHERE cpf = ?");

            ps.setString(1, vendedor.getCpf());
            ps.setString(2, vendedor.getNome());
            ps.setString(3, vendedor.getEndereco());
            ps.setString(4, vendedor.getCidade());            
            ps.setString(5, vendedor.getUf());
            ps.setString(6, vendedor.getCep());
            ps.setString(7, vendedor.getDdd());
            ps.setString(8, vendedor.getTelefone());
            ps.setString(9, vendedor.getCpf());
            
            ps.execute();
            
            ps = conn.prepareStatement("UPDATE TBVENDEDOR SET taxaComissao = ?, salarioBase = ? WHERE cpfVendedor = ?");
            
            ps.setDouble( 1, vendedor.getTaxaComissao());
            ps.setDouble( 2, vendedor.getSalarioBase());            
            ps.setString( 3, vendedor.getCpf());
            
            ps.execute();
            
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }        
    }
        
     public  Vendedor consultar (String cpf) {
        Vendedor v = null;       
        PreparedStatement ps = null;
        
        try {
                ps = conn.prepareStatement("SELECT * FROM tbPessoa " +
                                            "INNER JOIN tbVendedor " +
                                            "ON tbPessoa.cpf = tbVendedor.cpfVendedor " +
                                            "WHERE cpfVendedor = ?");  
                
                ps.setString(1, cpf);
                
                ResultSet rs = ps.executeQuery();
                
                while(rs.next()){
                    v = new Vendedor(cpf, rs.getString("nome"), rs.getDouble("salariobase"));
                    v.setCidade(rs.getString("cidade"));
                    v.setUf(rs.getString("uf"));
                    v.setTelefone(rs.getString("telefone"));
                    v.setDdd(rs.getString("ddd"));
                    v.setCep(rs.getString("cep"));
                    v.setEndereco(rs.getString("endereco"));
                    v.setTaxaComissao((rs.getDouble("taxacomissao")*100));
                    
                    v.setIdVendedor(rs.getInt("idVendedor"));
                }
            }        
        
        catch (SQLException ex) { 
            System.out.println("ERRO");
            System.out.println(ex.toString());   
        }
        return (v);
    }    
     
    public void excluir(Vendedor v) {
        PreparedStatement ps = null;
        try {                        
            
            ps = conn.prepareStatement("SELECT * FROM tbPedido WHERE vendedor = ?");
            ps.setInt(1, v.getIdVendedor());

            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                numPedido.add(Integer.parseInt(rs.getString("numero"))); 
                
            }
            
            for(int i=0; i < numPedido.size();i++){
                ps = conn.prepareStatement("DELETE FROM tbItemPedido WHERE numpedido = ?");
                System.out.println(numPedido.get(i));
                ps.setString(1, String.format("",numPedido.get(i))); 
                ps.execute();    
            }
            
            ps = conn.prepareStatement("DELETE FROM tbPedido WHERE vendedor = ?");            
            ps.setInt(1, v.getIdVendedor());   
            
            ps.execute();      
            
            ps = conn.prepareStatement("DELETE FROM TBVENDEDOR WHERE cpfVendedor = ?");
            ps.setString(1, v.getCpf());   
            
            ps.execute();      
            
            ps = conn.prepareStatement("DELETE FROM TBPESSOA WHERE cpf = ?");
            
            ps.setString(1, v.getCpf());                      
            ps.execute();      
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}






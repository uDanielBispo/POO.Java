package fatec.poo.control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.model.*;
import java.util.ArrayList;

public class DaoCliente {

    private Connection conn;
    private ArrayList<Integer> numPedido;
    
    public DaoCliente(Connection conn) {
        this.conn = conn;
        numPedido = new ArrayList<Integer>();
    }
    
    public void inserir(Cliente cliente) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tbPessoa(cpf,nome,endereco,cidade,uf,cep,ddd, telefone) VALUES(?,?,?,?,?,?,?,?)");
            ps.setString(1, cliente.getCpf());
            ps.setString(2, cliente.getNome());
            ps.setString(3, cliente.getEndereco());
            ps.setString(4, cliente.getCidade());
            ps.setString(5, cliente.getUf());
            ps.setString(6, cliente.getCep());
            ps.setString(7, cliente.getDdd());
            ps.setString(8, cliente.getTelefone());
            
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }

        try {
            ps = conn.prepareStatement("INSERT INTO tbCliente (idCliente, cpfCliente,limiteCred,limiteDisp) VALUES (seq_cliente.nextval,?,?,?)");
            ps.setString(1, cliente.getCpf());
            ps.setDouble(2, cliente.getLimiteCred());
            ps.setDouble(3, cliente.getLimiteDisp());
                     
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }        
    }
    
    public void alterar(Cliente cliente) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE TBPESSOA SET cpf = ?, nome= ?, endereco= ?, cidade= ?, uf= ?, cep= ?, ddd= ?, telefone= ? WHERE cpf = ?");
            
            ps.setString(1, cliente.getCpf());
            ps.setString(2, cliente.getNome());
            ps.setString(3, cliente.getEndereco());
            ps.setString(4, cliente.getCidade());            
            ps.setString(5, cliente.getUf());
            ps.setString(6, cliente.getCep());
            ps.setString(7, cliente.getDdd());
            ps.setString(8, cliente.getTelefone());
            ps.setString(9, cliente.getCpf());
            
            ps.execute();
           
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
        try {
            ps = conn.prepareStatement("UPDATE tbCliente SET limiteDisp=? WHERE cpfCliente = ?");
            
            ps.setDouble(1, cliente.getLimiteDisp());
            ps.setString(2, cliente.getCpf());
            
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        } 
    }
        
     public  Cliente consultar (String cpf) {
        Cliente c = null;       
        PreparedStatement ps = null;
        
        try {
                ps = conn.prepareStatement("SELECT * FROM TBPESSOA INNER JOIN TBCLIENTE ON TBPESSOA.CPF = TBCLIENTE.CPFCLIENTE WHERE CPF = ?");     
                ps.setString(1, cpf);
                
                ResultSet rs = ps.executeQuery();
                
                //entrada de dados para teste 889.545.418-52
                
                while(rs.next()){
                    c = new Cliente(cpf, rs.getString("nome"), rs.getDouble("limiteCred"));
                    c.setCidade(rs.getString("cidade"));
                    c.setUf(rs.getString("uf"));
                    c.setTelefone(rs.getString("telefone"));
                    c.setDdd(rs.getString("ddd"));
                    c.setCep(rs.getString("cep"));
                    c.setEndereco(rs.getString("endereco"));
                    c.setLimiteDisponivel(Double.parseDouble(rs.getString("limitedisp")));
                    c.setIdCliente(rs.getInt("idCliente"));
                }
            }        
        
        catch (SQLException ex) { 
            System.out.println("ERRO");
            System.out.println(ex.toString());   
        }
        return (c);
    }    
     
    public void excluir(Cliente cliente) {
        PreparedStatement ps = null;
        try {   
                    
            ps = conn.prepareStatement("SELECT * FROM tbPedido WHERE cliente = ?");
            ps.setInt(1, cliente.getIdCliente());

            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                numPedido.add(Integer.parseInt(rs.getString("numero"))); 
            }
            
            for(int i=0; i < numPedido.size();i++){
                ps = conn.prepareStatement("DELETE FROM tbItemPedido WHERE numpedido = ?");
                ps.setString(1, String.format("",numPedido.get(i))); 
                ps.execute();    
            }
            
            ps = conn.prepareStatement("DELETE FROM tbPedido WHERE cliente = ?");
            ps.setInt(1, cliente.getIdCliente());   
            
            ps.execute();      
            
            ps = conn.prepareStatement("DELETE FROM TBCLIENTE WHERE cpfCliente = ?");
            ps.setString(1, cliente.getCpf());   
            
            ps.execute();      
            
            ps = conn.prepareStatement("DELETE FROM TBPESSOA WHERE cpf = ?");
            
            ps.setString(1, cliente.getCpf());                      
            ps.execute();    
            
  
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}







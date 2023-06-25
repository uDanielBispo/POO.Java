package fatec.poo.control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.model.*;
import java.util.Set;

public class DaoProduto {

    private Connection conn;
    
    public DaoProduto(Connection conn) {
         this.conn = conn;
    }
    
    public void inserir(Produto produto) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tbProduto(codigo, descricao, qtdedisp, preco, estoqueMin) VALUES (?,?,?,?,?)");
            ps.setString(1, produto.getCodigo());
            ps.setString(2, produto.getDescricao());
            ps.setDouble(3, produto.getQtdeEstoque());
            ps.setDouble(4, produto.getPreco());
            ps.setDouble(5, produto.getEstoqueMinimo());
            
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void alterar(Produto produto) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tbProduto SET descricao = ?, qtdeDisp = ?, preco = ?, estoqueMin = ? WHERE codigo = ?");
            
            ps.setString(1, produto.getDescricao());
            ps.setDouble(2, produto.getQtdeEstoque());
            ps.setDouble(3, produto.getPreco());
            ps.setDouble(4, produto.getEstoqueMinimo());          
            ps.setString(5, produto.getCodigo());
            
            ps.execute();            
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
        
     public  Produto consultar (String codigo) {
        Produto p = null;       
        PreparedStatement ps = null;
        
        try {
                ps = conn.prepareStatement("SELECT * FROM tbProduto WHERE codigo = ?");                  
                ps.setString(1, codigo);
                
                ResultSet rs = ps.executeQuery();
                
                while(rs.next()){
                    p = new Produto(codigo, rs.getString("descricao"));
                    p.setEstoqueMinimo(Double.parseDouble(rs.getString("estoqueMin")));
                    p.setPreco(Double.parseDouble(rs.getString("preco")));
                    p.setQtdeEstoque(Double.parseDouble(rs.getString("qtdeDisp")));                    
                }
            }        
        
        catch (SQLException ex) { 
            System.out.println("ERRO");
            System.out.println(ex.toString());   
        }
        return (p);
    }    
     
    public void excluir(Produto p) {
        PreparedStatement ps = null;
        try {                        
            ps = conn.prepareStatement("DELETE FROM tbProduto WHERE codigo = ?");
            ps.setString(1, p.getCodigo());   
            
            ps.execute();          
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}






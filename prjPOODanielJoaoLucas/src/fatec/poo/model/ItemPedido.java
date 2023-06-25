package fatec.poo.model;

public class ItemPedido{
    private int sequencia;
    private double qtdeVendida;
    private Produto produto;
    private Pedido pedido;
	
    public ItemPedido(int sequencia, double qtdeVendida, Produto produto) {
            this.sequencia = sequencia;
            this.qtdeVendida = qtdeVendida;
            this.produto = produto;
            produto.setQtdeEstoque(produto.getQtdeEstoque() - qtdeVendida);
    }
        
    public void setProduto(Produto produto){
        this.produto = produto;
    }
    
    public Produto getProduto(){
        return produto;
    }
    
    public void setPedido(Pedido pedido){
        this.pedido = pedido;
    }
    
    public Pedido getPedido(){
        return this.pedido;
    }
        
    public int getSequencia() {
        return sequencia;
    }

    public double getQtdeVendida() {
        return qtdeVendida;
    }

    public void setQtdeVendida(double qtdeVendida) {        
        this.qtdeVendida = qtdeVendida;
       produto.setQtdeEstoque(produto.getQtdeEstoque() - qtdeVendida);
    }	

    public double getSubTotal(){
        return (this.qtdeVendida * produto.getPreco());
    }
}

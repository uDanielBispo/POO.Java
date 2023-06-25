package fatec.poo.model;

import java.util.ArrayList;

public class Pedido {
    private String numero,
                dataEmissao,
                dataPagto;
    private boolean formatoPagto,
                situacao;

    //aponta para o cliente que dez o pedido
    private Cliente cliente;

    //aponta para o vendedor do pedido
    private Vendedor vendedor;

    //aponta para os itens pedidos nesse pedido
    private ArrayList<ItemPedido> itensPedidos;

    public Pedido(String numero, String dataEmissao) {
        this.numero = numero;
        this.dataEmissao = dataEmissao;
        itensPedidos = new ArrayList<ItemPedido>();            
    }

    public void addItemPedido(ItemPedido itemPedido){
        itensPedidos.add(itemPedido);
        itemPedido.setPedido(this);
        cliente.setLimiteDisponivel( cliente.getLimiteDisp() - (itemPedido.getProduto().getPreco() * itemPedido.getQtdeVendida()) );
        
    }
    
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    
    public Cliente getCliente(){
        return cliente;
    }        
            
    public void setVendedor(Vendedor vendedor){
        this.vendedor = vendedor;
    }
    
    public Vendedor getVendedor(){
        return vendedor;
    }    

    public void setDataPagto(String dataPagto) {
        this.dataPagto = dataPagto;
    }

    public void setFormatoPagto(boolean formatoPagto) {
        this.formatoPagto = formatoPagto;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public String getNumero() {
        return numero;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public String getDataPagto() {
        return dataPagto;
    }

    public boolean isFormatoPagto() {
        return formatoPagto;
    }

    public boolean isSituacao() {
        return situacao;
    }	

    public ArrayList<ItemPedido> getItensPedidos() {
        return itensPedidos;
    }        
    
    public void limpaItensPedidos(){
        for(int i=0; i<this.itensPedidos.size(); i++){
            this.itensPedidos.remove(i);
        }
    }
    
    public boolean getSituacao(){
        return this.situacao;
    }
}

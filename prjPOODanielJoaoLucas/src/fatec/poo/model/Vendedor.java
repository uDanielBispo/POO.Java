package fatec.poo.model;

import java.util.ArrayList;

public class Vendedor extends Pessoa{
    private double salarioBase;
    private double taxaComissao;
    private int idVendedor;
    private ArrayList<Pedido> pedidos;

    public Vendedor(String cpf, String nome, double salarioBase) {
        super(cpf, nome);
        this.salarioBase = salarioBase;
        pedidos = new ArrayList<Pedido>();
    }

    public void addPedido(Pedido pedido) {
        pedidos.add(pedido);
        pedido.setVendedor(this);
    }

    public ArrayList<Pedido> getPedidos(){
        return pedidos;
    }
    
    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(double taxaComissao) {                
        this.taxaComissao = (taxaComissao/100);
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

	
}

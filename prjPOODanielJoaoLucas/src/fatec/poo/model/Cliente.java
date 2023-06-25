package fatec.poo.model;

import java.util.ArrayList;

public class Cliente extends Pessoa{
    private String tipo;
    private double limiteCred;
    private double limiteDisp;
    private int idCliente;
    private ArrayList<Pedido> pedidos;

    public Cliente(String cpf, String nome, double limiteCred) {
        super(cpf, nome);
        this.limiteCred = limiteCred;
        this.limiteDisp = limiteCred;
        pedidos = new ArrayList<Pedido>();
    }

    public void addPedido(Pedido p){
        pedidos.add(p);
        p.setCliente(this);
    }

    public ArrayList<Pedido> getPedidos(){
        return pedidos;
    }
    
    public void setLimiteDisponivel(double limiteDisp){
        this.limiteDisp = limiteDisp;
    }

    public double getLimiteCred() {
        return limiteCred;
    }

    public void setLimiteCred(double limiteCred) {
        this.limiteCred = limiteCred;
        this.limiteDisp = limiteCred;
    }

    public double getLimiteDisp() {
        return limiteDisp;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}

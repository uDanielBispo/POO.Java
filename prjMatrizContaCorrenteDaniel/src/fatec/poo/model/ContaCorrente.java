/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author 0030482123005
 */
public class ContaCorrente {
    private int num;
    private double saldo;
    
    public ContaCorrente(int num, double saldo){
        this.num = num;
        this.saldo = saldo;
    }

    public int getNum() {
        return num;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public double sacar(double saque){
        return saldo = saldo - saque;
    }
    
    public double depositar(double deposito){
        return saldo = saldo + deposito;
    }
}

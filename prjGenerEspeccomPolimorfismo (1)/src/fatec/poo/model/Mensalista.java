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
public class Mensalista extends Funcionario{
    private double valSalMin;
    private int numSalMin;

    public Mensalista(double valSalMin, int numSalMin, int registro, String nome, String dtAdimissao) {
        super(registro, nome, dtAdimissao);
        this.valSalMin = valSalMin;
        this.numSalMin = numSalMin;
    }   
    
    @Override
    public double calcSalBruto(){
        return (valSalMin*numSalMin);
    }   

    public double getValSalMin() {
        return valSalMin;
    }

    public int getNumSalMin() {
        return numSalMin;
    }
       
}

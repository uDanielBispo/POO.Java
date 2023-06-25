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
public class Horista extends Funcionario{
    private double valHorTrab;
    private double qtdeHorTrab;

    public Horista(double valHorTrab, double qtdeHorTrab, int registro, String nome, String dtAdimissao) {
        super(registro, nome, dtAdimissao);
            this.valHorTrab = valHorTrab;
            this.qtdeHorTrab = qtdeHorTrab;
        }    

    public void setQtdeHorTrab(double qtdeHorTrab) {
        this.qtdeHorTrab = qtdeHorTrab;
    }   
    
    @Override
    public double calcSalBruto(){
        return (valHorTrab*qtdeHorTrab);
    }   

    public double getValHorTrab() {
        return valHorTrab;
    }

    public double getQtdeHorTrab() {
        return qtdeHorTrab;
    }
    
    public double calcGratificacao(){
        return (0.075*calcSalBruto());
    }
    
    public double calcSalLiquido(){
        return (super.calcSalLiquido() + calcGratificacao());
    }
}

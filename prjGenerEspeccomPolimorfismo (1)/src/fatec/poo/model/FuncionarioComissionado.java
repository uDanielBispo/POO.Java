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
public class FuncionarioComissionado extends Funcionario{
    private double salBase;
    private double taxaComissao;
    private double totalVendas;

    public FuncionarioComissionado(int registro, String nome, String dtAdimissao, 
                                    double salBase, double taxaComissao) {
        
        super(registro, nome, dtAdimissao);
        this.salBase = salBase;
        this.taxaComissao = taxaComissao;    
    }

    @Override
    public double calcSalBruto() {
        return (salBase + (taxaComissao/100)*totalVendas);
    }
    
    public void addVendas(double valVenda){
         totalVendas+=valVenda;
    }
    
    public double calcGratificacao(){
        if(totalVendas > 10000)
            return calcSalBruto()*0.05;
        else if(totalVendas > 5000)
            return calcSalBruto()*0.03;     
        else return 0;
    }
    
    public double calcSalLiquido(){
        return (calcSalBruto() - calcDesconto() + calcGratificacao());
    }

    public double getSalBase() {
        return salBase;
    }

    public void setSalBase(double salBase) {
        this.salBase = salBase;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }
    
    
}

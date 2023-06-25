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
public class Projeto {
    private int codigo;
    private String desc;
    private String dtInicio;
    private String dtTermino;
    private int numFunc;
    private Funcionario[] funcionario;
    
    public Projeto(int codigo, String desc, String dtInicio, String dtTermino) {
    	this.codigo = codigo;
    	this.desc = desc;
    	this.dtInicio = dtInicio;
    	this.dtTermino = dtTermino;
    	this.funcionario = new Funcionario[10];
    	this.numFunc = 0;
    }
    
    public void addFuncionario(Funcionario funcionario) {
    	this.funcionario[numFunc] = funcionario;
    	this.numFunc++;
    }
    
    public void listarFuncionarios() {
    	System.out.println("\n\nProjeto: "+ this.desc
    			+"\nCodigo: "+this.codigo+"\nData de Inicio: "+this.dtInicio+"\nData de Termino: "
    			+this.dtTermino+"\n");
    	System.out.println("\tINTEGRANTES\nRegistro\tNome\tCargo");
    	
    	for(int i=0; i<this.numFunc;i++) {
    		System.out.print(funcionario[i].getRegistro()+"\t"
    				+funcionario[i].getNome()+"\t"+funcionario[i].getCargo()+"\n");
    	}
    }
    
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public String getDtInicio() {
		return dtInicio;
	}
	
	public void setDtInicio(String dtInicio) {
		this.dtInicio = dtInicio;
	}
	
	public String getDtTermino() {
		return dtTermino;
	}
	
	public void setDtTermino(String dtTermino) {
		this.dtTermino = dtTermino;
	}
	
	public int getNumFunc() {
		return numFunc;
	}
	
	public void setNumFunc(int numFunc) {
		this.numFunc = numFunc;
	}    
}

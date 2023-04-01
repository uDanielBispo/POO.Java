package fatec.poo.model;

public class Professor extends Pessoa{
	private int regFuncionario;
	private double salario;
	
	public Professor(String nome, String dataNascimento, int regFuncionario) {
		super(nome, dataNascimento);
		this.regFuncionario = regFuncionario;
	}

	public int getRegFuncionario() {
		return regFuncionario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}

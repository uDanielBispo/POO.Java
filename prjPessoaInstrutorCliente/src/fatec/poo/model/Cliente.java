package fatec.poo.model;

public class Cliente extends Pessoa{
	private String cpf;
	private double peso;
	private double altura;
	
	public Cliente(String nome, String telefone, String cpf, double peso, double altura) {
		super(nome, telefone);
		this.cpf = cpf;
		this.peso = peso;
		this.altura = altura;
	}

	public String getCpf() {
		return cpf;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}	
}

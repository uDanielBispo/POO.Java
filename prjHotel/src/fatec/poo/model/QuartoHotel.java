package fatec.poo.model;

public class QuartoHotel {
	private int numQuarto;
	private double valorDiaria;
	private int numRG;
	private boolean situacao;
	private double totalFaturado;
	
	public QuartoHotel(int numQuarto, double valorDiaria){
		this.numQuarto = numQuarto;
		this.valorDiaria = valorDiaria;
	}
	
	public void reservar(int numRg) {
		this.numRG = numRg;
		this.situacao = true;s
	}
	
	public double liberar(int numDias) {
		this.numRG = 0;
		this.situacao = false;
		return totalFaturado = numDias*valorDiaria;
	}

	public boolean getSituacao() {
		return situacao;
	}

	public double getTotalFaturado() {
		return totalFaturado;
	}


	
	
}

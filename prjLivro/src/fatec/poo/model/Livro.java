package fatec.poo.model;

public class Livro {
	int id;
	boolean situacao = false;
	double multaDiaria;
	
	public void SetId(int id) {
		this.id = id;
	}
	public void MultaDiaria(double multaDiaria) {
		this.multaDiaria = multaDiaria;
	}
	public boolean GetSituacao(int id) {
		return this.situacao;
	}
	public void Emprestar() {
		this.situacao = true;
	}
	public double Devolver(int diasEmAtraso) {
			this.situacao = false;
			double valorAPagar = diasEmAtraso*multaDiaria;
			return valorAPagar;
	}
}

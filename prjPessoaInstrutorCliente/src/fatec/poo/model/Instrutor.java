package fatec.poo.model;

public class Instrutor extends Pessoa{
	private int identificacao;
	private String areaAtuacao;
	
	public Instrutor(String nome, String telefone, int identificacao, String areaAtuacao) {
		super(nome, telefone);
		this.identificacao = identificacao;
		this.areaAtuacao = areaAtuacao;
	}
	
	public void setAreaAtuacao(String areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
	}
	
	public int getIdentificacao() {
		return this.identificacao;
	}
	
	public String getAreaAtuacao() {
		return this.areaAtuacao;
	}
}

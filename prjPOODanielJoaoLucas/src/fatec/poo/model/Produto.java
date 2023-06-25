package fatec.poo.model;

public class Produto {
	private String codigo,
                       descricao,
                       unidadeMedida;
        
	private double qtdeEstoque,
                       preco,
                       estoqueMinimo;
        
	private ItemPedido itemPedido; 
	
	public Produto(String codigo, String descricao) {
            this.codigo = codigo;
            this.descricao = descricao;
	}
	
	public void setItemPedido(ItemPedido itemPedido) {
            this.itemPedido = itemPedido;
	}
	
	public void setDescricao(String descricao) {
            this.descricao = descricao;
	}

	public void setUnidadeMedida(String unidadeMedida) {
            this.unidadeMedida = unidadeMedida;
	}

	public void setQtdeEstoque(double qtdeEstoque) {
            this.qtdeEstoque = qtdeEstoque;
	}

	public void setPreco(double preco) {
            this.preco = preco;
	}

	public void setEstoqueMinimo(double estoqueMinimo) {
            this.estoqueMinimo = estoqueMinimo;
	}
	
	public String getCodigo() {
            return codigo;
	}

	public String getDescricao() {
            return descricao;
	}

	public String getUnidadeMedida() {
            return unidadeMedida;
	}

	public double getQtdeEstoque() {
		return qtdeEstoque;
	}

	public double getPreco() {
		return preco;
	}

	public double getEstoqueMinimo() {
		return estoqueMinimo;
	}	
}

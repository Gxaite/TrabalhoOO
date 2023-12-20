package oficina;

public final class  Peca extends Item{
	private String unidade;
	private String marca;

	public Peca(String descricao, int codigo, double preco, String unidade, String marca) {
		super(descricao, codigo, preco);
		this.setUnidade(unidade);
	}
	public Peca() {	
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
}


package oficina;

public class Peca extends Item{
	private String unidade;

	public Peca(String descricao, int codigo, double preco, String unidade) {
		super(descricao, codigo, preco);
		this.setUnidade(unidade);
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	
	
}

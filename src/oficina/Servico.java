package oficina;

public final class Servico extends Item {
	private int quantidadeHoras;
	

	public Servico(String descricao, int codigo, double preco, int quantidadeHoras) {
		super(descricao, codigo, preco);
		this.setQuantidadeHoras(quantidadeHoras);
	}
	public Servico() {
	}

	public int getQuantidadeHoras() {
		return quantidadeHoras;
	}

	public void setQuantidadeHoras(int quantidadeHoras) {
		this.quantidadeHoras = quantidadeHoras;
	}
	
}

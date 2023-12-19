package oficina;

public class Item {
	
	private String descricao;
	private int codigo;
	private double preco;
		
	
	public Item(String descricao, int codigo, double preco) {
		this.setDescricao(descricao);
		this.setCodigo(codigo);
		this.setPreco(preco);
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	
}

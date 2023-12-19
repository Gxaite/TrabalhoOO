package oficina;
import java.util.ArrayList;
import java.util.List;

public class Peca extends Item{
	public List<Cliente> listaPeca = new ArrayList<>();
	private String unidade;
	private String marca;

	public Peca(String descricao, int codigo, double preco, String unidade, String marca) {
		super(descricao, codigo, preco);
		this.setUnidade(unidade);
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



	/*peças iniciais
	Peca peca1 = new Peca("Óleo", 100 ,50.00, "");
	Peca peca2 = new Peca("Pneu", 102, 400.00, "");
	Peca peca3 = new Peca("Retrovisor", 104,150.00 , "");
	Peca peca4 = new Peca("Bateria", 106, 300.00, "");
	Peca peca5 = new Peca("Filtro de Ar", 108, 100.00, "");
	*/
	
	
	
}

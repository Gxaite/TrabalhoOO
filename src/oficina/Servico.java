package oficina;
import java.util.ArrayList;
import java.util.List;

public class Servico extends Item {
	public List<Servico> listaServico = new ArrayList<>();
	private int quantidadeHoras;
	

	public Servico(String descricao, int codigo, double preco, int quantidadeHoras) {
		super(descricao, codigo, preco);
		this.setQuantidadeHoras(quantidadeHoras);
	}

	public int getQuantidadeHoras() {
		return quantidadeHoras;
	}

	public void setQuantidadeHoras(int quantidadeHoras) {
		this.quantidadeHoras = quantidadeHoras;
	}
		
	/*Serviços iniciais
	Servico servico1 = new Servico("", quantidadeHoras, preco, quantidadeHoras);
	Servico servico2 = new Servico("", quantidadeHoras, preco, quantidadeHoras);
	Servico servico3 = new Servico("", quantidadeHoras, preco, quantidadeHoras);
	Servico servico4 = new Servico("", quantidadeHoras, preco, quantidadeHoras);
	Servico servico5 = new Servico("", quantidadeHoras, preco, quantidadeHoras);
	*/
}

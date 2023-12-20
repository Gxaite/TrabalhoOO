package oficina;

import java.util.ArrayList;
import java.util.List;

public class OrdemServico {
	private String dataManutencao;
	private String mecanico;
	private Cliente cliente;
	private List<Item> itens;
	private double precoOrdemServico;
	private int tempoTotalServico;
	
	public OrdemServico(String dataManutencao, String mecanico, Cliente cliente) {
		this.setCliente(cliente);
		this.setDataManutencao(dataManutencao);
		this.setMecanico(mecanico);
		this.setPrecoOrdemServico(0);
		this.itens = new ArrayList<>();
	}
	
	
	public void adicionarPeca(Item item) {
		this.itens.add(item);
		this.setPrecoOrdemServico(getPrecoOrdemServico()+item.getPreco());
	}
	
	public void adicionarServico(Item item){
		this.itens.add(item);
		this.setPrecoOrdemServico(getPrecoOrdemServico()+ item.getPreco());
		Servico s = (Servico) item;
		this.setTempoTotalServico(this.getTempoTotalServico()+s.getQuantidadeHoras());
	}
	
	public String getDataManutencao() {
		return dataManutencao;
	}
	public void setDataManutencao(String dataManutencao) {
		this.dataManutencao = dataManutencao;
	}
	public String getMecanico() {
		return mecanico;
	}
	public void setMecanico(String mecanico) {
		this.mecanico = mecanico;
	}


	public double getPrecoOrdemServico() {
		return precoOrdemServico;
	}

	public void setPrecoOrdemServico(double precoServico) {
		this.precoOrdemServico = precoServico;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public int getTempoTotalServico() {
		return tempoTotalServico;
	}


	public void setTempoTotalServico(int tempoTotalServico) {
		this.tempoTotalServico = tempoTotalServico;
	}


	public List<Item> getItens() {
		return itens;
	}


	public void setItens(List<Item> itens) {
		this.itens = itens;
	}
	
	
	
	

}

package oficina;

import java.util.ArrayList;
import java.util.List;

public class OrdemServico {
	private String dataManutencao;
	private String mecanico;
	private Cliente cliente;
	private List<Item> itens;
	private double precoOrdemServico;
	
	public OrdemServico(String dataManutencao, String mecanico, Cliente cliente) {
		this.setCliente(cliente);
		this.setDataManutencao(dataManutencao);
		this.setMecanico(mecanico);
		this.itens = new ArrayList<>();
		this.setPrecoOrdemServico(0);
	}
	
	
	public void adicionarPeca(Peca peca) {
		this.itens.add(peca);
		this.setPrecoOrdemServico(getPrecoOrdemServico()+peca.getPreco());
	}
	
	public void adicionarServico(Servico servico){
		this.itens.add(servico);
		this.setPrecoOrdemServico(getPrecoOrdemServico()+ servico.getPreco());
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
	
	
	
	

}

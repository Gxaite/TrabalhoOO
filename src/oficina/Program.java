package oficina;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {
		 List<Item> listaItens = new ArrayList<>();
		 Cliente[] cliente = new Cliente [10];
		 Veiculo[] veiculo = new Veiculo [10];
		 OrdemServico[] ordemServico = new OrdemServico[10];

		 // Adicionar objetos itens iniciais
	     listaItens.add(new Peca("Óleo", 100, 50.00, "Litro", "Shell"));
	     listaItens.add(new Peca("Pneu", 102, 400.00, "Unidade", "Goodyear"));
	     listaItens.add(new Peca("Retrovisor", 104, 150.00, "Unidade", "Bosch"));
	     listaItens.add(new Peca("Bateria", 106, 300.00, "Unidade", "Moura"));
	     listaItens.add(new Peca("Filtro de Ar", 108, 100.00, "Unidade", "Royale"));
	     listaItens.add(new Servico("Troca de óleo", 101, 50.00, 2));
	     listaItens.add(new Servico("Troca pneu", 103, 100.00, 3));
	     listaItens.add(new Servico("Troca retrovisor", 105, 200.00, 2));
	     listaItens.add(new Servico("Trocar bateria", 107, 150.00, 1));
	     listaItens.add(new Servico("Trocar filtro", 109, 75.00, 1));
	     
	     
	     //Usando o programa pela main
	     
	     	 
	     
	     veiculo[0] = new Veiculo("Fiat","Corola",1995,2005,100.00,90);	     
	     cliente[0] = new Cliente("Pedro", 123456789,veiculo[0]);
	     
	     ordemServico[0] = new OrdemServico("20/12/2024", "Robson", cliente[0], 1);
	     ordemServico[0].adicionarPeca(listaItens.get(0));
	     ordemServico[0].adicionarServico(listaItens.get(6));
	     	
	     ordemServico[0].resumoOrdemServico();
	     
	     
	     //Usando o programa com JOptionPane
	     
	     
	     
	     String nomeCliente = JOptionPane.showInputDialog("Informe o nome do cliente:");
	     String cpfCliente = JOptionPane.showInputDialog("Informe o CPF do cliente:");
	     int cpfInt = Integer.parseInt(cpfCliente);
	     String marcaVeiculo = JOptionPane.showInputDialog("Informe a marca do veiculo :");
	     String modeloVeiculo = JOptionPane.showInputDialog("Informe o modelo do veiculo :");
	     String anoFabricacao = JOptionPane.showInputDialog("Informe o ano de fabricação do veiculo :");
	     int ano = Integer.parseInt(anoFabricacao);
	     String anomodelo = JOptionPane.showInputDialog("Informe o ano do modelo do veiculo :");
	     int anom = Integer.parseInt(anomodelo);
	     String kmAtual = JOptionPane.showInputDialog("Informe a kilometragem do veiculo :");
	     double kma = Double.parseDouble(kmAtual);
	     String nivelComb = JOptionPane.showInputDialog("Informe o nível de combustível do veiculo em porcentagem:");
	     double combus = Double.parseDouble(nivelComb);	     
	     String data = JOptionPane.showInputDialog("Informe a data da manutenção:");
	     String mecanico = JOptionPane.showInputDialog("Informe o mecanico que realizou a manutenção:");
	     String numOrdem = JOptionPane.showInputDialog("Informe o número da ordem de serviço");
	     int numOrdemInt = Integer.parseInt(numOrdem);
	     
	     
	     veiculo[1] = new Veiculo(marcaVeiculo, modeloVeiculo, ano, anom, kma, combus);
	     cliente[1] = new Cliente(nomeCliente, cpfInt, veiculo[1]);
	     ordemServico[1] = new OrdemServico(data, mecanico, cliente[1],numOrdemInt);

	     
	     String[] nomesItens = new String[listaItens.size()];
	     for (int i = 0; i < listaItens.size(); i++) {
	         nomesItens[i] = listaItens.get(i).getDescricao(); 
	     }

	     Object selectedValue = JOptionPane.showInputDialog(null,
	     "Escolha um item", "Opcao",
	     JOptionPane.INFORMATION_MESSAGE, null,
	     nomesItens, nomesItens[0]);
	     
	  
	        int indiceItemSelecionado = -1;
	        for (int i = 0; i < listaItens.size(); i++) {
	            if (listaItens.get(i).getDescricao().equals(selectedValue)) {
	                indiceItemSelecionado = i;
	                break;
	            }
	        }

	        if (indiceItemSelecionado >= 0) {
	            ordemServico[1].setPrecoOrdemServico(listaItens.get(indiceItemSelecionado).getPreco());
	            if(listaItens.get(indiceItemSelecionado) instanceof Servico) {
	            	Servico servico = (Servico) listaItens.get(indiceItemSelecionado);
	            	ordemServico[1].setTempoTotalServico(servico.getQuantidadeHoras());
	            }

	        }
	     ordemServico[1].resumoOrdemServico();	    
	     
	}

}

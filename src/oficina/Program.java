package oficina;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {
		 List<Item> listaItens = new ArrayList<>();
		 List<Cliente> listaClientes = new ArrayList<>();

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
	     
	     	 
	     
	     Veiculo veiculo1 = new Veiculo("Fiat","Corola",1995,2005,100.00,90);	     
	     
	     Cliente cliente1 = new Cliente("Pedro", 123456789,veiculo1);
	     listaClientes.add(cliente1);
	     
	     OrdemServico ordemServico1 = new OrdemServico("20/12/2024", "Robson", cliente1);
	     ordemServico1.adicionarPeca(listaItens.get(0));
	     ordemServico1.adicionarServico(listaItens.get(6));
	     	
	     ordemServico1.resumoOrdemServico();
	     
	     
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
	     String nivelComb = JOptionPane.showInputDialog("Informe o nível de combustível do veiculo :");
	     double combus = Double.parseDouble(nivelComb);	     
	     String data = JOptionPane.showInputDialog("Informe a data da manutenção:");
	     String mecanico = JOptionPane.showInputDialog("Informe o mecanico que realizou a manutenção:");
	     
	     double precoCalculado = 0;
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
	            
	        	
	            
	            double preco = listaItens.get(indiceItemSelecionado).getPreco();
	            precoCalculado = preco;

	        }
	     
	    
	     Veiculo veiculo2 = new Veiculo(marcaVeiculo, modeloVeiculo, ano, anom, kma, combus);
	     Cliente cliente2 = new Cliente(nomeCliente, cpfInt, veiculo2);
	     listaClientes.add(cliente2);
	     OrdemServico ordemServico2 = new OrdemServico(data, mecanico, cliente2);
	     JOptionPane.showMessageDialog(null, cliente2.getNomeCliente()+ " " + "realizou uma manuetenção no dia" + " " + ordemServico2.getDataManutencao() + " " + "em seu veículo " + " "+ veiculo2.getMarca()+ " " 
	     + veiculo2.getModelo()+ " " + "no valor de" + " " + precoCalculado );
	    
	     
	}

}

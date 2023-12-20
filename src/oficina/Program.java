package oficina;
import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		 List<Item> listaItens = new ArrayList<>();
		 List<Cliente> listaClientes = new ArrayList<>();

		 // Adicionar objetos iniciais de Peca
	     listaItens.add(new Peca("Óleo", 100, 50.00, "Litro", "Shell"));
	     listaItens.add(new Peca("Pneu", 102, 400.00, "Unidade", "Goodyear"));
	     listaItens.add(new Peca("Retrovisor", 104, 150.00, "Unidade", "Bosch"));
	     listaItens.add(new Peca("Bateria", 106, 300.00, "Unidade", "Moura"));
	     listaItens.add(new Peca("Filtro de Ar", 108, 100.00, "Unidade", "Royale"));
	     // Adicionar objetos iniciais de Servico
	     listaItens.add(new Servico("Troca de óleo", 101, 50.00, 2));
	     listaItens.add(new Servico("Troca pneu", 103, 100.00, 3));
	     listaItens.add(new Servico("Troca retrovisor", 105, 200.00, 2));
	     listaItens.add(new Servico("Trocar bateria", 107, 150.00, 1));
	     listaItens.add(new Servico("Trocar filtro", 109, 75.00, 1));
	     
	     
	     Veiculo corsinha = new Veiculo("Ford", "Corsa", 2000, 2010, 215.5, 50);
	     Cliente pedro = new Cliente("Pedro", 123456789,corsinha);
	     listaClientes.add(pedro);
	     
	     OrdemServico ordemServico1 = new OrdemServico("20/12/2024", "Robson", pedro);
	     ordemServico1.adicionarPeca(listaItens.get(0));
	     ordemServico1.adicionarServico(listaItens.get(6));
	     System.out.println(ordemServico1.getPrecoOrdemServico());
	     
	     
	     
		
		
	}

}

package oficina;

public class Program {

	public static void main(String[] args) {
		
		//Primeiro adicioar peças e serviços ao catalogo da loja
		
		Peca carburador = new Peca("Carburador", 135, 100.00, "20 Kilos");
		Servico trocaCarburador = new Servico("Troca Carburador", 136, 250.00, 4);
		
		//Cadastro veiculo e cliente
		Veiculo corsinha = new Veiculo("Ford", "Celta", 1940, 2010, 300.50, 50.5);
		Cliente gabriel = new Cliente("Gabriel", 123456789 , corsinha);
		
		//Criação da ordem de serviço
		
		OrdemServico servico1 = new OrdemServico("25/12/2024", "Robson",gabriel);
		servico1.adicionarPeca(carburador);
		servico1.adicionarServico(trocaCarburador);
		
		System.out.println(servico1.getPrecoOrdemServico());
		
		
		
		

	}

}

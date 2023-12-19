package oficina;

import javax.swing.JOptionPane;

public class CadastroCliente {

    public static Cliente cadastrarNovoCliente() {
        String nomeCliente = JOptionPane.showInputDialog("Digite o nome do cliente:");
        int cpf = Integer.parseInt(JOptionPane.showInputDialog("Digite o CPF do cliente:"));

        // Solicitar dados do veículo
        String marcaVeiculo = JOptionPane.showInputDialog("Digite a marca do veículo:");
        String modeloVeiculo = JOptionPane.showInputDialog("Digite o modelo do veículo:");
        int anoFabricacaoVeiculo = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de fabricação do veículo:"));
        int anoModeloVeiculo = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do modelo do veículo:"));
        double kmAtualVeiculo = Double.parseDouble(JOptionPane.showInputDialog("Digite a quilometragem atual do veículo:"));
        double nivelCombustivelVeiculo = Double.parseDouble(JOptionPane.showInputDialog("Digite o nível de combustível do veículo:"));

        // Criar instância de Veiculo
        Veiculo veiculo = new Veiculo(marcaVeiculo, modeloVeiculo, anoFabricacaoVeiculo, anoModeloVeiculo, kmAtualVeiculo, nivelCombustivelVeiculo);

        // Criar instância de Cliente
        Cliente cliente = new Cliente(nomeCliente, cpf, veiculo);

        JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");

        return cliente;
    }
}
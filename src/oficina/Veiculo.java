package oficina;

public class Veiculo {
	private String marca;
	private String modelo;
	private int anoFabricacao;
	private int anoModelo;
	private double kmAtual;
	private double nivelCombustivel;
	
	
	public Veiculo (String marca, String modelo, int anoFabricacao, int anoModelo, double kmAtual, double nivelCombustivel) {
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setAnoFabricacao(anoFabricacao);
		this.setAnoModelo(anoModelo);
		this.setKmAtual(kmAtual);
		this.setNivelCombustivel(nivelCombustivel);
	}
	public Veiculo() {	
	}
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public int getAnoModelo() {
		return anoModelo;
	}
	public void setAnoModelo(int anoModelo) {
		this.anoModelo = anoModelo;
	}
	public double getKmAtual() {
		return kmAtual;
	}
	public void setKmAtual(double kmAtual) {
		this.kmAtual = kmAtual;
	}
	public double getNivelCombustivel() {
		return nivelCombustivel;
	}
	public void setNivelCombustivel(double nivelCombustivel) {
		this.nivelCombustivel = nivelCombustivel;
	}
	
	

}

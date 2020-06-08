package entities;

public class Empregado {
	private String nome; 
	private Integer hora;
	private Double valorPorHora;
	
	//CONSTRUTUOR PADR�O 
	public Empregado () {  
		
	}
	//CONSTRUTOR COM ARGUMENTOS 
	public Empregado(String nome, Integer hora, Double valorPorHora) {
		this.nome = nome;
		this.hora = hora;
		this.valorPorHora = valorPorHora;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getHora() {
		return hora;
	}
	public void setHora(Integer hora) {
		this.hora = hora;
	}
	public Double getValorPorHora() {
		return valorPorHora;
	}
	public void setValorPorHora(Double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}
	
	//M�TODO, CALCULAR VALOR POR HORA 
	public double pagamento() {
		return hora * valorPorHora;
	}
	
	
}

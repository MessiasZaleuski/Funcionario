package entities;

//SUBCLASSE DA CLASSE EMPREGADO
public class EmpregadoTerceirizado extends Empregado {
	
	//ATRIBUTO ADICIONAL
	private Double cobrancaAdicional;
	
	//CONSTRUTOR PADR�O
	public EmpregadoTerceirizado() {
		super();
		
	}

	//CONSTRUTOR COM ARGUMENTOS
	public EmpregadoTerceirizado(String nome, Integer hora, Double valorPorHora, Double cobrancaAdicional) {
		super(nome, hora, valorPorHora);
		this.cobrancaAdicional = cobrancaAdicional;
	}
	
	//ENCAPSULAMENTO
	public Double getCobrancaAdicional() {
		return cobrancaAdicional;
	}

	public void setCobrancaAdicional(Double cobrancaAdicional) {
		this.cobrancaAdicional = cobrancaAdicional;
	}
	
	/*SOBRE ESCREVE O M�TODO "PAGAMENTO" DA CLASSE EMPREGADO
	 * PORQUE O PAGAMENTO DO FUNCION�RIO TERCEIRIZADO � DIFERENTE  
	*/
	@Override 
	public double pagamento() {
		return super.pagamento() + cobrancaAdicional * 1.1;
		
	}
	  
}


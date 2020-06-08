package entities;

//SUBCLASSE DA CLASSE EMPREGADO
public class EmpregadoTerceirizado extends Empregado {
	
	//ATRIBUTO ADICIONAL
	private Double cobrancaAdicional;
	
	//CONSTRUTOR PADRÃO
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
	
	/*SOBRE ESCREVE O MÉTODO "PAGAMENTO" DA CLASSE EMPREGADO
	 * PORQUE O PAGAMENTO DO FUNCIONÁRIO TERCEIRIZADO É DIFERENTE  
	*/
	@Override 
	public double pagamento() {
		return super.pagamento() + cobrancaAdicional * 1.1;
		
	}
	  
}


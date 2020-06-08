package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Empregado;
import entities.EmpregadoTerceirizado;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in); //REALIZA LEITURA 
		
		List<Empregado> list = new ArrayList<>();//INSTÂNCIANDO UMA LISTA
		System.out.print("Entre com a quantidade de funcionario: ");
		int n = sc.nextInt(); //LÊ A QUANTIDADE DE FUNCIONÁRIO E ARMAZENA O VALOR NA VÁRIAVEL "n".
		
		for(int i=1; i<=n; i++) {//LÊ REPETINAMENTE A QUANTIDADE DE N FUNCIONARIO
			
			System.out.print("Funcionario Terceirizado? (s/n) ");
			char ch = sc.next().charAt(0);//FAZ A LEITURA DO CARACTERE "s/n"
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.println("Horas: ");
			int hora = sc.nextInt();
			
			System.out.println("Valor por hora: ");
			double valorPorHora = sc.nextDouble();
			
			if (ch == 's') {
				System.out.println("Cobrança adicional: ");
				double cobrancaAdicional = sc.nextDouble();
				list.add(new EmpregadoTerceirizado(nome, hora, valorPorHora, cobrancaAdicional));//ADICIONANDO NA LISTA
			}
			else {
				list.add(new Empregado(nome, hora, valorPorHora));
				}
			}
		System.out.println();
		System.out.println("PAGAMENTOS: ");
		for(Empregado emp : list) {
			System.out.println(emp.getNome() + ": R$ " + String.format("%.2f", emp.pagamento()));
		}
	
		sc.close();
	}

}

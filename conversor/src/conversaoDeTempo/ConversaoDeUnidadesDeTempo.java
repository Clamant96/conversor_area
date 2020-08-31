package conversaoDeTempo;

import java.util.Scanner;

public class ConversaoDeUnidadesDeTempo {
	private double valor1 = 0;
	private int opcao = 0;
	private boolean lock = false;
	
	Scanner entradaInt = new Scanner(System.in);
	
	public ConversaoDeUnidadesDeTempo() {
		
		
	}
	
	public ConversaoDeUnidadesDeTempo(double valor1, int opcao, boolean lock) {	
		this.valor1 = valor1;
		this.opcao = opcao;
		this.lock = lock;
		
	}
	
	public void setValor1(double valor1) {
		this.valor1 = valor1;
		
	}
	
	public double getValor1() {
		return this.valor1;
		
	}
	
	public void setOpcao(int opcao) {
		this.opcao = opcao;
		
	}
	
	public int getOpcao() {
		return this.opcao;
		
	}
	
	public void setLock(boolean lock) {
		this.lock = lock;
		
	}
	
	public boolean isLock() {
		return this.lock;
		
	}
	
	public static double minuto(double valor1) {
		//1 minuto = 60 segundos
		
		valor1 = valor1 * 60;
		return valor1;
		
	}
	
	public static double hora(double valor1) {
		//1 hora = 60 minutos
		
		valor1 = valor1 * 60; 
		return valor1;
		
	}
	
	public static double dia(double valor1) {
		//1	dia = 24 horas
		
		valor1 = valor1 * 24;
		return valor1;
		
	}
	
	public static double semana(double valor1) {
		//1	semana = 7 dias
		
		valor1 = valor1 * 7;
		return valor1;
		
	}
	
	public static double mes(double valor1) {
		//1 mês = 30 dias	
		
		valor1 = valor1 * 30;
		return valor1;
		
	}
	
	public static double ano(double valor1) {
		//1 ano = 365.25 dias	
		
		valor1 = valor1 * 365.25;
		return valor1;
		
	}
	
	//OPCOES MENU
	public void opcoesMenu() {
		System.out.println("\n1 | MINUTOS PARA SEGUNDOS");
		System.out.println("2 | HORAS PARA MINUTOS");
		System.out.println("3 | DIAS PARA HORAS");
		System.out.println("4 | SEMANAS PARA DIAS");
		System.out.println("5 | MES PARA DIAS");
		System.out.println("6 | ANOS PARA DIAS");
		System.out.println("0 | SAIR\n");
		System.out.print("==> ");
		setOpcao(entradaInt.nextInt());
		
	}
	
	//MENU
	public void menu() {
		do {
			System.out.println("Conversor de tempo\n");
			
			System.out.println("Escolha umas das convesoes abaixo: ");
			
			opcoesMenu();
			
			switch(getOpcao()) {
			case 1:
				System.out.println("MENU | MINUTOS PARA SEGUNDOS");
				
				System.out.print("Minutos: ");
				setValor1(entradaInt.nextDouble());
				
				System.out.println("Minutos: "+ getValor1() +" para Segundos: "+ ConversaoDeUnidadesDeTempo.minuto(getValor1()));
				
			break;
			
			case 2:
				System.out.println("MENU | HORAS PARA MINUTOS");

				System.out.print("Horas: ");
				setValor1(entradaInt.nextDouble());
				
				System.out.println("Horas: "+ getValor1() +" para Minutos: "+ ConversaoDeUnidadesDeTempo.hora(getValor1()));
				
			break;
			
			case 3:
				System.out.println("MENU | DIAS PARA HORAS");
				
				System.out.print("Dias: ");
				setValor1(entradaInt.nextDouble());
				
				System.out.println("Dias: "+ getValor1() +" para Horas: "+ ConversaoDeUnidadesDeTempo.dia(getValor1()));
				
			break;
				
			case 4:
				System.out.println("MENU | SEMANAS PARA DIAS");

				System.out.print("Semanas: ");
				setValor1(entradaInt.nextDouble());
				
				System.out.println("Semanas: "+ getValor1() +" para Dias: "+ ConversaoDeUnidadesDeTempo.semana(getValor1()));
				
			break;
			
			case 5:
				System.out.println("MENU | MES PARA DIAS");

				System.out.print("Mes: ");
				setValor1(entradaInt.nextDouble());
				
				System.out.println("Mes: "+ getValor1() +" para Dias: "+ ConversaoDeUnidadesDeTempo.mes(getValor1()));
				
			break;
			
			case 6:
				System.out.println("MENU | ANOS PARA DIAS");

				System.out.print("Anos: ");
				setValor1(entradaInt.nextDouble());
				
				System.out.println("Anos: "+ getValor1() +" para Dias: "+ ConversaoDeUnidadesDeTempo.ano(getValor1()));
				
			break;
			
			case 0:
				System.out.println("Sair!");
				setLock(true);
				
			break;
			
			default:
				System.out.println("Opcao invalida, tente novamente.");
				
			break;
		
			}
			
		}while(isLock() == false);
		
	}

}

package conversorDeVolume;

import java.util.Scanner;

public class ConversaoDeUnidadesDeVolume {
	private double valor1 = 0;
	private int opcao = 0;
	private boolean lock = false;
	
	Scanner entradaInt = new Scanner(System.in);
	
	public ConversaoDeUnidadesDeVolume() {
		
		
	}
	
	public ConversaoDeUnidadesDeVolume(double valor1, int opcao, boolean lock) {	
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
	
	public static double litro(double valor1) {
		//1 litro = 1000 centímetros cúbicos
		
		valor1 = valor1 * 1000;
		return valor1;
		
	}
	
	public static double metroCubico(double valor1) {
		//1	metro cúbico = 1000 litros
		
		valor1 = valor1 * 1000; 
		return valor1;
		
	}
	
	public static double metroCubico2(double valor1) {
		//1	metro cúbico = 35.32 pés cúbicos
		
		valor1 = valor1 * 35.32;
		return valor1;
		
	}
	
	public static double galaoAmericano(double valor1) {
		//1 galão americano = 231 polegadas cúbicas
		
		valor1 = valor1 * 231;
		return valor1;
		
	}
	
	public static double galaoAmericano2(double valor1) {
		//1 galão americano = 3.785 litros	
		
		valor1 = valor1 * 3785;
		return valor1;
		
	}
	
	//OPCOES MENU
	public void opcoesMenu() {
		System.out.println("\n1 | LITROS PARA CENTIMETROS CUBICOS");
		System.out.println("2 | METROS CUBICOS PARA LITROS");
		System.out.println("3 | METROS CUBICOS PARA PES CUBICOS");
		System.out.println("4 | GALAO AMERICANO PARA POLEGADAS CUBICAS");
		System.out.println("5 | GALAO AMERICANO PARA LITROS");
		System.out.println("0 | SAIR\n");
		System.out.print("==> ");
		setOpcao(entradaInt.nextInt());
		
	}
	
	//MENU
	public void menu() {
		do {
			System.out.println("Conversor de area\n");
			
			System.out.println("Escolha umas das convesoes abaixo: ");
			
			opcoesMenu();
			
			switch(getOpcao()) {
			case 1:
				System.out.println("MENU | Litros para Centimetros Cubicos");
				
				System.out.print("Litros: ");
				setValor1(entradaInt.nextDouble());
				
				System.out.println("Litros: "+ getValor1() +" para Centimetos Cubicos: "+ ConversaoDeUnidadesDeVolume.litro(getValor1()));
				
			break;
			
			case 2:
				System.out.println("MENU | Metros Cubicos para Litros");

				System.out.print("Metros Cubicos: ");
				setValor1(entradaInt.nextDouble());
				
				System.out.println("Metros Cubicos: "+ getValor1() +" para Litros: "+ ConversaoDeUnidadesDeVolume.metroCubico(getValor1()));
				
			break;
			
			case 3:
				System.out.println("MENU | Metros Cubicos para Pes Cubicos");
				
				System.out.print("Metros Cubicos: ");
				setValor1(entradaInt.nextDouble());
				
				System.out.println("Metros Cubicos: "+ getValor1() +" para Pes Cubicos: "+ ConversaoDeUnidadesDeVolume.metroCubico2(getValor1()));
				
			break;
				
			case 4:
				System.out.println("MENU | Galao Americano para Polegadas Cubicas");

				System.out.print("Galao Americano: ");
				setValor1(entradaInt.nextDouble());
				
				System.out.println("Galao Americano: "+ getValor1() +" para Polegadas Cubicas: "+ ConversaoDeUnidadesDeVolume.galaoAmericano(getValor1()));
				
			break;
			
			case 5:
				System.out.println("MENU | Galao Americano para Litros");

				System.out.print("Galao Americano: ");
				setValor1(entradaInt.nextDouble());
				
				System.out.println("Galao Americano: "+ getValor1() +" para Litros: "+ ConversaoDeUnidadesDeVolume.galaoAmericano2(getValor1()));
				
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

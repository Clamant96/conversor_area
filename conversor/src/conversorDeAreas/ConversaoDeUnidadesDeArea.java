package conversorDeAreas;

import java.util.Scanner;

public class ConversaoDeUnidadesDeArea {
	private double valor1 = 0;
	private int opcao = 0;
	private boolean lock = false;
	
	Scanner entradaInt = new Scanner(System.in);
	
	public ConversaoDeUnidadesDeArea() {
		
		
	}
	
	public ConversaoDeUnidadesDeArea(double valor1, int opcao, boolean lock) {
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
	
	public static double metro(double valor1) {
		//1	metro quadrado = 10.76 pés quadrados
		
		valor1 = valor1 * 10.76;
		return valor1;
		
	}
	
	public static double pe(double valor1) {
		//1 pé quadrado = 929 centímetros quadrados
		
		valor1 = valor1 * 929; 
		return valor1;
		
	}
	
	public static double milha(double valor1) {
		//1 milha quadrada = 640 acres
		
		valor1 = valor1 * 640;
		return valor1;
		
	}
	
	public static double acre(double valor1) {
		//1 acre = 43.560 pés quadrados
		
		valor1 = valor1 * 43560;
		return valor1;
		
	}
	
	//OPCOES MENU
	public void opcoesMenu() {
		System.out.println("\n1 | METROS PARA PES");
		System.out.println("2 | PES PARA CENTIMETROS");
		System.out.println("3 | MILHAS PARA ACRES");
		System.out.println("4 | ACRES PARA PES");
		System.out.println("0 | SAIR\n");
		System.out.print("==> ");
		setOpcao(entradaInt.nextInt());
		
	}
	
	//MENU
	public void menu() {
		do {
			System.out.println("Conversor de area\n");
			
			System.out.println("Digite um valor para ser convertido: ");
			System.out.println("0 | Sair do conversor");
			
			System.out.print("==> ");
			setValor1(entradaInt.nextDouble());
			
			//VALIDADOR DE INPUT
			if(getValor1() == 0) {
				System.out.println("Sair!");
				setLock(true);
				
			}else {
				opcoesMenu();
				
				switch(getOpcao()) {
				case 1:
					System.out.println("MENU | Conversor metros");
					System.out.println(ConversaoDeUnidadesDeArea.metro(getValor1()));
					
				break;
				
				case 2:
					System.out.println("MENU | Conversor pes");
					System.out.println(ConversaoDeUnidadesDeArea.pe(getValor1()));
					
				break;
				
				case 3:
					System.out.println("MENU | Conversor milhas");
					System.out.println(ConversaoDeUnidadesDeArea.milha(getValor1()));
					
				break;
					
				case 4:
					System.out.println("MENU | Conversor acre");
					System.out.println(ConversaoDeUnidadesDeArea.acre(getValor1()));
					
				break;
				
				case 0:
					System.out.println("Sair!");
					setLock(true);
					
				break;
				
				default:
					System.out.println("Opcao invalida, tente novamente.");
					
				break;
			
				}
				
			}
			
		}while(isLock() == false);
		
	}

}

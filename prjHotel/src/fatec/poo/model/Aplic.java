package fatec.poo.model;

import java.util.Scanner;
import fatec.poo.model.*;

public class Aplic {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		for(int i = 1; i<5; i++) {
			System.out.print("Digite o numero do " +i+ "° quarto:");
			int numQuarto = scan.nextInt();
			System.out.print("\nDigite o valor da diaria do " +i+ "° quarto:");
			double valorDiaria = scan.nextDouble();
			
			
			QuartoHotel quarto[i] = new QuartoHotel(numQuarto, valorDiaria);
		}
		
		int res
		
		do {
			System.out.print("1 - Conultar quarto\n"
					+ "2 - Reservar quarto\n"
					+ "3 - Liberar quarto\n"
					+ "4 - Consultar faturamento quarto\n"
					+ "5 - Consultar faturamento hotel\n"
					+ "6 - Sair\n\n"
					+ "    Digite a opção:");
			res = scan.nextInt();
			
			switch(res) {
			case 1:
				System.out.print("Digite o numero do quarto");
				break;
			}
			
		}while(res != 6);
		

	}

}

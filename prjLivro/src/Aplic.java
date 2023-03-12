import java.util.Scanner;
import fatec.poo.model.Livro;
public class Aplic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner
		Scanner scanner = new Scanner(System.in);
		//Livro
		Livro livro = new Livro();
		
		livro.SetId(1);
		livro.MultaDiaria(2.5);
		
		int res;
		
		do {
			//menu
			System.out.println("1-Consultar livro\n2-Emprestar livro\n3-Devolver livro\n4-Sair\n\nDigite a opção:");
			res = scanner.nextInt();		

			switch(res) {
			case 1: 
				System.out.println(livro.GetSituacao(1) ? "\n\nEmprestado\n\n" : "\n\nDisponivel\n\n");
				break;
			case 2:
				livro.Emprestar();
				break;
			case 3:
				if(livro.GetSituacao(1)) {
					System.out.println("Dias de atraso: ");
					int diasAtrasados = scanner.nextInt();					
					System.out.println("Valor a ser pago: " + livro.Devolver(diasAtrasados));
				}
				else {
					System.out.println("Livro não esta emprestado");
				}
				break;				
			}
		}while(res != 4);
	}

}

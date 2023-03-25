import java.text.DecimalFormat;
import java.util.Scanner;
import fatec.poo.model.Circulo;

public class Aplic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double raio;
		
        Circulo circulo[] = new Circulo[11];
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        for(int i = 0; i < 10; i++) {	        
	        System.out.print("Digite o raio do " + (i+1) +"° circulo: ");
	        raio = scanner.nextDouble();
	        
	        circulo[i] = new Circulo(raio);
        }
        
        for(int i = 0; i < 10; i++) {
	        System.out.println("\nArea: " + df.format(circulo[i].calcArea()));
	        System.out.println("Perimetro: " + df.format(circulo[i].calcPerimetro()));
	        System.out.println("Diametro: " + df.format(circulo[i].calcDiametro()));
        }
	}

}

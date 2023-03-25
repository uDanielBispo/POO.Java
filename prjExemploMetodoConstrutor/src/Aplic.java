
import fatec.poo.model.Retangulo;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Dimas
 */
public class Aplic {
    public static void main(String[] args) {
        double medAlt, medBase;
        int opcao;
        String unidade;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a unidade de medida: ");
        unidade = entrada.next();
        
        //instanciação(alocação) de um objeto da classe Retangulo
        //e chamada do método construtor
        Retangulo objRet = new Retangulo(unidade);
        
        System.out.print("Digite a medida da altura: ");
        medAlt = entrada.nextDouble();
        System.out.print("Digite a medida da base: ");
        medBase = entrada.nextDouble();
        
        //Utilizando a passagem de mensagens
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);
        
        do{
             System.out.println("\n1 - Consultar Área");
             System.out.println("2 - Consultar Perímetro");
             System.out.println("3 - Consultar Diagonal");
             System.out.println("4 - Sair");
             System.out.print("\n\tDigite a opcao: ");
             opcao = entrada.nextInt();
             
             System.out.println("\n\nMedida da Altura: " + objRet.getAltura());
             System.out.println("Medida da Base: " + objRet.getBase());
             switch(opcao){ //passagem de mensagens
                 case 1 : System.out.println("A medida da área: " + objRet.calcArea());
                          break;
                 case 2 : System.out.println("A medida do perímetro: " + objRet.calcPerimetro());
                          break;
                 case 3 : System.out.println("A medida da diagonal: " + objRet.calcDiagonal());
             }
        }while (opcao < 4);
    }    
}

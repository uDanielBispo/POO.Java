import fatec.poo.model.*;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * @author 0030482123005
 */
public class Aplic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Horista horista = new Horista(15, 160, 1, "Daniel", "04/02/2003");
        Mensalista mensalista = new Mensalista(1000, 2, 1, "Bispo", "09/09/1999");
        FuncionarioComissionado vendedor = new FuncionarioComissionado(3, "Lindomar", "09/09/1945", 1500, 10, 7);
        
        horista.setCargo("Programador");
        mensalista.setCargo("Aux. Administrativo");
        vendedor.setCargo("Vendedor");
        
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        
        System.out.println("HORISTA:"
                            +"\nValor hora:"+horista.getValHorTrab()+
                            "\nHoras trabalhadas:"+horista.getQtdeHorTrab()+
                            "\nValor do salario bruto: "+df.format(horista.calcSalBruto())+
                            "\nValor do desconto: "+df.format(horista.calcDesconto())+
                            "\nValor do salario liquido: "+df.format(horista.calcSalLiquido())+
                            "\nCargo: "+horista.getCargo()+
                            "\nCalculo da Gratificação: " + df.format(horista.calcGratificacao()));
        
        System.out.println("\nMENSALISTA:"
                            +"\nValor do salario bruto: "+df.format(vendedor.calcSalBruto())+
                            "\nValor do desconto: "+df.format(vendedor.calcDesconto())+
                            "\nValor do salario liquido: "+df.format(vendedor.calcSalLiquido())+
                            "\nCargo: "+vendedor.getCargo()+
                            "\nCargo: "+vendedor.getCargo());
        
        
    }
    
}

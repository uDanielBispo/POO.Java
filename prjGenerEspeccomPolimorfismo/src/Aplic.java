import fatec.poo.model.*;
import java.text.DecimalFormat;
/**
 * @author 0030482123005
 */
public class Aplic {
    public static void main(String[] args) {
        Horista horista = new Horista(15, 160, 1, "Daniel", "04/02/2003");
        Mensalista mensalista = new Mensalista(1000, 2, 1, "Bispo", "09/09/1999");
        
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        System.out.println("Valor hora:"+horista.getValHorTrab()+
                            "\nHoras trabalhadas:"+horista.getQtdeHorTrab()+
                            "\nValor do salario bruto: "+df.format(horista.calcSalBruto())+
                            "\nValor do desconto: "+df.format(horista.calcDesconto())+
                            "\nValor do salario liquido: "+df.format(horista.calcSalLiquido()));
        
        System.out.println("\nValor do salario bruto: "+df.format(mensalista.calcSalBruto())+
                            "\nValor do desconto: "+df.format(mensalista.calcDesconto())+
                            "\nValor do salario liquido: "+df.format(mensalista.calcSalLiquido()));
    }
    
}


import fatec.poo.model.Aluno;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Aplic {
    public static void main(String[] args) {
    	
        Scanner entrada = new Scanner(System.in);
        Aluno objAluno = new Aluno();        
  	
        int res;
        do {
        	System.out.println("1- RA\n2- P1\n3- P2\n4- T1\n5- T2");
	        res = entrada.nextInt();
	        
	        switch (res){
	        case 1:	System.out.print("Digite o número do seu RA: ");
	        		objAluno.setRA(entrada.nextInt());
	        	break;
	        case 2: System.out.print("Digite a nota da primeira prova: ");
	        		objAluno.setPrv1(entrada.nextDouble());
	        	break;
	        case 3: System.out.print("Digite a nota da segunda prova: ");
	        		objAluno.setPrv2(entrada.nextDouble());
	        	break;
	        case 4: System.out.print("Digite a nota do primeiro trabalho: ");
	        		objAluno.setTrab1(entrada.nextDouble());
	        	break;
	        case 5: System.out.print("Digite a nota do segundo trabalho: ");
	        		objAluno.setTrab2(entrada.nextDouble()); 
	        	break;
	        }
        }while(res < 6 && res > 0);        
        
        System.out.println("\nRA: " + objAluno.getRA());
        
        System.out.println("\nNota da primeira prova: " + objAluno.getPrv1());
        System.out.println("Nota da segunda prova: " + objAluno.getPrv2());
        System.out.println("Nota do primeiro trabalho: " + objAluno.getTrab1());
        System.out.println("Nota do segundo trabalho: " + objAluno.getTrab2());        
        System.out.println("\nMédia das provas: " + objAluno.calcMediaProva());
        System.out.println("\nMédia dos trabalhos: " + objAluno.calcMediaTrab());
        System.out.println("\nMédia final: " + objAluno.calcMediaFinal(objAluno.calcMediaProva(),objAluno.calcMediaTrab()));   
    
        System.out.println((objAluno.calcMediaFinal(objAluno.calcMediaProva(), objAluno.calcMediaTrab()) >= 6) ? "Aprovado" : "Reprovado");
    } 
}

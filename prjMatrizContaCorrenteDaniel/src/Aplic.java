
import java.util.Scanner;
import fatec.poo.model.ContaCorrente;
import java.util.Arrays;

/* @author 0030482123005 */

public class Aplic {
    public static void main(String[] args) {
        
        //Variaveis globais
        int res, num, nContas = 5;
        double saldo;        
        int[] vetorNumContas = new int[nContas];
        
        Scanner scanner = new Scanner(System.in);
        ContaCorrente contaCorrente[] = new ContaCorrente[nContas];        
        
        for(int i=0 ; i < contaCorrente.length; i++){
            
            boolean avisoContaExistente = false;
            
            System.out.println("============================================");
            System.out.print("Digite o numero da "+(i+1)+"ª conta: ");
            
            num = scanner.nextInt();            
            
            //Procura por um numero ja existente
            for(int z = 0; z < vetorNumContas.length; z++){
                if(vetorNumContas[z] == num){
                    avisoContaExistente = true;
                    break;
                }
            }
            
            if(avisoContaExistente){
                System.out.println("Uma conta com esse numero ja existe\n");
                i--;
                continue;
            }
            
            System.out.print("Digite o saldo: ");
            
            saldo = scanner.nextDouble();
            
            contaCorrente[i] = new ContaCorrente(num, saldo);
            //Armazena o numero da conta que acabou de ser criada em um array
            vetorNumContas[i] = contaCorrente[i].getNum();         
        }
        
        do{
            System.out.println("===================Menu=====================");
            System.out.println("1- Sacar\n2- Depositar\n3- Consultar Saldo\n4- Listar Contas");
            System.out.println("============================================");
            
            res = scanner.nextInt();
            
            switch (res){
                case 1: 
                    double saque;
                    
                    System.out.println("===================Sacar===================");
                    System.out.print("Digite o numero da conta: ");
                    
                    num = scanner.nextInt();
                    
                    for(int i=0; i < contaCorrente.length; i++){
                        
                        if(contaCorrente[i].getNum() == num){
                            System.out.println("Digite o valor do saque: ");
                            saque = scanner.nextDouble();
                            
                            if(saque <= contaCorrente[i].getSaldo())contaCorrente[i].sacar(saque);                            
                            else
                                System.out.println("Saldo indisponivel para este saque.");  
                            break;
                        }
                        System.out.println("============================================");
                        
                        if(i == contaCorrente.length-1)System.out.println("Conta não encontrada");
                        
                        System.out.println("============================================");
                    }
                    
                    
                    
                    break;
                    
                case 2:           
                    System.out.println("=================Depositar===================");
                    System.out.println("Digite o numero da conta: ");
                    System.out.println("=============================================");
                    
                    num = scanner.nextInt();                    
                    
                    for(int i=0; i < contaCorrente.length; i++){
                        
                        if(contaCorrente[i].getNum() == num){
                            System.out.println("Digite o valor do deposito: ");
                            contaCorrente[i].depositar(scanner.nextDouble());                            
                            break;
                        }
                        if(i == contaCorrente.length-1) System.out.println("Conta não encontrada");                        
                    }                    
                    break;
                    
                case 3:
                    System.out.println("===================Consultar=================");
                    System.out.println("Digite o numero da conta: ");
                    
                    num = scanner.nextInt();
                    
                    for(int i=0; i < contaCorrente.length; i++){
                        if(contaCorrente[i].getNum() == num){
                            System.out.println("Numero da conta: " + contaCorrente[i].getNum());
                            System.out.println("Numero do saldo: " + contaCorrente[i].getSaldo());
                            System.out.println("============================================");
                            break;
                        }      
                        else if(i == contaCorrente.length-1) System.out.println("Conta não encontrada");                       
                    }                    
                    break;
                    
                case 4:
                    for(int i=0; i<contaCorrente.length; i++){
                        System.out.println("============================================");
                        System.out.println("\nConta "+ (i+1) + " Numero da conta: "+ contaCorrente[i].getNum() + " saldo: "+contaCorrente[i].getSaldo());
                    }
                    break;
            }
        }while(res<=4);
        //System.out.print(Arrays.toString(vetorNumContas));
    }
}
    

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import Fatec.poo.model.ContaCorrente;
/**
 *
 * @author 0030482123005
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int res, num;
        double saldo;
        //ContaCorrente contaCorrente = new ContaCorrente(0, 0);
        
        System.out.print("Digite o numero: ");
        num = scanner.nextInt();
        System.out.print("Digite o saldo: ");
        saldo = scanner.nextDouble();
        ContaCorrente contaCorrente = new ContaCorrente(num, saldo);
        
        do{
            System.out.println("\n\n1- Sacar\n2- Depositar\n3- Sair");
            res = scanner.nextInt();
            switch (res){
                case 1: 
                    System.out.print("Digite o valor do saque: ");
                    System.out.println("Valor atual: " + "R$" + contaCorrente.sacar(scanner.nextDouble()));
                    break;
                    
                case 2:
                    System.out.print("Digite o valor do deposito: ");
                    System.out.println("Valor atual: " + "R$" + contaCorrente.depositar(scanner.nextDouble()));
                    break;            
            }
        }while(res<3);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import fatec.poo.model.Retangulo;
/**
 *
 * @author 0030482123005
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double medAlt, medBase;
        
        Scanner scanner = new Scanner(System.in);
        Retangulo objRet = new Retangulo();
        
        System.out.print("Digite a altura: ");
        medAlt = scanner.nextDouble();
        System.out.print("Digite a base: ");
        medBase = scanner.nextDouble();
        
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);
        
        System.out.println("A altura é: "+ objRet.getAltura());
        System.out.println("A base é: "+ objRet.getBase());
        System.out.println("A area é: "+ objRet.calcArea());
        System.out.println("O Perimetro é: "+ objRet.calcPerimetro());
        System.out.println("A diagonal é: "+ String.format("%.2f", objRet.calcDiagonal()));
    }
    
}

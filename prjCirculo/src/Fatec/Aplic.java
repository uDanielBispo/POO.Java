/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fatec;
import Poo.model.*;
import java.util.Scanner;
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
        double raio;
        Circulo circulo = new Circulo();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o raio: ");
        raio = scanner.nextDouble();
        
        circulo.setRaio(raio);
        
        System.out.println("Get: " + circulo.getRaio());
        System.out.println("Area: " + circulo.calcArea());
        System.out.println("Perimetro: " + circulo.calcPerimetro());
        System.out.println("Diametro: " + circulo.calcDiametro());
    }
    
}


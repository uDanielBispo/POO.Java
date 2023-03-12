/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poo.model;

import java.math.*;
/**
 *
 * @author 0030482123005
 */
public class Circulo {
    double raio;
    double pi = Math.PI;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public  double calcArea(){
        return pi*Math.pow(raio, raio);
    }
    
    public double calcPerimetro(){
        return 2*pi*raio;
    }
    
    public double calcDiametro(){
        return 2*raio;
    }    
}

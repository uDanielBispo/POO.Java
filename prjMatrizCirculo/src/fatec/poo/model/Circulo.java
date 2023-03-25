package fatec.poo.model;

public class Circulo {
	double raio;
    double pi = Math.PI;

    public Circulo(double raio) {
    	this.raio = raio;
    }
    
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

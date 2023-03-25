package fatec.poo.model;

/**
 *
 * @author Lucas
 */
public class Aluno {
    
    private int RA;
    private double Prv1;
    private double Prv2;
    private double Trab1;
    private double Trab2;

    public int getRA() {
        return RA;
    }

    public void setRA(int RA) {
        this.RA = RA;
    }

    public double getPrv1() {
        return Prv1;
    }

    public void setPrv1(double Prv1) {
        this.Prv1 = Prv1;
    }

    public double getPrv2() {
        return Prv2;
    }

    public void setPrv2(double Prv2) {
        this.Prv2 = Prv2;
    }

    public double getTrab1() {
        return Trab1;
    }

    public void setTrab1(double Trab1) {
        this.Trab1 = Trab1;
    }

    public double getTrab2() {
        return Trab2;
    }

    public void setTrab2(double Trab2) {
        this.Trab2 = Trab2;
    }
    
    public double calcMediaProva(){
        return 0.75 * ((Prv1 + (2 * Prv2)) / 3);
    }

    public double calcMediaTrab(){
        return 0.25 * ((Trab1 + Trab2) / 2);
    }
    
    public double calcMediaFinal(double calcMediaProva, double calcMediaTrab){
        return(calcMediaProva + calcMediaTrab);
    }    
    
}

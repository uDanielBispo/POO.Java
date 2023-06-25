
package fatec.poo.model;
/**
 *
 * @author 
 */
public class Departamento {
    private String sigla;
    private String nome;
    private Funcionario[] funcionarios;
    private int numFunc;
    
    public Departamento(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
        this.funcionarios  = new Funcionario[10];
        numFunc = 0;
    }
    
    public void addFuncionario(Funcionario f){
        funcionarios[numFunc] = f;
        numFunc++;
    }
    
    public void listarFuncionarios(){
        System.out.println("\n\nSigla: "+sigla+""
                            + "\nNome:"+nome+""
                                    + "\nNumFunc: "+numFunc+"\n");
        
        System.out.println("Registro\t\tNome\t\tCargo");
        for(int i=0; i < numFunc; i++){
            System.out.print(funcionarios[i].getRegistro()+"\t\t");
            System.out.print(funcionarios[i].getNome()+"\t\t");
            System.out.print(funcionarios[i].getCargo()+"\t\t\n");
        }
    }
    
    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }    
    
}

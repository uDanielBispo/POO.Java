
package fatec.poo.model;

/**
 *
 * @author Dimas
 */
public class Departamento {
    private String sigla;
    private String nome;
    private FuncionarioMensalista funcMen;

    public Departamento(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public FuncionarioMensalista getFuncMen() {
        return funcMen;
    }

    public void setFuncMen(FuncionarioMensalista funcMen) {
        this.funcMen = funcMen;
    }
    
}

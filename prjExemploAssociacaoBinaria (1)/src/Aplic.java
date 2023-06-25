import fatec.poo.model.*;
import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;

/**
 *
 * @author Dimas
 */
public class Aplic {
    public static void main(String[] args) {
        FuncionarioHorista funcHor  = new FuncionarioHorista(1010,
                                                             "Pedro Silveira",
                                                             "14/05/78",
                                                             15.80);
        
        funcHor.setCargo("Programador");
        
        FuncionarioMensalista funcMen  = new FuncionarioMensalista(2020,
                                                                   "Ana Beatriz",
                                                                   "22/07/88",
                                                                   600);
        
        funcMen.setCargo("Aux. Administrativo");
        
        FuncionarioComissionado funcCom = new FuncionarioComissionado(3030, 
                                                                     "Joao Mendes",
                                                                     "10/12/1975",
                                                                     10);
        funcCom.setCargo("Vendedor");
       
        //Instanciação de objetos da 
        //classe Departamento  
        Departamento objDep1 = new Departamento("RH", "Recursos Humanos");
        Departamento objDep2 = new Departamento("VD", "Vendas");
	  
        //Instanciação de objetos da classe Projeto
        Projeto projetoVendas = new Projeto(1, "Vendas Turbo", "21-02-2010", "21-12-2010");
        Projeto projetoRH = new Projeto(2, "Recursos Desumanos", "22-03-2020", "21-01-2021");
        
        //Estabelecendo a associação binária entre 1
        //objeto da classe FuncionarioHorista com
        //1 objeto da classe Departamento
        funcHor.setDepartamento(objDep1);
        
        System.out.println("O Funcionario horista: "+ funcHor.getNome()
                            +"\nTrabalha no departamento: "+ funcHor.getDepartamento().getNome());
       
        //Estabelecendo a associação binária entre 1
        //objeto da classe FuncionarioMensalista com
        //1 objeto da classe Departamento
        funcMen.setDepartamento(objDep1);
        System.out.println("\nO Funcionario mensalista: "+ funcMen.getNome()
                            +"\nTrabalha no departamento: "+ funcMen.getDepartamento().getNome());
       
        //Estabelecendo a associação binária entre 1
        //objeto da classe FuncionarioComissionado com
        //1 objeto da classe Departamento       
        funcCom.setDepartamento(objDep2);
        System.out.println("\nO Funcionario comissionado: "+ funcCom.getNome()
                            +"\nTrabalha no departamento: "+ funcCom.getDepartamento().getNome());

       //Estabelecendo a associação binária entre um
       //objeto da classe Departamento com 1 ou mais (1..*)
       //objetos da classe FuncionarioHorista, FuncionarioMensalista
       //e FuncionarioComissionado  
       objDep1.addFuncionario(funcHor);
       objDep1.addFuncionario(funcMen);
 
       objDep2.addFuncionario(funcCom);
       
       objDep1.listarFuncionarios();
       objDep2.listarFuncionarios();
       
       //adicionando funcionarios ao projeto
       projetoVendas.addFuncionario(funcCom);
       projetoVendas.addFuncionario(funcHor);
       
       projetoRH.addFuncionario(funcMen);
       
       projetoVendas.listarFuncionarios();
       projetoRH.listarFuncionarios();
    }    
}

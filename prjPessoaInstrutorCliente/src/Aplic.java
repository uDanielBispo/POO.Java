import fatec.poo.model.*;
import java.util.Scanner;
public class Aplic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa objPessoa = new Pessoa("Daniel", "123");
		Cliente objCliente = new Cliente("Cleber", "124", "100", 80, 1.80);
		Instrutor objInstrutor = new Instrutor("Jailson", "125", 1, "Educação Fisica");
		
		System.out.println("Pessoa:\nnome: " + objPessoa.getNome() + "\nTelefone: " + objPessoa.getTelefone());
		
		System.out.println("==========================================================================");
		
		System.out.println("Instrutor:\nnome: " + objInstrutor.getNome() + "\nTelefone: " + objInstrutor.getTelefone()+
				"\nIdentificação: "+ objInstrutor.getIdentificacao()+"\nArea de atuação: "+objInstrutor.getAreaAtuacao());
		
		System.out.println("==========================================================================");
		
		System.out.println("Cliente:\nnome: " + objCliente.getNome() + "\nTelefone: " + objCliente.getTelefone()+
				"\nCpf: "+ objCliente.getCpf()+"\nPeso: "+objCliente.getPeso() + "\nAltura "+objCliente.getAltura());
	}

}

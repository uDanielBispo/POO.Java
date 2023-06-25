package fatec.poo.model;

public class Pessoa {
	private String cpf;
	private String nome;
	private String endereco, cidade, uf, cep, ddd;
	private String telefone;
	
	public Pessoa(String cpf, String nome) {
		this.nome = nome;
		this.cpf = cpf;
	}
        
        public boolean validarCpf(String cpf){
            //acumilador alg1, alg2 e resto
            int acumuladora1 = 0, acumuladora2 = 0, verificador1, verificador2;

                        

            cpf = cpf.replace(".", "");
            cpf = cpf.replace("-", "");
            
            cpf.toCharArray();
            
            //valida numeros repetidos [111.111.111-11]
                if(Character.getNumericValue(cpf.charAt(0)) == Character.getNumericValue(cpf.charAt(1)) &&
                        Character.getNumericValue(cpf.charAt(2)) == Character.getNumericValue(cpf.charAt(3)) &&
                        Character.getNumericValue(cpf.charAt(4)) == Character.getNumericValue(cpf.charAt(5)) &&
                        Character.getNumericValue(cpf.charAt(6)) == Character.getNumericValue(cpf.charAt(7)) &&
                        Character.getNumericValue(cpf.charAt(8)) == Character.getNumericValue(cpf.charAt(9)))
                            return false;
            
                //primeiro digito
            for(int i = 0; i < (cpf.length()-2); i++)
                acumuladora1 += Character.getNumericValue(cpf.charAt(i)) * (i+1);
            
            verificador1 = acumuladora1 % 11;
            
            if(verificador1 > 0 && verificador1 < 11){
                if(verificador1 == 10) verificador1 = 0;               
                
                //segundo digito 
                for(int i = 11, z = 0; i >= 2; i--, z++)
                    if(i != 2) 
                        acumuladora2 += Character.getNumericValue(cpf.charAt(z)) * i;
                    else
                        acumuladora2 += verificador1 * i;
                
                
                verificador2 = (acumuladora2 * 10) % 11;
                
                if(verificador2 > 0 && verificador2 < 11){
                    if(verificador2 == 10) verificador2 = 0;
                                                          
                    if(Character.getNumericValue(cpf.charAt(9)) == verificador1 &&
                        Character.getNumericValue(cpf.charAt(10)) == verificador2)
                                return true;
                }
            }
            return false;
        }
        
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public String getNome() {
		return nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public String getCidade() {
		return cidade;
	}
	public String getUf() {
		return uf;
	}
	public String getCep() {
		return cep;
	}
	public String getDdd() {
		return ddd;
	}
	public String getTelefone() {
		return telefone;
	}
	
	
}


public class Pessoa {

	//Atributo = abaixo da class
	String nomeAt;
	int idadeAt;
	Endereco enderecoAt;


	public Pessoa(){
		
	}
	
	
	public Pessoa(String nomePar, int idadePar, Endereco enderecoPar) {
		this.nomeAt = nomePar;
		this.idadeAt = idadePar;
		this.enderecoAt = enderecoPar; 
	}
	
	
	//getters
	public String getNome() {
		return nomeAt;
	}
	public int getIdade() {
		return idadeAt;
	}
	public Endereco getEndereco() {
		return enderecoAt;
	}
	
	//setters
	public void setNome(String nomePar){
		this.nomeAt = nomePar.toUpperCase();
	}
	public void setIdade(int idadePar){
		this.idadeAt = idadePar;
	}
	public void setEndereco(Endereco enderecoPar){
		this.enderecoAt = enderecoPar;
	}
	
}
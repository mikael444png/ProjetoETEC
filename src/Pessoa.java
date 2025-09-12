
public class Pessoa {

	//Atributo = abaixo da class
	String nomeAt;
	int idadeAt;
	Endereco endereco;


	public Pessoa(){
		
	}
	
	
	public Pessoa(String nomePar, int idadePar) {
		this.nomeAt = nomePar;
		this.idadeAt = idadePar;
	}
	
	
	//getters
	public String getNome() {
		return nomeAt;
	}
	public int getIdade() {
		return idadeAt;
	}
	
	//setters
	public void SetNome(String nomePar) {
		this.nomeAt = nomePar.toUpperCase();
	}
	public void SetIdade(int idadePar) {
		this.idadeAt = idadePar;
	}
	
}

public class Discente extends Pessoa{
	//Atributos
	int nota1At;
	int nota2At;
	int nota3At;
	int nota4At;
	
	//construtores
	public Discente(int nota1Par, int nota2Par, int nota3Par, int nota4Par, String nomePar, 
			String idadePar, Endereco enderecoPar){
		super(nomePar, idadePar, enderecoPar);
		
		this.nota1At = nota1Par;
		this.nota2At = nota2Par;
		this.nota3At = nota3Par;
		this.nota4At = nota4Par;
	}
	
	//setters:
	public void setNota1(int nota){
		this.nota1At = nota;
	}
	public void setNota2(int nota){
		this.nota2At = nota;
	}
	public void setNota3(int nota){
		this.nota3At = nota;
	}
	public void setNota4(int nota){
		this.nota4At = nota;
	}
	
	//getters:
	public int getNota1(){
		return nota1At;
	}
	public int getNota2(){
		return nota2At;
	}
	public int getNota3(){
		return nota3At;
	}
	public int getNota4(){
		return nota4At;
	}
	
	
}

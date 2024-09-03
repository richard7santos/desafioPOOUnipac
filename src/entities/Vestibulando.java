package entities;
import java.util.Scanner;

//classe vestibulando implementando a interface ICandidato
public class Vestibulando implements ICandidato {
//	atributos
	private String nomeCandidato;
	private int idade;
	private double notaExame;
	private String responsavelLegal;
	
//Método construtor
	public Vestibulando(String nomeVestibulando, int idade) {
		this.nomeCandidato = nomeVestibulando;
		this.idade = idade;
//		valida a idade do candidato
		if(idade < 18) {
//			estancia um scanner para entrada de teclado
			Scanner sc = new Scanner(System.in);
			System.out.println("Aluno candidato menor que 18 anos");
			System.out.println("Informe o nome de um responsável legal");
			this.responsavelLegal = sc.nextLine();
			sc.close();
		}
	}
	
	

	@Override
	public String toString() {
		return "Vestibulando [nomeCandidato=" + nomeCandidato + ", idade=" + idade + ", responsavelLegal="
				+ responsavelLegal + "]";
	}



	public String getNomeCandidato() {
		return nomeCandidato;
	}
	
	public int getIdade() {
		return idade;
	}

	public double getNotaExame() {
		return notaExame;
	}

	public String getResponsavelLegal() {
		return responsavelLegal;
	}

	@Override
	public void exameDeBolsa(double nota) {
		this.notaExame = nota;	
	}

}

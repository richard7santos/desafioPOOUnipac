package entities;

//classe disciplina implementando a interface IDisciplina
public class Disciplina implements IDisciplina {
//	Atributos
	private String nomeDisciplina;
	private double nota;
	
//	Método construtor
	public Disciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
	
	public void avaliarAluno(double nota) {
		this.nota = nota;
	}
	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public double getNota() {
		return nota;
	}
	
//	método que retorna o objeto como string
	@Override
	public String toString() {
		return  nomeDisciplina;
	}
	
	
	
}

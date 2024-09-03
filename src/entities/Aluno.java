package entities;

import java.util.ArrayList;

//Classe Aluno
public class Aluno {
//	atributos
	private String nomeAluno;
	private int idade;
	private int periodo;
	private double mensalidade;
	private ArrayList<IDisciplina> disciplinas;
	private ArrayList<IDisciplina> dependencias;
	private double desconto;
	private double notaSemestre;
		
//	método construtor
	public Aluno(ICandidato aluno) {
		this.disciplinas = new ArrayList<IDisciplina>();
		this.dependencias = new ArrayList<IDisciplina>();
		this.nomeAluno = aluno.getNomeCandidato();
		this.idade = aluno.getIdade();
		double notaExame = aluno.getNotaExame();
//		checagem de desconto
		if(notaExame >= 60 && notaExame < 80) {
			this.desconto = 30.0;	
			System.out.println("Seu desconto é de 30 %");
		} else if (notaExame >= 80 && notaExame < 95) {
			this.desconto = 40.0;
			System.out.println("Seu desconto é de 40 %");
		} else if (notaExame >= 95) {
			this.desconto = 50.0;	
			System.out.println("Seu desconto é de 50 %");
		}else {
			this.desconto = 0.0;
			System.out.println("Infelizmente você não tem direito a desconto");
		}
	}

//   Retorna as dependências
	public ArrayList<IDisciplina> getDependencias() {
		return dependencias;
	}
//  Adiciona dependências
	public void addDependencias(IDisciplina dependencias) {
		this.dependencias.add(dependencias);
	}
	
//  Remove as dependências
	public void removeDependencias(IDisciplina dependencias) {
		this.dependencias.remove(dependencias);
	}

//  Adiciona disciplinas
	public void addDisciplinas(IDisciplina disciplinas) {
		this.disciplinas.add(disciplinas);
	}
	
//  Remove as disciplinas
	public void removeDisciplinas(IDisciplina disciplinas) {
		this.disciplinas.remove(disciplinas);
	}
	
//  Retorna as disciplinas
	public ArrayList<IDisciplina> getDisciplinas() {
		return disciplinas;
	}

//	getter e setter
	public String getNomeAluno() {
		return nomeAluno;
	}

	public int getIdade() {
		return idade;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public double getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}

	public double getDesconto() {
		return desconto;
	}

	public double getNotaSemestre() {
		return notaSemestre;
	}

	public void setNotaSemestre(double notaSemestre) {
		this.notaSemestre = notaSemestre;
	}

//	Método que retorna o objeto como string
	@Override
	public String toString() {
		return "Aluno [nomeAluno=" + nomeAluno + ", idade=" + idade + ", periodo=" + periodo + ", mensalidade="
				+ mensalidade + ", disciplinas=" + disciplinas + ", dependencias=" + dependencias + ", desconto="
				+ desconto + ", notaSemestre=" + notaSemestre + "]";
	}
	
	
	
}

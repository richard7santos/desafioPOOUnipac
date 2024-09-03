package entities;

//Classe Secretaria tem a função de orquestrar os demais serviços das classes
public class Secretaria {
//	atributos
	private Aluno aluno;
	private IDisciplina d1;
	private IDisciplina d2;
	private IDisciplina d3;
	private IDisciplina d4;
	private IDisciplina d5;
	private IDisciplina d6;
	
//	Método matricular
	public void matricularAluno() {
		double valorIntegral = 400.0;
		
//		Estância de um candidato
		ICandidato candidato = new Vestibulando("João", 25);
		
//		candidato realiza o exame de bolsa
		candidato.exameDeBolsa(60);
		
//		estancia um aluno apartir da estância do candidato
		this.aluno = new Aluno(candidato);
		
//		atribui o desconto baseado na nota do exame
		double desconto = valorIntegral * this.aluno.getDesconto()/100;
		this.aluno.setMensalidade(valorIntegral - desconto);
		
//		Atribui o período que o aluno vai cursar
		this.aluno.setPeriodo(1);
		
//		estancia as disciplinas do primeiro periodo 
		this.d1 = new Disciplina("Lógica de Programação");
		this.d2 = new Disciplina("Técnicas de Programação ");
		this.d3 = new Disciplina("design de Sistemas Web");
		
//		adiciona as disciplinas no array de disciplinas
		this.aluno.addDisciplinas(d1);
		this.aluno.addDisciplinas(d2);
		this.aluno.addDisciplinas(d3);
		
//		Aluno faz as avaliações
		this.d1.avaliarAluno(20);
		this.d2.avaliarAluno(59);
		this.d3.avaliarAluno(20);
				
//		Retorna mensagem de matricula
		System.out.println("Sua mensalidade ficará no valor de R$" + this.aluno.getMensalidade());
		System.out.println("Aluno matriculado com sucesso!!!");
		System.out.println("Aluno: " + this.aluno.getNomeAluno());
		System.out.println("Período: " + this.aluno.getPeriodo());
		System.out.println("Disciplinas: " + d1.getNomeDisciplina() + " ," + d2.getNomeDisciplina() + " ," + d3.getNomeDisciplina());	
	}
	
//	Método analise de vida escolar
	public void analiseEscolar() {
//		verifica as notas das avaliações e adiciona em dependencias caso nota for inferior a 60
		for(IDisciplina disciplina : this.aluno.getDisciplinas()) {
			if(disciplina.getNota()< 60) {
				this.aluno.addDependencias(disciplina);
			}
		}
		System.out.println("Você tem pendências nas disciplinas: ");
		System.out.println(aluno.getDependencias());
		System.out.println("Você pode incluí-las neste período");
	}

//realiza a rematricula
	public void reMatricularAluno(int periodo) {
//		altera o período para 2º
		this.aluno.setPeriodo(2);
//		estancia as disciplinas do segundo período
		this.d4 = new Disciplina("POO1");
		this.d5 = new Disciplina("Arquitetura de Computadores");
		this.d6 = new Disciplina("Engenharia de Softweres");
	
//		Remove as disciplinas do primeiro período
		this.aluno.removeDisciplinas(d1);
		this.aluno.removeDisciplinas(d2);
		this.aluno.removeDisciplinas(d3);
		
//		adiciona as disciplinas do segundo período
		this.aluno.addDisciplinas(d4);
		this.aluno.addDisciplinas(d5);
		this.aluno.addDisciplinas(d6);
		
		System.out.println("Aluno Rematriculado com sucesso!!!");
		System.out.println("Aluno: " + this.aluno.getNomeAluno());
		System.out.println("Período: " + this.aluno.getPeriodo());
		System.out.println();
		
		
		System.out.println("Tudo pronto! \n  No " + this.aluno.getPeriodo() + "º Período você cursará as disciplilinas \n"
		+ this.aluno.getDisciplinas());
		
	}
}
package entities;

//Interface contendo a assinatura dos métodos que as classes devem implementar
public interface IDisciplina {
	public void avaliarAluno(double nota);
	public String getNomeDisciplina();
	public double getNota();

}

package entities;

//Interface contendo a assinatura dos métodos que as classes devem implementar
public interface ICandidato {
	
	public void exameDeBolsa(double nota);
	public double getNotaExame();
	public String getNomeCandidato(); 
	public int getIdade();
}

package func;

public class creditos {
	
	static int qtdCredito = 0;
	
	
	public void acertou(int ganho) {
		qtdCredito = qtdCredito + ganho;
	}
	public void errou(int perca) {
		qtdCredito = qtdCredito - perca;
	}
	
	public void reset() {
		qtdCredito = 0;
	}
	
	public int verCreditos() {
		return qtdCredito;
	} 
}

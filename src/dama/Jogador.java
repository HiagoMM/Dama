package dama;

public class Jogador {
	
	private String nome;
	private TipoPeca peca;
	
	public Jogador(TipoPeca peca) {
		this.peca = peca;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public TipoPeca getTipo() {

		return this.peca;
	}	
}

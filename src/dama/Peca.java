package dama;

public class Peca {

	private TipoPeca tipo ;
	private boolean isDama;
	
	
	
	
	public boolean isDama() {
		return isDama;
	}
	public void setDama(boolean isDama) {
		this.isDama = isDama;
	}
	
	
	public Peca(TipoPeca tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		if(TipoPeca.BRANCA == this.tipo) {
			return "B";
		}else if (TipoPeca.PRETA == this.tipo){
			return "P";
		}else {
			return "O";
		}
	}

	public TipoPeca getTipo() {
		return tipo;
	}

	public void setTipo(TipoPeca tipo) {
		this.tipo = tipo;
	}
	
	

	
}

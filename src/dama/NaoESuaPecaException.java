package dama;

public class NaoESuaPecaException extends Exception {

	private static final long serialVersionUID = -6469420104021984098L;
	
	public NaoESuaPecaException() {
		super("Esta não é sua peca");
	}
}

package dama;

import java.util.ArrayList;
import java.util.Arrays;

public class Tabuleiro {

	private Peca[][] tabuleiro = new Peca[8][8];
	private Jogador jogador1;
	private Jogador jogador2;

	public Tabuleiro() {
		for (int linha = 0; linha < tabuleiro.length; linha++) {
			for (int coluna = 0; coluna < tabuleiro.length; coluna++) {

				if (linha != 3 && linha != 4) {

					if (linha < 3) {
						if (coluna % 2 == 0 && linha % 2 == 0) {
							tabuleiro[linha][coluna] = new Peca(TipoPeca.BRANCA);
						} else if (coluna % 2 == 1 && linha % 2 == 1) {
							tabuleiro[linha][coluna] = new Peca(TipoPeca.BRANCA);
						}else {
							tabuleiro[linha][coluna] = new Peca(TipoPeca.NULO);
						}
					} else {

						if (coluna % 2 == 0 && linha % 2 == 0) {
							tabuleiro[linha][coluna] = new Peca(TipoPeca.PRETA);
						} else if (coluna % 2 == 1 && linha % 2 == 1) {
							tabuleiro[linha][coluna] = new Peca(TipoPeca.PRETA);
						}else {
							tabuleiro[linha][coluna] = new Peca(TipoPeca.NULO);
						}
					}
				}else {
					tabuleiro[linha][coluna] = new Peca(TipoPeca.NULO);
				}
			}
		}
	}

	public Peca[][] preverJogada(String jogada, Jogador jogador) throws JogadaInvalidaException {
		Peca[][] clone = getClone();
		int linha = getLinha(jogada);
		int coluna = getColuna(jogada);
		if (clone[linha][coluna].getTipo().equals(jogador.getTipo())) {
			if (clone[linha][coluna].getTipo().equals(TipoPeca.BRANCA)) {
				linha++;
			} else {
				linha--;
			}
			if (coluna + 1 <= 7) {
				if (clone[linha][coluna + 1].getTipo().equals(TipoPeca.BRANCA) || 
						clone[linha][coluna + 1].getTipo().equals(TipoPeca.PRETA)) {
				} else {
					clone[linha][coluna + 1] = new Peca(TipoPeca.PREVISÃO);
				}
			}
			if (coluna - 1 >= 0) {
				if (clone[linha][coluna - 1].getTipo().equals(TipoPeca.BRANCA) || 
						clone[linha][coluna - 1].getTipo().equals(TipoPeca.PRETA)) {
				} else {
					clone[linha][coluna - 1] = new Peca(TipoPeca.PREVISÃO);
				}
			}
		} else {
			throw new JogadaInvalidaException();
		}

		return clone;
	}

	private Peca[][] getClone() {
		Peca[][] clone = new Peca[8][8];
		for (int i = 0; i < clone.length; i++) {
			for (int j = 0; j < clone.length; j++) {
				clone[i][j] = this.tabuleiro[i][j];
			}
		}
		return clone;
	}

	public Jogador getOutroJogador(Jogador jogador) {
		if (jogador.equals(this.jogador1)) {
			return this.jogador2;
		} else if (jogador.equals(this.jogador2)) {
			return this.jogador1;
		}
		return null;
	}

	private int getLinha(String jogada) {

		switch ("" + jogada.charAt(0)) {
		case "A":
			return 0;
		case "B":
			return 1;
		case "C":
			return 2;
		case "D":
			return 3;
		case "E":
			return 4;
		case "F":
			return 5;
		case "G":
			return 6;
		case "H":
			return 7;
		default:
			return -1;
		}

	}

	private int getColuna(String jogada) {
		int num = Integer.parseInt("" + jogada.charAt(1));
		return num - 1;
	}

	public boolean acabou() {
		return true;
	}

	public Peca[][] getTabuleiro() {
		return tabuleiro;
	}

	public void setTabuleiro(Peca[][] tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

	@Override
	public String toString() {
		return Arrays.toString(tabuleiro);
	}

	public Jogador getJogador1() {
		return jogador1;
	}

	public void setJogador1(Jogador jogador1) {
		this.jogador1 = jogador1;
	}

	public Jogador getJogador2() {
		return jogador2;
	}

	public void setJogador2(Jogador jogador2) {
		this.jogador2 = jogador2;
	}

	public void setjogada(Peca[][] previsao,String peca, String jogada) throws JogadaInvalidaException {
		ArrayList<String> possiveis = new ArrayList<String>();
		int jogadaColuna = getColuna(jogada);
		int jogadaLinha = getLinha(jogada);
		
		int pecaColuna = getColuna(peca);
		int pecaLinha = getLinha(peca);
		
		for (int i = 0; i < previsao.length; i++) {
			for (int j = 0; j < previsao.length; j++) {
				if (previsao[i][j].getTipo().equals(TipoPeca.PREVISÃO)){
					possiveis.add(TabuleiroApp.getLetra(i)+""+(j+1));
				} 
			}
		}
		for (int i = 0; i < possiveis.size(); i++) {
			
			if(possiveis.get(i).equals(jogada)) {
				Peca temp = this.tabuleiro[jogadaLinha][jogadaColuna];
				this.tabuleiro[jogadaLinha][jogadaColuna] = this.tabuleiro[pecaLinha][pecaColuna];
				this.tabuleiro[pecaLinha][pecaColuna] = temp;
			}else if (i == possiveis.size()-1)
			{
				throw new JogadaInvalidaException();
			}
		}
		
		
		
	}

}

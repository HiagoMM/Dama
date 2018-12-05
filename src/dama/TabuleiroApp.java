package dama;

import java.util.Scanner;
import java.util.ResourceBundle.Control;

public class TabuleiroApp {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args)  {
		Tabuleiro tabuleiro = new Tabuleiro();

		tabuleiro.setJogador1(criaJogador(TipoPeca.BRANCA));
		tabuleiro.setJogador2(criaJogador(TipoPeca.PRETA));
		Jogador jogadorDaVez = tabuleiro.getJogador1();
		
		boolean jogou = false;
		while (tabuleiro.acabou()) {
			constroiTabuleiro(tabuleiro.getTabuleiro());
			
			System.out.println("Vez de "+jogadorDaVez.getNome() +" "+ jogadorDaVez.getTipo());
			
			Peca[][] previsao = null;
			String jogada = "" ;
			while (previsao == null) {
				try {
					jogada = leString("Digite a peca : ");
					previsao = tabuleiro.preverJogada(jogada, jogadorDaVez);
				} catch (JogadaInvalidaException e) {
					System.out.println(e.getMessage());
				} 
			}
			constroiTabuleiro(previsao);
			try {
				tabuleiro.setjogada(previsao,jogada,leString("Digite a jogada : "));
				jogou = true;
			} catch (JogadaInvalidaException e) {
				System.out.println(e.getMessage());
			}
			
			if (jogou) {
				jogadorDaVez = tabuleiro.getOutroJogador(jogadorDaVez);
				jogou = false;
			}
			
		}
	}

	private static String leString(String string) {
		System.out.print(string);
		return teclado.next();
	}

	public static Jogador criaJogador(TipoPeca tipo) {
		System.out.print("Digite o nome do jogador: ");
		Jogador jogador = new Jogador(tipo);
		jogador.setNome(teclado.nextLine());
		return jogador;

	}

	public static void constroiTabuleiro(Peca[][] tabuleiro) {
		System.out.println("----------");
		for (int i = 0; i < tabuleiro.length; i++) {

			for (int j = 0; j < tabuleiro.length; j++) {
				if (j == 0) {
					System.out.print("|");
				}
				if (tabuleiro[i][j].getTipo() == TipoPeca.NULO) {
					System.out.print(" ");
				} else {
					System.out.print(tabuleiro[i][j]);

				}
				if (j == 7) {
					System.out.print("|" + getLetra(i));
				}
			}
			System.out.println();
		}
		System.out.println("-12345678-");
	}

	public static String getLetra(int num) {

		switch (num) {
		case 0:
			return "A";
		case 1:
			return "B";
		case 2:
			return "C";
		case 3:
			return "D";
		case 4:
			return "E";
		case 5:
			return "F";
		case 6:
			return "G";
		case 7:
			return "H";
		default:
			return null;
		}
		
	}

}

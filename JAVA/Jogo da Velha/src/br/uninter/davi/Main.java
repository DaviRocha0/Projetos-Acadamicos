package br.uninter.davi;

import java.util.Scanner;
import br.uninter.davi.jogadores.computador.Computador;
import br.uninter.davi.jogadores.computador.tipos.ComputadorA;
import br.uninter.davi.jogadores.computador.tipos.ComputadorB;
import br.uninter.davi.jogadores.computador.tipos.ComputadorC;
import br.uninter.davi.jogadores.humano.Humano;

public class Main {	
	// Inicializa��o do Tabuleiro
	private static Tabuleiro tabuleiro;

	// Fun��o principal, onde o jogo � inicializado.
	public static void main(String[] args) {		
		// Mensagens de boas vindas.
		System.out.println("----------------------------------------");
		System.out.println("              JOGO DA VELHA				");
		System.out.println("----------------------------------------");
		
		System.out.println("Selecione a dificuldade que voc� deseja:");
		System.out.println("- 1) Jogar aleat�riamente");
		System.out.println("- 2) Posicionar pe�a em Linha x Coluna aleat�riamente");
		System.out.println("- 3) Posicionar pe�a em Coluna x Linha aleat�riamente");
		System.out.println("");
		
		// Computador a ser jogado (por padr�o use o ComputadorA).
		Computador computador = new ComputadorA();
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);		
		int opcao = teclado.nextInt();
		switch (opcao) {
			case 1: {
				computador = new ComputadorA();
				break;
			}
			case 2: {
				computador = new ComputadorB();
				break;
			}
			case 3: {
				computador = new ComputadorC();
				break;
			}
			default: {
				System.out.println("Op��o inv�lida, selecionando o 'ComputadorA', por padr�o.");
				break;
			}
		}

		// Inicializar Jogadores
		Jogador humano = new Humano();		

		// Inicializar tabuleiro
		tabuleiro = new Tabuleiro();

		// Inicializa as classes
		humano.setTabuleiro(tabuleiro);
		humano.setPlayerID(1);

		computador.setTabuleiro(tabuleiro);
		computador.setPlayerID(2);

		// Fluxo De escolha principal
		// Enquanto n�o tiver vencedores, efetue as jogadas.
		while (true) {
			// Joga os dois Jogadores
			humano.Jogar();

			// Verifica se h� vencedores
			boolean ganhou = tabuleiro.verificarVencedor();
			if (ganhou) {		
				// Se ganhar finaliza o loop, e finaliza o jogo.
				break;
			} else {
				// Caso cont�rio, o computador joga.
				computador.Jogar();
				
				// Se o computador ganhar, finaliza o jogo!
				boolean ganhou_computador = tabuleiro.verificarVencedor();
				if (ganhou_computador) {
					// Computador ganhou!
					break;
				} else {
					tabuleiro.imprimir();
				}
			}
		}
	}	
}
package br.uninter.davi;

import java.util.Scanner;
import br.uninter.davi.jogadores.computador.Computador;
import br.uninter.davi.jogadores.computador.tipos.ComputadorA;
import br.uninter.davi.jogadores.computador.tipos.ComputadorB;
import br.uninter.davi.jogadores.computador.tipos.ComputadorC;
import br.uninter.davi.jogadores.humano.Humano;

public class Main {	
	// Inicialização do Tabuleiro
	private static Tabuleiro tabuleiro;

	// Função principal, onde o jogo é inicializado.
	public static void main(String[] args) {		
		// Mensagens de boas vindas.
		System.out.println("----------------------------------------");
		System.out.println("              JOGO DA VELHA				");
		System.out.println("----------------------------------------");
		
		System.out.println("Selecione a dificuldade que você deseja:");
		System.out.println("- 1) Jogar aleatóriamente");
		System.out.println("- 2) Posicionar peça em Linha x Coluna aleatóriamente");
		System.out.println("- 3) Posicionar peça em Coluna x Linha aleatóriamente");
		System.out.println("");
		
		// Computador a ser jogado (por padrão use o ComputadorA).
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
				System.out.println("Opção inválida, selecionando o 'ComputadorA', por padrão.");
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
		// Enquanto não tiver vencedores, efetue as jogadas.
		while (true) {
			// Joga os dois Jogadores
			humano.Jogar();

			// Verifica se há vencedores
			boolean ganhou = tabuleiro.verificarVencedor();
			if (ganhou) {		
				// Se ganhar finaliza o loop, e finaliza o jogo.
				break;
			} else {
				// Caso contário, o computador joga.
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
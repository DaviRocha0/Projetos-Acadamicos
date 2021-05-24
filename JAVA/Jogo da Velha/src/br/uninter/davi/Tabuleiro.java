package br.uninter.davi;

public class Tabuleiro {

	// Vetor que representa a posição das peças
	private int[][] tabuleiroPosicoes = new int[3][3];

	// Posicionar peça no tabuleiro
	public boolean efetuarJogada(int jogador, int linha, int coluna) {
		// Verifica se está na posição correta, caso contário, a jogada não será efetuada.
		if ((linha < 0) || (linha > 2) || (coluna < 0) || (coluna > 2) || tabuleiroPosicoes[linha][coluna] != 0) {
			return false;
		}
		tabuleiroPosicoes[linha][coluna] = jogador;
		return true;
	}
	
	// Tamanho do tabuleiro
	public int GetTamanhoTabuleiro() {
		return tabuleiroPosicoes.length;
	}

	// Finalizar jogo
	public void FinalizarJogo(int playerID) {
		imprimir();
		switch (playerID) {
			case -1: {
				System.out.println("Ocorreu empate!");
				break;
			}
			case 1: {
				System.out.println("O Jogador 'HUMANO' GANHOU!");
				break;
			}
			case 2: {
				System.out.println("O Jogador 'COMPUTADOR' GANHOU!");
				break;
			}
		}
	}

	// Verifica se há vencedores (e retorna o index de quem ganhou!)
	public boolean verificarVencedor() {
		
		// Verifica em linha reta
		// O O O
		for (int i = 0; i < 3; i++) {
			if ((tabuleiroPosicoes[i][0] == tabuleiroPosicoes[i][1]) && (tabuleiroPosicoes[i][0] == tabuleiroPosicoes[i][2]) && tabuleiroPosicoes[i][0] != 0) {
				FinalizarJogo(tabuleiroPosicoes[i][0]);
				return true; // Há vencedores!
			}
		}

		// Verificar horizontalmente
		// O 
		// O
		// O
		for (int j = 0; j < 3; j++) {
			if ((tabuleiroPosicoes[0][j] == tabuleiroPosicoes[1][j]) &&	(tabuleiroPosicoes[0][j] == tabuleiroPosicoes[2][j]) &&	(tabuleiroPosicoes[0][j] != 0)) {
				FinalizarJogo(tabuleiroPosicoes[0][j]);
				return true; // Há vencedores!
			}
		}

		// Verifica de forma diagonal (da esquerda para direita)
		if ((tabuleiroPosicoes[0][0] ==tabuleiroPosicoes[1][1]) && (tabuleiroPosicoes[0][0] == tabuleiroPosicoes[2][2]) && (tabuleiroPosicoes[0][0] != 0)) {
			FinalizarJogo(tabuleiroPosicoes[0][0]);
			return true; // Há vencedores!
		}

		// Verifica de forma diagonal (da direita para esquerda)
		if ((tabuleiroPosicoes[0][2] == tabuleiroPosicoes[1][1]) &&	(tabuleiroPosicoes[0][2] == tabuleiroPosicoes[2][0]) &&	(tabuleiroPosicoes[0][2] != 0)) {
			FinalizarJogo(tabuleiroPosicoes[0][2]);
			return true; // Há vencedores!
		}

		// Se, todos as posições forão preenchidas, e não encontrou vitória, significa que ocorreu um empate.
		int hits = 0;
		for (int i = 0; i < tabuleiroPosicoes.length; i++) {			
			for (int j = 0; j < tabuleiroPosicoes[i].length; j++) {
				if (tabuleiroPosicoes[i][j] != 0) {
					hits++;
				}
			}
		}
		if (hits >= (tabuleiroPosicoes.length*tabuleiroPosicoes[0].length)) {
			FinalizarJogo(-1);
			return true; // Há vencedores!
		}
		return false; // Sem jogadores definido ainda...
	}

	// Função que imprime o tabuleiro no console.
	public void imprimir() {
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		for (int i = 0; i < tabuleiroPosicoes.length; i++) {			
			for (int j = 0; j < tabuleiroPosicoes[i].length; j++) {
				// Imprime de acordo com a peça selecionada
				switch (tabuleiroPosicoes[i][j]) {
					case 1: {
						System.out.print("	O	");
						break;
					}
					case 2: {
						System.out.print("	X	");
						break;
					}
					default: {
						System.out.print("	|	");
						break;
					}
				}
			}
			System.out.println(); // Próxima Linha
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}
}

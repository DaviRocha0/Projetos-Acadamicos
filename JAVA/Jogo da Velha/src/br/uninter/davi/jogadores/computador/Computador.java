package br.uninter.davi.jogadores.computador;

import br.uninter.davi.Tabuleiro;

public class Computador 
{		
	// Tabuleiro
	private Tabuleiro tabuleiro;
	private int       playerID;
	
	// Essa fun��o ser� sobreescrita de acordo com Humano ou Computador
	public void Jogar() {};
	
	// Pega o tabuleiro atual
	public Tabuleiro getTabuleiro() {
		return tabuleiro;
	}

	// Essa fun��o aplicar� o tabuleiro a ser jogado.
	public void setTabuleiro(Tabuleiro tab) {
		this.tabuleiro = tab;
	}

	// ID do Jogador
	public int getPlayerID() {
		return playerID;
	}

	// Aplica o ID do Jogador
	public void setPlayerID(int playerID) {
		this.playerID = playerID;
	};
}

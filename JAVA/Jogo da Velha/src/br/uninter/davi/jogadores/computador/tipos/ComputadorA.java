package br.uninter.davi.jogadores.computador.tipos;

import java.util.Random;

import br.uninter.davi.jogadores.computador.Computador;

public class ComputadorA extends Computador {
	
	// ComputadorA - Posiciona as peças de forma aleatória
	Random random = new Random();
		
	@Override
	public void Jogar() {		
		// Gera valores de linha e coluna
		int linha = random.nextInt(3);
		int coluna = random.nextInt(3);		
		
		// Efetua a jogada, se não for possível efetuar a jogada, gera novos valores
		while(!getTabuleiro().efetuarJogada(getPlayerID(), linha, coluna)) {
			linha = random.nextInt(3);
			coluna = random.nextInt(3);	
		}
	}	
}

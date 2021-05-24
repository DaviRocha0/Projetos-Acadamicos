package br.uninter.davi.jogadores.computador.tipos;

import java.util.Random;

import br.uninter.davi.jogadores.computador.Computador;

public class ComputadorC extends Computador {
	
	// ComputadorC - Preenche o próximo vazio (Coluna x Linha)
	Random random = new Random();
		
	@Override
	public void Jogar() {		
		for (int i = 0; i < getTabuleiro().GetTamanhoTabuleiro(); i++) {
			for (int j = 0; j < getTabuleiro().GetTamanhoTabuleiro(); j++) {
				if (getTabuleiro().efetuarJogada(getPlayerID(), j, i)) {
					return;
				}
			}
		}
	}	
}

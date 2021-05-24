package br.uninter.davi.jogadores.humano;

import java.util.Scanner;

import br.uninter.davi.Jogador;

public class Humano extends Jogador {

	@Override
	public void Jogar() {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);		
		
		System.out.println();
		System.out.println();
		
		// Linha
		System.out.println("Digite a linha que você deseja jogar (1 - 3)");
		int linha = teclado.nextInt();
		
		// Coluna
		System.out.println("Digite a coluna que você deseja jogar (1 - 3)");
		int coluna = teclado.nextInt();
		
		// Verificação (continua até o jogador informar uma posição correta)
		// "linha - 1", é devido que o computador começa a contar de 0
		while (!getTabuleiro().efetuarJogada(getPlayerID(), linha - 1, coluna - 1)) {		
			
			System.out.println();
			System.out.println();
			
			System.out.println("Posição inválida, por favor, selecione a posição correta");		
			
			System.out.println("Digite a linha que você deseja jogar (1 - 3)");
			linha = teclado.nextInt();
			
			System.out.println("Digite a coluna que você deseja jogar (1 - 3)");
			coluna = teclado.nextInt();
		}
		
		System.out.println();
		System.out.println();
	}	
}

#include <iostream>

// Também poderia usar o if (inicio == fim), mas assim fica mais legivel.
int counterRecursive(int inicio, int fim) {
	return inicio == fim ? 1 : 1 + counterRecursive(inicio + 1, fim);
}

int main()
{
	setlocale(LC_ALL, "Portuguese");
	int inicio = 0;
	int fim = 0;
	int counter = 0;

	std::cout << "Digite o Inicio " << std::endl;
	scanf_s("%d", &inicio);
	std::cout << "Digite o fim " << std::endl;
	scanf_s("%d", &fim);

	/*
			O algoritmo vai contar quantos números existem entre o início (primeira entrada) e
		o fim (segunda entrada). A impressão na tela do usuário deve ser realiza-da de duas formas:
	*/
	for (int i = inicio; i <= fim; i++) {
		counter++;
	}
	std::cout << "Usando função interativa, o resultado foi de " << counter << std::endl;

	/* Calcula recursivamente */
	int recursive = counterRecursive(inicio, fim);
	std::cout << "Usando a função recursiva, o resultado foi de " << recursive << std::endl;
}
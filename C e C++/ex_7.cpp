#include<stdio.h>
#include<conio.h>

int main()
{
	char resposta[2];
	int opcao = 0;

	int Contas[100];
	double KWPessoa[100];
	int totalPopulacao = -1;

	while (true)
	{

		// Opções
		printf("\n");
		printf("Opcoes Disponiveis: \n");
		printf("0 - Cadastrar novo consumidor \n");
		printf("1 - Listar \n");
		printf("2 - Maior Consumidor \n");
		printf("3 - Menor Consumidor \n");
		printf("4 - Media Cidade \n");
		printf("5 - Maiores Consumidores de ultrapassam de 170\n");
		printf("6 - Sair \n");

	    // Ler a opção do úsuario
		scanf("%d", &opcao);
		printf("\n");

		// Controle
		switch (opcao) {
			case 0:

				int numeroConta;
				double KW;

				// Lê a entrada
				printf("Digite o Numero da conta:\n");
				scanf_s("%d", &numeroConta);
				printf("\n");

				printf("Digite o KW:\n\n");
				scanf_s("%lf", &KW);
				printf("\n");

				// Armazena nos vetores.
				Contas[totalPopulacao + 1] = numeroConta;
				KWPessoa[totalPopulacao + 1] = KW;
				totalPopulacao++;
				printf("Cadastrado com Sucesso!");
				printf("\n");
			break;
			case 1:
				// Listar número de conta
				printf("Listando Pessoas Cadastradas:\n");
				if ((totalPopulacao + 1) == 0) {
					printf("- Nenhum Cadastro foi encontrado");
				}
				for (int i = 0; i < totalPopulacao+1; i++) {
					printf("- Numero da conta %d, total consumido %.7lf, valor a pagar %.7lf", Contas[i], KWPessoa[i], (KWPessoa[i] * 1.75));
					printf("\n");
				}
				printf("\n");
				printf("\n");
				break;
			case 2:
			{
				double maiorConsumidor = 0;
				int index = 0;
				for (int i = 0; i < totalPopulacao + 1; i++) {
					if (KWPessoa[i] > maiorConsumidor) {
						maiorConsumidor = KWPessoa[i];
						index = i;
					}
				}

				printf("O maior consumidor foi o consumidor %d, que consumiu %lf", Contas[index], maiorConsumidor);
				printf("\n");
				printf("\n");
				break;
			}
			case 3:
			{
				double menor = 10000000;
				int indexMenor = 0;
				for (int i = 0; i < totalPopulacao + 1; i++) {
					if (KWPessoa[i] < menor) {
						menor = KWPessoa[i];
						indexMenor = i;
					}
				}
				printf("O menor consumidor foi o consumidor %d, que consumiu %lf", Contas[indexMenor], menor);
				printf("\n");
				printf("\n");
				break;
			}
			case 4:
			{
				double total = 0;

				// Listar número de conta
				printf("Listando Medias da populacao:");
				if ((totalPopulacao + 1) == 0) {
					printf("- Nenhuma media foi encontrada.");
				}

				// Soma todos os consumidores
				for (int i = 0; i < totalPopulacao + 1; i++) {
					total += KWPessoa[i];
				}
				printf("A media da cidade foi de %lf", (total/(totalPopulacao+1)));
				printf("\n");
				printf("\n");
				break;
			}
			case 5:
			{
				if ((totalPopulacao + 1) == 0) {
					printf("- Nenhum consumidor foi encontrado");
					break;
				}
				for (int i = 0; i < totalPopulacao + 1; i++) {
					if (KWPessoa[i] >= 150) {
						printf("Consumidores que ultrapassaram de 150, foi o consumidor %d, com o consumo de %lf", Contas[i], KWPessoa[i]);
					}
				}
				printf("\n");
				printf("\n");
				break;
			}
			case 6:
				goto fim;
				break;
		}
	}
	fim:
		printf("Programa Finalizado.");
}
#include<stdio.h>
#include<conio.h>

void main()
{
	int pessoas = 2;
	int sim = 0;
	int nao = 0;

	// Double por causa da porcentagem.
	double homens = 0;
	double mulheres = 0;

	for (int i = 0; i < pessoas; i++) {
		char resposta[2];
		char sexo[2];

		printf("Voce gostou do produto? (Digite S/N): ");

		scanf_s("%s", resposta);

		printf("Homem ou mulher (Digite M / F): ");
		scanf_s("%s", sexo);

		if (resposta[0] == 'N') {
			nao++;
		}
		else if (resposta[0] == 'S') {
			sim++;
		}

		if (sexo[0] == 'M') {
			homens++;
		}
		else if (sexo[0] == 'F') {
			mulheres++;
		}

		printf("\n");
	}
	printf("Numero de disseram nao %d\n", nao);
	printf("Numero de disseram sim %d\n", sim);
	printf("Porcentagem do sexo masculino que disseram sim %.7lf\n", (homens / pessoas) * 100);
	printf("Porcentagem do sexo feminino que disseram sim %.7lf\n", (mulheres / pessoas) * 100);
}
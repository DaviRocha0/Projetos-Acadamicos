#include <iostream>

void colocarString(int pos,std::string primeiro,std::string segundo) {
	primeiro.insert(pos, segundo);
	printf("O Resultado e %s", &primeiro);
}

int main()
{
	char primeiro[50];
	char segundo[50];
	int posicao = 0;

	printf("Digite a primeira string \n");
	scanf_s("%s", &primeiro);

	printf("Digite a Segunda string \n");
	scanf_s("%s", &segundo);

	printf("Digite a posicao \n");
	scanf_s("%d", &posicao);

	colocarString(posicao, primeiro, segundo);

}
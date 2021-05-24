#include <iostream>
int main()
{
	// Declare três variáveis (inteiro, real e char);
	int inteiro = 0;
	float real = 0;
	char mChar = 0;

	// Declare três ponteiros;
	int* inteiroPointer;
	float* realPointer;
	char* mCharPointer;

	// Associe as variáveis aos ponteiros;
	inteiroPointer = &inteiro;
	realPointer = &real;
	mCharPointer = &mChar;

	/*
			Modifique os valores de cada variável indiretamente usando os pon-teiros
		associados. Para armazenar os valores nas variáveis, armazene na variável
		char a primeira letra do seu nome, na variável inteira os dois últimos dígitos
		do seu RU e na variável real os 4 últimos dígitos do seu RU, sendo os 2
		últimos os valores com virgula;
	*/
	*mCharPointer = 'D';
	*inteiroPointer = 26;
	*realPointer = 11.26f;

	/*
	    Imprima na tela os valores das variáveis antes e após a modificação.
	*/
	printf("Inteiro [Ponteiro %d, sem ponteiro %d] \n", *inteiroPointer, inteiro);
	printf("Real [Ponteiro %.3f, sem ponteiro %.3f] \n", *realPointer, real);
	printf("Char [Ponteiro %d, sem ponteiro %d] \n", *mCharPointer, mChar);
}
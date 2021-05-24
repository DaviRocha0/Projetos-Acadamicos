#include <iostream>

struct Aluno {
	char nomeAluno[260];
	int AlunoRU;
} Aluninho;

int main()
{
	setlocale(LC_ALL, "portuguese");
	std::cout << "Digite o nome do Aluno" << std::endl;
	scanf_s("%s", &Aluninho.nomeAluno, 260);

	std::cout << "Digite o RU do Aluno " << std::endl;
	scanf_s("%d", &Aluninho.AlunoRU);

	std::cout << "Você digitou o nome " << Aluninho.nomeAluno << " cujo seu RU é " << Aluninho.AlunoRU << " " << std::endl;
}

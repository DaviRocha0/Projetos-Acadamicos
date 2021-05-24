#include <iostream>
int main()
{
	setlocale(LC_ALL, "Portuguese");

	int RU = 0;
	int RU2 = 0;

	std::cout << "Digite seu RU " << std::endl;
	scanf_s("%d", &RU);

	std::cout << "Digite o RU a ser comparado" << std::endl;
	scanf_s("%d", &RU2);

	int* RUPointer = &RU;
	int* RUPointer2 = &RU2;

	if (*RUPointer > *RUPointer2) {
		std::cout << " O RU " << *RUPointer << " é maior que RU2 " << *RUPointer2 << std::endl;
	}
	else {
		std::cout << " O RU2 " << *RUPointer2 << " é maior que RU " << *RUPointer << std::endl;
	}
}
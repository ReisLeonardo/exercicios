// Fazer um programa para ler dois valores inteiros X e Y, e depois mostrar na tela o valor da soma destes n�meros.

#include <stdio.h>

int main()
{
    // Definindo as vari�veis
    int x, y, soma;

    // Entrada de dados
    printf("Digite o valor de X: ");
    scanf("%d", &x);
    printf("Digite o valor de Y: ");
    scanf("%d", &y);

    // Artif�cio matem�tico para calcular a soma
    soma = x+y;

    // Sa�da de dados
    printf("SOMA = %d", soma);


    return 0;
}

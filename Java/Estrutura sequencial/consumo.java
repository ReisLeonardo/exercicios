// Fazer um programa para ler a distância total (em km) percorrida por um carro, bem como o total de combustível gasto por este carro ao percorrer tal distância. Seu programa deve mostrar o consumo médio do carro, com três casas decimais.

import java.util.Scanner;

public class consumo {

	public static void main(String[] args) {
		
		// Variáveis
		int distanciaPercorrida;
		double combustivelGasto, consumoMedio;

		Scanner sc = new Scanner(System.in); // Para facilitar a leitura de dados
		
		// Entrada de dados
		System.out.print("Distância percorrida: ");
		distanciaPercorrida = sc.nextInt();
		System.out.print("Combustível gasto: ");
		combustivelGasto = sc.nextDouble();
		
		// Algoritmo matemático
		consumoMedio = distanciaPercorrida / combustivelGasto;
		
		// Saída de dados
		System.out.print("O consumo médio é de " + String.format("%.3f", consumoMedio) +  ".");
		
		sc.close(); // Boa prática de programação
	}
}
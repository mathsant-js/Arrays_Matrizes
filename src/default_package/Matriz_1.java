// Matriz - Parte 1

// vetor/array/matriz multi-dimensional

// Vetor uni-dimensional
/*
 * int numeros[3];
 * numeros[0] = 1;
 * numeros[1] = 2;
 * numeros[2] = 3;
 * 
 * Matriz multi-dimensional
 * 
 * int numeros[2][2];
 * numeros[0][0] = 2;
 * numeros[0][1] = 4;
 * numeros[1][0] = 6;
 * numeros[1][1] = 8;
 * */

package default_package;

public class Matriz_1 {
	public static void main(String[] args) {
		// Declaração
		int numeros[][];
		
		// Declaração e definição de tamanho
		int outros_numeros[][] = new int[3][3];
		
		// Declaração, definição de tamanho e inicialização
		int mais_numeros[][] = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
		
		// Declarar uma matriz informando somente as linhas
		int matriz[][] = new int[2][];
		matriz[0] = new int[5];
		matriz[1] = new int[3];
		
		int nova_matriz[][] = { {1, 2}, {4, 5, 6, 7, 8}, {9, 10, 11} };
	}
}

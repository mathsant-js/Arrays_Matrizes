// Matrizes - Parte 2

package default_package;

public class Matriz_2 {
	public static void main(String[] args) {
		int numeros[][] = new int [3][3];
			// Inserindo valores na matriz
			for (int i = 0; i < numeros.length; i++) {
				for (int j = 0; j < numeros[i].length; j++) {
					numeros[i][j] = i + j;
					System.out.println("numeros[" + i + "][" + j + "] = " + numeros[i][j]);
				}
			}
	}
}

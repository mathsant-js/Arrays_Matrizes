// Vetor - Parte 2
package default_package;

public class Vetor_2 {
	public static void main(String[] args) {
		int numeros[] = new int[10];
		
		System.out.println("O tamanho do vetor é: " + numeros.length);
			
			for(int i = 0; i < numeros.length; i++) {
				// numeros[i] = i + 3;
				numeros[i] = i + 3;
				// numeros[i] = i + 3;
				System.out.println(numeros[i]);
			}
			
			// 0..9
			// numeros[10] = 42;
			// System.out.println(numeros[10]);
			/*
			 * Os vetores/arrays possuem tamanho fixo e não
			 * podem ser aumentados/diminuídos
			 * 
			 */
			
			numeros[0] = 7;
			System.out.println(numeros[0]);
			
			// numeros[0] = 23.4f;
			/*
			 * Os vetores/arrays possuem tipos de dados fixos
			 * e não aceitam tipos variados
			 */
			
			for (int i = 0; i < numeros.length; i++) {
				numeros[i] = (int)Math.round(Math.random() * 10);
				System.out.println(numeros[i]);
			}
			/*
			 * (int) -> convertendo o número em inteiro
			 * Math.round -> método que arredonda um número
			 * Math.random -> método que gera um número aleatório entre 0 e 1
			 */
			for (int i : numeros) {
				System.out.println(i);
			}
	}
}

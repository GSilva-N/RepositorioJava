package Lista03;

public class Questao01 {

	public static void main(String[] args) {
		
		int vetorA[] = {1, 0, 5, -2, -5, 7};
		int soma;
		
		soma = vetorA[0]+vetorA[1]+vetorA[5];
		
		System.out.println("Soma das Posi��es [0], [1] e [5] �: "+ soma);
		
		vetorA[3]=100;
		
		System.out.println("Valor vetorA[4]: "+vetorA[4]);
		
		for(int i:vetorA) {
			System.out.println("Vetor[]: "+i);
		}

	}

}

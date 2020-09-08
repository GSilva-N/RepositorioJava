import java.util.Scanner;

public class Ex01_Q01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int idadeAnos, idadeMeses, idadeDias, idadeTotal; 	
		
		System.out.print("Escreva sua idade em anos: ");
		idadeAnos = teclado.nextInt();
		System.out.print("Escreva sua idade em meses: ");
		idadeMeses = teclado.nextInt();
		System.out.print("Escreva sua idade em dias: ");
		idadeDias = teclado.nextInt();
		
		idadeTotal = idadeAnos*365 + idadeMeses*30 + idadeDias;
		
		System.out.print("Sua idade em dias é "+idadeTotal);

		
	}

}

import java.util.Scanner;

public class Ex01_Q02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int idadeAnos, idadeMeses, idadeDias, idadeTotal; 	
		
		System.out.print("Escreva sua idade em dias: ");
		idadeTotal = teclado.nextInt();
		
		idadeAnos = idadeTotal/365;
		idadeMeses = (idadeTotal%365)/30;
		idadeDias = (idadeTotal%365)%30;
		
		System.out.printf("Sua idade é de %d anos, %d meses e %d dias", idadeAnos, idadeMeses, idadeDias);
		

	}

}

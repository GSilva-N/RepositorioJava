import java.util.Scanner;

public class Ex01_Q03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int horas, minutos, segundos;
		
		System.out.print("Escreva o tempo em segundos: ");
		segundos = teclado.nextInt();
		
		horas = segundos/3600;
		minutos = (segundos%3600)/60;
		segundos = (segundos%3600)%60;
		
		System.out.printf("O tempo de duração é de %d horas, %d minutos e %d segundos", horas, minutos, segundos);

	}

}

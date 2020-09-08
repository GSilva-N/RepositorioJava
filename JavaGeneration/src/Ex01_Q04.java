import java.util.Scanner;

public class Ex01_Q04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double a, b, c, d, r, s;
		
		System.out.print("Valor de A: ");
		a = teclado.nextFloat();
		System.out.print("Valor de B: ");
		b = teclado.nextFloat();
		System.out.print("Valor de C: ");
		c = teclado.nextFloat();
		
		r = Math.pow((a+b),2);
		s = Math.pow((c+b),2);
		
		d = (r+s)/2;
		
		System.out.println("Valor de D é: "+d);

	}

}

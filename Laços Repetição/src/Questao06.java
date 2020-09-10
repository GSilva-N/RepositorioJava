import javax.swing.JOptionPane;

public class Questao06 {

	public static void main(String[] args) {
		
		int numero, contador=0, somatorio=0;
		double media=0.0;
		
		do {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
			
			if(numero%3==0 && numero!=0) {
				
				somatorio+=numero;
				contador++;
				media = somatorio/contador;
				System.out.println("Numero digitado: "+numero);
			}
			
		}while(numero!=0);
		
		JOptionPane.showMessageDialog(null,"Media dos multiplos de 3 é "+media);

	}

}

package Lista_02;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Questao04 {

	public static void main(String[] args) {
		DecimalFormat formatar = new DecimalFormat("0.00");
		
		double numero;
		numero = Double.parseDouble(JOptionPane.showInputDialog("Escreva um número:"));
		
		if(numero%2==0) { 
			JOptionPane.showMessageDialog(null,"Numero é par e sua raiz quadrada é: "+formatar.format(Math.sqrt(numero)));
		} else {
			JOptionPane.showMessageDialog(null,"Numero é impar e seu quadrado é: "+Math.pow(numero,2));
		}

	}

}

package Lista_02;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Questao04 {

	public static void main(String[] args) {
		DecimalFormat formatar = new DecimalFormat("0.00");
		
		double numero;
		numero = Double.parseDouble(JOptionPane.showInputDialog("Escreva um n�mero:"));
		
		if(numero%2==0) { 
			JOptionPane.showMessageDialog(null,"Numero � par e sua raiz quadrada �: "+formatar.format(Math.sqrt(numero)));
		} else {
			JOptionPane.showMessageDialog(null,"Numero � impar e seu quadrado �: "+Math.pow(numero,2));
		}

	}

}

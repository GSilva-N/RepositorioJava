import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Ex01_Q07 {

	public static void main(String[] args) {
		
		DecimalFormat formatador = new DecimalFormat("0.00");
		float valorA,valorB,valorC,valorD, valorE, valorF, valorX, valorY;
		
		valorA = Float.parseFloat(JOptionPane.showInputDialog("Valor de A"));
		valorB = Float.parseFloat(JOptionPane.showInputDialog("Valor de B"));
		valorC = Float.parseFloat(JOptionPane.showInputDialog("Valor de C"));
		valorD = Float.parseFloat(JOptionPane.showInputDialog("Valor de D"));
		valorE = Float.parseFloat(JOptionPane.showInputDialog("Valor de E"));
		valorF = Float.parseFloat(JOptionPane.showInputDialog("Valor de F"));
		
		valorX = (valorC*valorE)-(valorB*valorF)/(valorA*valorE)-(valorB*valorD);
		valorY = (valorA*valorF)-(valorC*valorD)/(valorA*valorE)-(valorB*valorD);
		
		JOptionPane.showMessageDialog(null, "Valor de X: "+formatador.format(valorX)+"\nValor de Y: "+formatador.format(valorY));

	}

}

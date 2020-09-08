import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Ex01_Q06 {

	public static void main(String[] args) {
		
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		float  x1, y1, x2, y2, distancia;
		
		x1 = Float.parseFloat(JOptionPane.showInputDialog("Valor de X1:"));
		y1 = Float.parseFloat(JOptionPane.showInputDialog("Valor de Y1:"));
		x2 = Float.parseFloat(JOptionPane.showInputDialog("Valor de X2:"));
		y2 = Float.parseFloat(JOptionPane.showInputDialog("Valor de Y2:"));
		
		distancia = (float) Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		
		
		JOptionPane.showMessageDialog(null, "Distancia entre 2 Pontos é: "+formatador.format(distancia));
		
		

	}

}

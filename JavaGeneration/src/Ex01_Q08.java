import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Ex01_Q08 {

	public static void main(String[] args) {
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		double valorConsumidor, valorFabrica;
		
		valorFabrica = Float.parseFloat(JOptionPane.showInputDialog("Custo de Fábrica em R$:"));
		valorConsumidor = valorFabrica*1.73;
			 
		JOptionPane.showMessageDialog(null, "Valor ao Consumidor:\nR$ "+formatador.format(valorConsumidor));
	}

}

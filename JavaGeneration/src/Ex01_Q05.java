import javax.swing.JOptionPane;

public class Ex01_Q05 {

	public static void main(String[] args) {
		
		float nota1, nota2, nota3, mediaPonderada;
		
		nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a 1� Nota"));
		nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a 2� Nota"));
		nota3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a 3� Nota"));
		
		mediaPonderada = ((nota1*2)+(nota2*3)+(nota3*5))/10;
		
		JOptionPane.showMessageDialog(null, "Media Final �: "+mediaPonderada);
		
		
	}

}

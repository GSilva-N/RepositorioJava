import javax.swing.JOptionPane;

public class Ex01_Q05 {

	public static void main(String[] args) {
		
		float nota1, nota2, nota3, mediaPonderada;
		
		nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a 1ª Nota"));
		nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a 2ª Nota"));
		nota3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a 3ª Nota"));
		
		mediaPonderada = ((nota1*2)+(nota2*3)+(nota3*5))/10;
		
		JOptionPane.showMessageDialog(null, "Media Final é: "+mediaPonderada);
		
		
	}

}

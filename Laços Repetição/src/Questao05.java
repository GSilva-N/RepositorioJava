import javax.swing.JOptionPane;

public class Questao05 {

	public static void main(String[] args) {
		
		int numero, somatorio=0;
		
		do {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
			somatorio+=numero;
			
		}while(numero!=0);
		
		JOptionPane.showMessageDialog(null,"Soma dos números: "+somatorio);
		

	}

}

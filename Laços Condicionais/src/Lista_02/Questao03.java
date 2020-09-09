package Lista_02;
import javax.swing.JOptionPane;

public class Questao03 {

	public static void main(String[] args) {
		int idade;
		idade=Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
		
		if(idade>=10 && idade<=14) {
			JOptionPane.showMessageDialog(null,"Categoria Infantil");
		}
		if(idade>=15 && idade<=17) {
			JOptionPane.showMessageDialog(null,"Categoria Juvenil");
		}
		if(idade>=18) {
			JOptionPane.showMessageDialog(null,"Categoria Adulto");
		}

	}

}

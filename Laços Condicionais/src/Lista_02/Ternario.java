package Lista_02;
import javax.swing.JOptionPane;

public class Ternario {

	public static void main(String[] args) {
		int idade;
		idade=Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
		
		JOptionPane.showMessageDialog(null,((idade>0 && idade<=12)?"Categoria Infantil":(idade>=13 && idade<=17)?"Categoria Juvenil":"Categoria Adulto"));
	}

}

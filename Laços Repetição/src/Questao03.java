import javax.swing.JOptionPane;

public class Questao03 {

	public static void main(String[] args) {
		
		int idades=0, menor21=0, maior50=0;
		
		while (idades!=-99) {
			
			idades=Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
			
			if(idades<21 && idades!=-99) {
				menor21++;
				
			} else if ( idades>50) {
				maior50++;
			}
		}
		JOptionPane.showMessageDialog(null,"Pessoas com menos que 21 anos: "+menor21+"\nPessoas com mais que 50 anos: "+maior50);
	}

}

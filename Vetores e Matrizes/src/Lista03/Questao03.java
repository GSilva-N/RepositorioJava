package Lista03;
import javax.swing.JOptionPane;

public class Questao03 {

	public static void main(String[] args) {
		final  int TAMANHO = 3;
		int matriz[][]= new int[TAMANHO][TAMANHO];
		int maior10=0;
		
		for(int linha=0; linha<TAMANHO; linha++) {
				
			for(int coluna=0; coluna<TAMANHO; coluna++) {
				
				matriz[linha][coluna]=Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
				
				if(matriz[linha][coluna]>10) {
					maior10++;
				}
			}
		}
		JOptionPane.showMessageDialog(null, "Existem "+maior10+" maiores que 10");
		
	}

}

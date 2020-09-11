package Lista03;
import javax.swing.JOptionPane;

public class ImprimirMatriz {

	public static void main(String[] args) {
		final  int TAMANHO = 3;
		int matriz[][]= new int[TAMANHO][TAMANHO];
		String imprimir = "";
		for(int linha=0; linha<TAMANHO; linha++) {
			for(int coluna=0; coluna<TAMANHO; coluna++) {
				
				matriz[linha][coluna]=Integer.parseInt(JOptionPane.showInputDialog("Digite o número:"));
			}
		}
		
		for(int linha=0; linha<TAMANHO; linha++) {
			for(int coluna=0; coluna<TAMANHO; coluna++) {
				
				imprimir += matriz[linha][coluna];
				imprimir += "   ";
			}
			imprimir += "\n"; 
		}
		JOptionPane.showMessageDialog(null, imprimir);
	}

}

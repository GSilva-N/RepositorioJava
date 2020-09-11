package Lista03;
import javax.swing.JOptionPane;

public class Questao04 {
	public static void main(String[] args) {
		
		final int TAMANHO = 2;
		int matrizA[][]= new int[TAMANHO][TAMANHO];
		int matrizB[][]= new int[TAMANHO][TAMANHO];
		int matrizMais[][]= new int[TAMANHO][TAMANHO];
		int matrizMenos[][]= new int[TAMANHO][TAMANHO];
		final int constante;
		String imprimirSoma="", imprimirMenos="", imprimirConstA="", imprimirConstB="", imprimirMatrizA="", imprimirMatrizB="";
		
		//Atribuir valores MATRIZ A
		for(int linha=0; linha<TAMANHO; linha++) {
			for(int coluna=0; coluna<TAMANHO; coluna++) {
				
				matrizA[linha][coluna]=Integer.parseInt(JOptionPane.showInputDialog(" Digite um número (Matriz A):"));	
			}
		}
		//Atribuir valores MATRIZ B
		for(int linha=0; linha<TAMANHO; linha++) {
			for(int coluna=0; coluna<TAMANHO; coluna++) {
				
				matrizB[linha][coluna]=Integer.parseInt(JOptionPane.showInputDialog("Digite um número (Matriz B):"));	
			}
		}
		
		String opcao[] = {"Opções","Somar Matrizes", "Subtrair Matrizes", "Adicionar constante às matrizes", "Imprimir as matrizes"}; 
		
		String entrada = (String) JOptionPane.showInputDialog(null, "Selecione uma opção:", "Modificar Matrizes",
				JOptionPane.QUESTION_MESSAGE,null,opcao, opcao[0]); // Menu opções
		
		if (entrada == "Somar Matrizes") {
			
			for(int linha=0; linha<TAMANHO; linha++) {
				for(int coluna=0; coluna<TAMANHO; coluna++) {
					
					matrizMais[linha][coluna]=matrizA[linha][coluna]+matrizB[linha][coluna];
					
					imprimirSoma += matrizMais[linha][coluna];
					imprimirSoma += "   ";
				}
				imprimirSoma += "\n"; 
			}
			JOptionPane.showMessageDialog(null,"Matriz Soma\n"+imprimirSoma);
			
		} else if(entrada == "Subtrair Matrizes") {
			
			for(int linha=0; linha<TAMANHO; linha++) {
				for(int coluna=0; coluna<TAMANHO; coluna++) {
					
					matrizMenos[linha][coluna]=matrizA[linha][coluna]-matrizB[linha][coluna];
					
					imprimirMenos += matrizMenos[linha][coluna];
					imprimirMenos += "   ";
				}
				imprimirMenos += "\n"; 
			}
			JOptionPane.showMessageDialog(null,"Matriz Subtração\n"+ imprimirMenos);
			
		} else if(entrada == "Adicionar constante às matrizes") {
			
			//Matriz A + CONSTANTE e Matriz B + CONSTANTE
			
			constante=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da Constante"));
			
			for(int linha=0; linha<TAMANHO; linha++) {
				for(int coluna=0; coluna<TAMANHO; coluna++) {
					
					matrizA[linha][coluna]+=constante;
					
					imprimirConstA += matrizA[linha][coluna];
					imprimirConstA += "   ";
					
					matrizB[linha][coluna]+=constante;
					
					imprimirConstB += matrizB[linha][coluna];
					imprimirConstB += "   ";
				}
				imprimirConstA += "\n";
				imprimirConstB += "\n";
			}
			JOptionPane.showMessageDialog(null,"Matriz A + CONSTANTE\n"+imprimirConstA);
			JOptionPane.showMessageDialog(null, "Matriz B + CONSTANTE\n"+imprimirConstB);
			
		} else if (entrada =="Imprimir as matrizes") { // Imprimir Matriz A e B
			
			for(int linha=0; linha<TAMANHO; linha++) { //Matriz A
				for(int coluna=0; coluna<TAMANHO; coluna++) {
					
					imprimirMatrizA += matrizA[linha][coluna];
					imprimirMatrizA += "   ";
					
					imprimirMatrizB += matrizB[linha][coluna];
					imprimirMatrizB += "   ";
				}
				imprimirMatrizA += "\n";
				imprimirMatrizB += "\n"; 
			}
			JOptionPane.showMessageDialog(null,"Matriz A\n"+imprimirMatrizA);
			JOptionPane.showMessageDialog(null,"Matriz B\n"+imprimirMatrizB);			
		}
	}
}

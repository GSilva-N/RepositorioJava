import javax.swing.JOptionPane;

public class ImprimirMatriz {

	public static void main(String[] args) {
			 
		        int nF = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número de filas para la matriz"));
		        int nC = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número de columnas para la matriz"));
		        int m[][] = new int[nF][nC];
		        //Llenar matriz
		        for (int i = 0; i < nF; i++) {
		            for (int j = 0; j < nC; j++) {
		                m[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor para la posición [" + (i + 1) + "," + (j + 1) + "] de la matriz"));
		            }
		        }
		        //Imprimir matriz
		        String resultado = "";
		        for (int i = 0; i < nF; i++) {
		            for (int j = 0; j < nC; j++) {
		                resultado += m[i][j];
		                resultado += "    ";
		            }
		            resultado += "\n";
		        }
		        JOptionPane.showMessageDialog(null, resultado);
	}
}



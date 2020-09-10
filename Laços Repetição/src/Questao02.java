import javax.swing.JOptionPane;

public class Questao02 {

	public static void main(String[] args) {
		int numerosLidos[]= new int[10];
		int pares=0, impares=0;
                           
        
        for(int i = 0; i<numerosLidos.length; i++) {
        	
            numerosLidos[i]= Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(i+1)+"º número "));
            
            if(numerosLidos[i]%2==0) {
            	pares++;
            } else {
				impares++;
			}
        }
        JOptionPane.showMessageDialog(null,pares+" números são pares e "+impares+" são impares");

	}
}

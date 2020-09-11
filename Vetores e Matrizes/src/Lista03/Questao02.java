package Lista03;

import javax.swing.JOptionPane;

public class Questao02 {

	public static void main(String[] args) {
		
		int array[]= new int[6];
		int somaPares=0, impares=0;
		
		for(int i = 0; i<array.length; i++) {
			array[i]= Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(i+1)+"º número "));
		}
		
		for(int i:array) {
			if(i%2==0) {
				System.out.println("Par: "+i);
				somaPares+=i;
			}else {
				System.out.println("Impar: "+i);
				impares++;
			}
		}
		System.out.println("Soma dos pares: "+somaPares);
		System.out.println("Numeros de impares: "+impares);

	}

}

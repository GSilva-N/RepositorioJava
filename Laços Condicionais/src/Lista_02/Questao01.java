package Lista_02;

import javax.swing.JOptionPane;

public class Questao01 {

	public static void main(String[] args) {
	int numerosLidos[]= new int[3];
        
        for(int i = 0; i<numerosLidos.length; i++)
        {
            numerosLidos[i]= Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));    
        }
        int maiorDeles=0;
  
        for(int i = 0; i<numerosLidos.length; i++)
        {
            if (numerosLidos[i]>maiorDeles)
                maiorDeles=numerosLidos[i];
       }
        JOptionPane.showMessageDialog(null,"Maior Deles é:  "+maiorDeles);
	}

	}


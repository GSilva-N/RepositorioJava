package Lista_02;
import javax.swing.JOptionPane;

public class Questao02 {

	public static void main(String[] args) {
		
		int num1,num2, num3, variavel;
		
		num1=Integer.parseInt(JOptionPane.showInputDialog("Digite o 1� n�mero"));
		num2=Integer.parseInt(JOptionPane.showInputDialog("Digite o 2� n�mero"));
		num3=Integer.parseInt(JOptionPane.showInputDialog("Digite o 3� n�mero"));
		
		if(num2 < num1){
	        variavel = num1;
	        num1 = num2;
	        num2 = variavel;
	    }

	    if(num3 < num1){
	    	variavel = num1;
	        num1 = num3;
	        num3 = variavel;
	    }

	    if(num3 < num2){
	    	variavel = num2;
	        num2 = num3;
	        num3 = variavel;
	    }
		
		JOptionPane.showMessageDialog(null,"Ordem crecente "+num1+" "+num2+" "+num3);
		
		
		
			
		
		
      
        

	}

}

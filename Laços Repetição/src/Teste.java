import java.awt.Component;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Teste {

	public static void main(String[] args) {
		int idade, sexo, comportamento;
		int calmo=0, mulheresNervosas=0,  homensAgressivos=0;
		int nervoso40=0, calmo18=0;
		
		JTextField field1 = new JTextField();
		JTextField field2 = new JTextField();
		JTextField field3 = new JTextField();
		
		Object[] message = {
		    "Idade:", field1,
		    "Sexo:", field2,
		    "Comportamento:", field3  
		};
		
		for(int i=0; i<3;i++) {
			int option = JOptionPane.showConfirmDialog(null, message);
		
			
			     idade = Integer.parseInt(field1.getText());
			     sexo = Integer.parseInt(field2.getText());
			     comportamento = Integer.parseInt(field1.getText());
			     
			       	if(comportamento==1) {
						calmo++;
					}
					if(sexo==1 && comportamento==2) {
						mulheresNervosas++;
					}
					if(sexo==2 && comportamento==3) {
						homensAgressivos++;
					}
					
					if(idade>40 && comportamento==2){
						nervoso40++;
					}
					if(idade<18 && comportamento==1){
						calmo18++;
					} 
		}
		JOptionPane.showMessageDialog(null,"Pessoas calmas: "+calmo+"\nMulheres Nervosas: "+mulheresNervosas+
				"\nHomens Agressivos: "+homensAgressivos+"\nNervosos com mais de 40 anos: "+nervoso40
				+"\nCalmos com menos de 18: "+calmo18);
		  
	   }	
		
}



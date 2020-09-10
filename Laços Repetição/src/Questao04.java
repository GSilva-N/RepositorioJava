import javax.swing.JOptionPane;

public class Questao04 {

	public static void main(String[] args) {
		
		int idade, sexo, comportamento;
		int contador=0, calmo=0, mulheresNervosas=0,  homensAgressivos=0;
		int nervoso40=0, calmo18=0;
		while(contador<5){
			
			idade= Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
			sexo= Integer.parseInt(JOptionPane.showInputDialog("Qual seu sexo?\n1-F  2-M"));
			comportamento=Integer.parseInt(JOptionPane.showInputDialog("Qual é o seu Comportamento?\n1-Calmo 2-Nervoso 3-Agressivo"));
			
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
			contador++;
		}
		JOptionPane.showMessageDialog(null,"Pessoas calmas: "+calmo+"\nMulheres Nervosas: "+mulheresNervosas+
				"\nHomens Agressivos: "+homensAgressivos+"\nNervosos com mais de 40 anos: "+nervoso40
				+"\nCalmos com menos de 18: "+calmo18);

	}

}

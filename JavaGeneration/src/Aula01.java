import javax.swing.JOptionPane;

class Aula01 {

	public static void main(String[] args) {
		String nomeUsuario;
		int anoNascimento;
		nomeUsuario = JOptionPane.showInputDialog("Escreva seu nome:");
		anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de Nascimento"));
		JOptionPane.showMessageDialog(null, "O seu nome é: "+nomeUsuario);
		JOptionPane.showMessageDialog(null, "Você nasceu no ano : "+anoNascimento);
		JOptionPane.showMessageDialog(null, "Sua idade é de : "+(2020-anoNascimento)+" anos");
		
		
	}

}
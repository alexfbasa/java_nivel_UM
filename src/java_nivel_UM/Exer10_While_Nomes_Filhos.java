package java_nivel_UM;

import javax.swing.JOptionPane;

public class Exer10_While_Nomes_Filhos {

	public static void main(String[] args) {

		String qtdFilhos = JOptionPane.showInputDialog("Quantos filhos voce tem? ");
		int filhosTotal = Integer.parseInt(qtdFilhos);

		int ct = 1;
		String rel = "";
		
		while (ct <= filhosTotal) {
			String nome = JOptionPane.showInputDialog("Digite o " + ct + " nome:");
			String idade = JOptionPane.showInputDialog("Digite a " + ct + " idade");
			//Nao esquecer de += para incrementar o resultado
			rel += "Nome = " + nome + " idade= " + idade + "\n";
			ct++;

		}
		JOptionPane.showMessageDialog(null, rel);
		System.exit(0);
	}

}

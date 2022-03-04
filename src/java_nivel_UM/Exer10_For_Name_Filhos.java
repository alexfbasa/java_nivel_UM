package java_nivel_UM;

import javax.swing.JOptionPane;

public class Exer10_For_Name_Filhos {

	public static void main(String[] args) {

		String qtdFilhos = JOptionPane.showInputDialog("Quantos filhos voce tem?");
		int getFilhos = Integer.parseInt(qtdFilhos);

		String rel = "";
		for (int ct = 1; ct <= getFilhos; ct++) {
			String nome = JOptionPane.showInputDialog("Digite o nome do " + ct + " filho");
			String idade = JOptionPane.showInputDialog("Digite idade do " + ct + " filho");
			rel += "O " + nome + " tem " + idade + " anos \n";
		}
		JOptionPane.showMessageDialog(null, rel);
		System.exit(0);
	}

}

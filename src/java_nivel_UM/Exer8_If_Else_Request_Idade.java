package java_nivel_UM;

import javax.swing.JOptionPane;

public class Exer8_If_Else_Request_Idade {

	public static void main(String[] args) {
		
		int idadeCNH = 16;

		String name = JOptionPane.showInputDialog("Qual o seu nome");
		String valorIdade = JOptionPane.showInputDialog("Quantos anos voce tem");
		int idade = Integer.parseInt(valorIdade);

		String relatorio = "";
		if (idade >= idadeCNH) {
			relatorio = String.format("Eih " + name + " voce tem " + idade + " e pode tirar CNH");
		} else {
			relatorio = String.format("Eih " + name + " voce nao eh maior de " + idadeCNH + " e nao pode tirar CNH");
		}
		JOptionPane.showMessageDialog(null, relatorio);

		System.exit(0);
	}

}

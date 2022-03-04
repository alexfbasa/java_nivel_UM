package java_nivel_UM;

import javax.swing.JOptionPane;

public class Exer13_If_Dinamico_CNH {

	public static void main(String[] args) {

		int idadeCNH = 16;
		String getIdade = JOptionPane.showInputDialog("Quantos anos voce tem?");
		int idade = Integer.parseInt(getIdade);

		String rel = idade >= idadeCNH ? "Parabens" : "Espera mais um pouco";

		JOptionPane.showMessageDialog(null, rel);

		System.exit(0);

	}

}

package java_nivel_UM;

import javax.swing.JOptionPane;

public class Exer10_While_Salarios {
	
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Qual o nome do colaborador? " );
		int contador = 1;
		double totais = 0;
		
		while (contador <= 12) {
			String getValores = JOptionPane.showInputDialog("Insira o valor do " + contador + "salario");
			double salarios = Integer.parseInt(getValores);
			totais += salarios;
			++contador;
			
		}
		double media = totais / 12 ;
		String relatorio = "A media dos salario somados do " + nome + " dao: " + media;
		
		JOptionPane.showMessageDialog(null, relatorio);
		
		System.exit(0);
	}

}

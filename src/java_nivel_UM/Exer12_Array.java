package java_nivel_UM;

import javax.swing.JOptionPane;

public class Exer12_Array {

	public static void main(String[] args) {
		
		int valor = 10;
		
		int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, valor};
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("--> Contando" + numeros[i]);
		}
		System.out.println("Terminando");

	}

}

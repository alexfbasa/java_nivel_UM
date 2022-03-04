package java_nivel_UM;

import java.util.Scanner;

public class Exer5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Insira o nome");
		String nome = scanner.next();

		System.out.println("O nome fornecido foi " + nome);
		String tudoUpper = nome.toUpperCase();
		
		System.out.println("Usando UpperCase " + tudoUpper);
		scanner.close();

	}
}

package java_nivel_UM;

public class Exer4 {
	
	String nome;
	int idade;
	String endereco;
	
	
	public Exer4(String nome, int idade, String endereco) {
		
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
	}
	
	public static void main(String[] args) {
		
		Exer4 teste1 = new Exer4("Alexandre", 38, "Algum lugar no mundo");
		
		System.out.println(teste1);
	}

}

package java_nivel_UM;

public class Exer11_Continue_Brake {

	public static void main(String[] args) {

		System.out.println("Iniciando o Sistema");
		for (int ct = 1; ct <= 1000; ct++) {
			if (ct == 9) {
				continue;
			}else if(ct == 22) {
				break;
			}
			System.out.println("--> Executando" + ct);
		}
		System.out.println("######### Encerrando #########");
	}

}

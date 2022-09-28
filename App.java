package stringreferencia;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		CifraDeCesar cifra = new CifraDeCesar();
		boolean exec = true;
		@SuppressWarnings("resource")
		Scanner dig = new Scanner(System.in);
		String texto = "";
		while (exec) {
			texto = "";
			System.out.println("Digite uma opcao:\n1 - Decifrar\n2 - Cifrar\n3 - Sair");
			texto = dig.nextLine();
			System.out.println("_________________________________________");
			if ("3".equalsIgnoreCase(texto)) {
				exec = false;
				texto = "";
			} else if ("2".equalsIgnoreCase(texto)) {
				System.out.println("Digite a palavra:");
				texto = dig.nextLine();
				System.out.println("Palavra digitada: " + texto);
				System.out.println("Palavra cifrada: " + cifra.cifrar(texto));
				System.out.println("_________________________________________");
				texto = "";
			} else if ("1".equalsIgnoreCase(texto)) {
				System.out.println("Digite a palavra:");
				texto = dig.nextLine();
				System.out.println("Palavra digitada: " + texto);
				System.out.println("Palavra decifrada: " + cifra.decifrar(texto));
				System.out.println("_________________________________________");
				texto = "";
			}

		}

	}

}
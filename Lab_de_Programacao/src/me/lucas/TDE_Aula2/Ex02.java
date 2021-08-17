package me.lucas.TDE_Aula2;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String usuario = "";
		String senha = "";

		int tentativas = 3;

		while (!usuario.equals("java8") && !senha.equals("java8") && tentativas <= 3 && tentativas > 0) {

			System.out.println("Usuário: ");
			usuario = sc.next();

			System.out.println("Senha: ");
			senha = sc.next();

			tentativas--;

			if (tentativas > 0 && !usuario.equals("java8") && !senha.equals("java8")) {
				System.out.println("\nCredenciais incorreta Você tem " + tentativas + " restantes.\n");
			} else if (!usuario.equals("java8") && !senha.equals("java8")) {
				System.out.println("Sem tentativas restantes.");
			}

		}

		if (usuario.equals("java8") && senha.equals("java8")) {
			System.out.println("Logado com sucesso. Logado como: " + usuario + ".");
		} else {
			System.out.println("Esqueceu sua senha?");
		}

		sc.close();
	}

}
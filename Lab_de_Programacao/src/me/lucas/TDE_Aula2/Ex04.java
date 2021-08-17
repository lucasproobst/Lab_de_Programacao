package me.lucas.TDE_Aula2;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int numero = sc.nextInt();

		int formula = 0;

		for (int i = 1; i <= 10; i++) {
			formula = i * numero;
			System.out.println(numero + "x" + i + " = " + formula);
		}

		sc.close();
	}

}
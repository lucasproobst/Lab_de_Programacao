package me.lucas;

import java.util.Scanner;

public class TDE_Aula1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double peso;
		double formula;

		
		System.out.println("Digite seu peso: ");
		peso = sc.nextDouble();
		
		formula = peso / 9.81 * 1.622;
		System.out.println("Peso na lua: " + formula + " quilogramas");

		sc.close();
	}

}

// A gravidade da Lua é cerca de 17% a da Terra. 
// Crie um programa que calcule seu peso na Lua
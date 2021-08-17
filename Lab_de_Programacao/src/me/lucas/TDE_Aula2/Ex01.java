package me.lucas.TDE_Aula2;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double valor_produto = 0;
		double desconto = 0;
		double percentual_desconto = 0;
		double novo_valor = 0;

		System.out.println("Digite o valor do produto: ");
		valor_produto = sc.nextDouble();

		System.out.println("Digite o percentual de desconto: ");
		percentual_desconto = sc.nextDouble();

		desconto = (valor_produto * percentual_desconto) / 100;

		novo_valor = valor_produto - desconto;

		System.out.println("--------PRODUTO--------");
		System.out.println("Valor sem desconto: " + valor_produto);
		System.out.println("Valor com desconto: " + novo_valor);
		System.out.println("--------PRODUTO--------");

		sc.close();
	}

}

// Usando a classe Scanner para entrada de dados,
// crie uma classe que receba o valor de um produto e a porcentagem de desconto, 
// calcule e mostre o valor do desconto e o valor do produto com o desconto. 
// Observação: 
// o valor do desconto é calculado por meio da 
// fórmula: valor do desconto = valor do produto * percentual de desconto / 100. 

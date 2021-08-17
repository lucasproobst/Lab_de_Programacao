package me.lucas.TDE_Aula2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double valor_originial, novo_valor = 0, desconto;
		String nome_produto;

		nome_produto = JOptionPane.showInputDialog("Nome do produto: ");

		valor_originial = Integer.parseInt(JOptionPane.showInputDialog("Valor do produto: "));

		if (valor_originial >= 50 && valor_originial < 200) {
			desconto = valor_originial * 5 / 100;
			novo_valor = valor_originial - desconto;

			JOptionPane
					.showMessageDialog(null,
							"Produto: " + nome_produto + "\n Valor: R$ " + valor_originial + "\n Desconto: R$ "
									+ desconto + "\n Valor com desconto: R$ " + novo_valor,
							null, JOptionPane.INFORMATION_MESSAGE);
		} else if (valor_originial >= 200 && valor_originial < 500) {
			desconto = valor_originial * 6 / 100;
			novo_valor = valor_originial - desconto;

			JOptionPane
					.showMessageDialog(null,
							"Produto: " + nome_produto + "\n Valor: R$ " + valor_originial + "\n Desconto: R$ "
									+ desconto + "\n Valor com desconto: R$ " + novo_valor,
							null, JOptionPane.INFORMATION_MESSAGE);
		} else if (valor_originial >= 500 && valor_originial < 1000) {
			desconto = valor_originial * 7 / 100;
			novo_valor = valor_originial - desconto;

			JOptionPane
					.showMessageDialog(null,
							"Produto: " + nome_produto + "\n Valor: R$ " + valor_originial + "\n Desconto: R$ "
									+ desconto + "\n Valor com desconto: R$ " + novo_valor,
							null, JOptionPane.INFORMATION_MESSAGE);
		} else {
			desconto = valor_originial * 8 / 100;
			novo_valor = valor_originial - desconto;

			JOptionPane
					.showMessageDialog(null,
							"Produto: " + nome_produto + "\n Valor: R$ " + valor_originial + "\n Desconto: R$ "
									+ desconto + "\n Valor com desconto: R$ " + novo_valor,
							null, JOptionPane.INFORMATION_MESSAGE);
		}

		sc.close();

	}

}

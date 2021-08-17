package me.lucas.TDE_Aula2;

/**
*
*/

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * O Imposto sobre a Transmissão de Bens Móveis (ITBI) é aplicado sobre o
 * valor de um imóvel a ser negociado.
 *
 * A base de cálculo do ITBI (o valor a ser considerado no cálculo) será o
 * maior valor entre o valor de transação (o valor negociado) e o valor venal
 * de referência (fornecido pela Prefeitura).
 *
 * Com base nisso, elabore uma classe que receba o valor da transação, o valor
 * venal e o percentual de imposto. Após isso, encontre o maior valor e aplique
 * o percentual sobre ele. Ao final, apresente o valor do imposto a ser pago.
 *
 * Observação: o valor do imposto a ser pago é
 *
 * calculado por meio da fórmula:
 *
 * valor do imposto = maior valor * percentual / 100. Para entrada e saída de
 * dados
 *
 *
 * utilize a classe JOptionPane.
 *
 */
public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double imposto = 0;
		int maior_valor = 0;
		int percentual = 0;
		double transacao = 0.0;
		double valor_venal = 0.0;

		String leia;

		leia = JOptionPane.showInputDialog("Digite o valor da transação: ");
		transacao = Double.parseDouble(leia);

		leia = JOptionPane.showInputDialog("Digite o valor venal: ");
		valor_venal = Double.parseDouble(leia);

		leia = JOptionPane.showInputDialog("Digite o percentual do imposto: ");
		percentual = Integer.parseInt(leia);

		if (transacao > valor_venal) {
			maior_valor = (int) transacao;

			imposto = maior_valor * percentual / 100;
		} else if (valor_venal > transacao) {

			maior_valor = (int) valor_venal;
		} else {
			JOptionPane.showMessageDialog(null, "Os valores são iguais, portanto não há um maior valor!", null,
					JOptionPane.INFORMATION_MESSAGE);
		}

		JOptionPane.showMessageDialog(null, "Valor de imposto a ser pago: R$ " + imposto, null,
				JOptionPane.INFORMATION_MESSAGE);

		sc.close();

	}

}
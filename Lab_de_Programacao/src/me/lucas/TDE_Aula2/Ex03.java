package me.lucas.TDE_Aula2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int media;
		int nota_prova, nota_prova2, nota_trabalho;

		nota_prova = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota da primeira prova: "));

		nota_prova2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota da segunda prova: "));

		nota_trabalho = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do trabalho: "));

		media = (nota_prova + nota_prova2 + nota_trabalho) / 3;

		if (media >= 6) {
			JOptionPane.showMessageDialog(null, "APROVADO! \n sua nota: " + media, null,
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "REPROVADO! \n sua nota: " + media, null,
					JOptionPane.INFORMATION_MESSAGE);
		}

		sc.close();
	}

}

package arrays;

import java.util.Locale;
import java.util.Scanner;

public class DesafioArray {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

    System.out.print("Quantas notas: ");

    int qtdeNotas = entrada.nextInt();

    double[] notas = new double[qtdeNotas];

    for (int i = 0; i < notas.length; i++) {
      System.out.print("Informe a nota " + (i + 1) + ": ");
      String notaStr = entrada.next().replace(',', '.');
      notas[i] = Double.parseDouble(notaStr);
    }

    double total = 0;
    for (double nota : notas) {
      total += nota;
    }

    double media = total / notas.length;
    System.out.println("A média é " + media + "!");
    entrada.close();
  }
}

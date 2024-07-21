package fundamentos.exercicios;

import java.util.Scanner;

public class SegundoGrau {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite o valor de a: ");
    int a = entrada.nextInt();
    System.out.print("Digite o valor de b: ");
    int b = entrada.nextInt();
    System.out.print("Digite o valor de c: ");
    int c = entrada.nextInt();

    double delta = Math.pow(b, 2) - (4 * a) * c;

    System.out.printf("O valor de delta é %.2f\n", delta);
  }
}

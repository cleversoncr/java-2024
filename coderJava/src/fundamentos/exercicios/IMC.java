package fundamentos.exercicios;

import java.util.Scanner;

public class IMC {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite o peso: ");
    double peso = entrada.nextDouble();
    System.out.print("Digite a altura: ");
    double altura = entrada.nextDouble();

    double resultado = peso / Math.pow(altura,2);

    System.out.printf("O IMC é %.2f", resultado);

  }
}

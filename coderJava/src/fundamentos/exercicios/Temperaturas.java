package fundamentos.exercicios;

import java.util.Scanner;

public class Temperaturas {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite o valor da temperatura: ");
    double temp = entrada.nextDouble();

    double resul1 = (temp - 32) / 1.8;
    double resul2 = (temp * 1.8) + 32;

    System.out.printf("A temperatura em ºC é: %.2f\n", resul1);
    System.out.printf("A temperatura em ºF é: %.2f\n", resul2);
    entrada.close();
  }
}

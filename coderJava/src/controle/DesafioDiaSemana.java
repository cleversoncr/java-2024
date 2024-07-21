package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite o dia da semana: ");

    String dia = entrada.next();

    if (dia.equalsIgnoreCase("Domingo")) {
      System.out.println(1);
    } else if ("Segunda".equalsIgnoreCase(dia)) {
      System.out.println(2);
    } else if ("Terça".equalsIgnoreCase(dia) || "Terca".equalsIgnoreCase(dia)) {
      System.out.println(3);
    } else if (("Quarta").equalsIgnoreCase(dia)) {
      System.out.println(4);
    } else if ("Quinta".equalsIgnoreCase(dia)) {
      System.out.println(5);
    } else if ("Sexta".equalsIgnoreCase(dia)) {
      System.out.println(6);
    }else if ("Sábado".equalsIgnoreCase(dia) || "Sabado".equalsIgnoreCase(dia)) {
      System.out.println(7);
    } else {
      System.out.println("Dia inválido!");
    }

    entrada.close();
  }
}

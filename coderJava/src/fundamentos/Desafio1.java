package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class Desafio1 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    Scanner scan = new Scanner(System.in);

    System.out.print("Digite o primeiro valor: ");
    String val1 = scan.nextLine().replace(',', '.');

    System.out.print("Digite o segundo valor: ");
    String val2 = scan.nextLine().replace(',', '.');

    System.out.print("Digite o terceiro valor: ");
    String val3 = scan.nextLine().replace(',', '.');

    double sal1 = Double.parseDouble(val1);
    double sal2 = Double.parseDouble(val2);
    double sal3 = Double.parseDouble(val3);

    double media = ((sal1 + sal2 + sal3) / 3);

    System.out.println("A média dos salários é: " + media);

    scan.close();
  }
}
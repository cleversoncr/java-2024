package fundamentos;

import java.util.Scanner;

public class Desafio4 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite o primeiro número: ");
    String n1 = entrada.next();
    System.out.print("Digite o segundo número: ");
    String n2 = entrada.next();
    System.out.print("Digite o operador: ");
    String opr = entrada.next();

    double num1 = Double.parseDouble(n1);
    double num2 = Double.parseDouble(n2);
    char op = opr.charAt(0);

    double calc;

    switch (op) {
      case '-':
        calc = num1 - num2;
        break;
      case '+':
        calc = num1 + num2;
        break;
      case '*':
        calc = num1 * num2;
        break;
      case '/':
        calc = num1 / num2;
        break;
      case '%':
        calc = num1 % num2;
        break;
      default:
        calc = Double.NaN;
    }

    System.out.println("O resultado é: " + calc);
    entrada.close();
  }
}

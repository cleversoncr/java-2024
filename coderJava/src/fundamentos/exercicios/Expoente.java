package fundamentos.exercicios;

public class Expoente {
  public static void main(String[] args) {

    double valor = 234;

    double quadrado = Math.pow(valor,2);
    double cubo = Math.pow(valor,3);

    System.out.printf("Número %.2f elevado ao quadrado %.2f\n", valor, quadrado);
    System.out.printf("Número %.2f elevado ao cubo %.2f\n", valor, cubo);
  }
}

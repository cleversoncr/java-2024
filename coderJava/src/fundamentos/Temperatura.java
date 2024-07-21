package fundamentos;

public class Temperatura {
  public static void main(String[] args) {
    // (ºF - 32) x 5/9 = ºC
    final double FATOR = 32;
    final double MULTIPLICADOR = 5.0 / 9.0;
    double f = 0;
    double c;

    c = (f - FATOR) * MULTIPLICADOR;

    System.out.println("A temperatura em é " + c + "ºC ");
  }
}

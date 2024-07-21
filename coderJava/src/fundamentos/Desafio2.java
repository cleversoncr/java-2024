package fundamentos;

public class Desafio2 {
  public static void main(String[] args) {

    int a = 3;
    int b = 2;
    int c = 6;
    int d = 1;
    int e = 5;
    int f = 7;
    int g = 10;
    double calc1;
    double calc2;
    double calc3;
    double powCalc1;
    double powCalc2;
    double powCalc3;
    double powCalc4;

    calc1 = (double) c * (a + b);
    calc2 = (double) ((d - e) * (b - f)) / b;
    calc3 = Math.pow(g, a);

    powCalc1 = (Math.pow(calc1, 2)) / (a * b);
    powCalc2 = Math.pow(calc2, 2);
    powCalc3 = Math.pow((powCalc1 - powCalc2), 3);
    powCalc4 = powCalc3 / calc3;

    System.out.println("O resultado é " + powCalc4);

  }
}

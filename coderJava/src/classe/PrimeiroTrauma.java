package classe;

public class PrimeiroTrauma {

  int a = 3; //variável de instância
  static int b = 4; //membro estático

  public static void main(String[] args) {

    PrimeiroTrauma p = new PrimeiroTrauma(); //criando instância
    System.out.println(p.a);

    System.out.println(b); //chamando membro estático
  }
}

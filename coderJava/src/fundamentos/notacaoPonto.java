package fundamentos;

public class notacaoPonto {
  public static void main(String[] args) {

    double a = 2.3;
    String s = "Bom dia X";
    s = s.replace("X", "Senhora");
    s = s.toUpperCase();
    s = s.concat("!!!");

    System.out.println(s);

    String x = "Leo".toUpperCase();
    System.out.println(x);

    String y = "Bom dia X"
            .replace("X", "Cleverson")
            .toUpperCase()
            .concat("!!!");
    System.out.println(y);

//Tipos primitivos não tem o operador "."
  }
}


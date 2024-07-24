package classe;

public class DataTeste {

  public static void main(String[] args) {

    Data d1 = new Data();
    d1.dia = 24;
    d1.mes = "Julho";
    d1.ano = 2024;

    var d2 = new Data();
    d2.dia = 11;
    d2.mes = "Setembro";
    d2.ano = 2001;

    System.out.printf("Hoje é %d de %s de %d\n", d1.dia, d1.mes, d1.ano);
    System.out.printf("No dia %d de %s de %d ocorreu o atendado terrorista nos EUA", d2.dia, d2.mes, d2.ano);
  }
}

package classe;

public class Data {

  int dia;
  String mes;
  int ano;

  Data() {
    dia = 1;
    mes = "Janeiro";
    ano = 1970;
  }

  Data(int diaInicial, String mesInicial, int anoInicial) {
    dia = diaInicial;
    mes = mesInicial;
    ano = anoInicial;
  }

  String obterDataFormatada() {
    return String.format("Hoje é %d de %s de %d", dia, mes, ano);
  }
}

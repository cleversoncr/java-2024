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

//  Data(int diaInicial, String mesInicial, int anoInicial) {
//    dia = diaInicial;
//    mes = mesInicial;
//    ano = anoInicial;
//  }

  Data(int dia, String mes, int ano) {
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
  }

  String obterDataFormatada() {
    return String.format("Hoje é %d de %s de %d", dia, mes, ano);
  }
}

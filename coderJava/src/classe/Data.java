package classe;

public class Data {

  int dia;
  String mes;
  int ano;

  String obterDataFormatada() {
    return String.format("Hoje é %d de %s de %d", dia, mes, ano);
  }
}

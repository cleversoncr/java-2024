package classe;

public class Produto {

  String nome;
  double preco;
  double desconto;

  Produto(String nomeInicial, double precoInicial, double descontoInicial) {
    nome = nomeInicial;
    preco = precoInicial;
    desconto = descontoInicial;
  }

  Produto() {
  }

  double precoComDesconto() {
    return preco * (1 - desconto);
  }

  double precoComDesconto(double descontoDoGerente) {
    return preco * (1 - desconto + descontoDoGerente);
  }
}

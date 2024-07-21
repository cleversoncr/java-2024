package fundamentos;

public class Desafio3 {
  public static void main(String[] args) {

    boolean trabalho1 = false;
    boolean trabalho2 = false;
    boolean comprouTV50 = trabalho1 && trabalho2;
    boolean comprouTV32 = trabalho1 ^ trabalho2;
    boolean comprouSorvete = trabalho1 || trabalho2;
    boolean maisSaudavel = !comprouSorvete;

    System.out.println("Comprou TV 50\"? " + comprouTV50);
    System.out.println("Comprou TV 32\"? " + comprouTV32);
    System.out.println("Vai tomar sorvete\"? " + comprouSorvete);
    System.out.println("Mais saudável? " + maisSaudavel);

  }
}

/*
Trabalho na terça (V ou F)
Trabalho na quinta (V ou F)
- Se os dois derem certo => compra TV 50"
- Se apenas um dos dois derem certo => compra TV 32"
- Ou comprando uma TV de 50" ou 32" => tomamos sorvete
- Se ambos os trabalhos derem errado, fica em casa (negação lógica)
* */
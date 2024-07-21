package controle;

import java.util.Scanner;

public class DesafioWhile {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    int quantidadeDeNotas = 0;
    double nota = 0;
    double total = 0;

    while (nota != -1) {
      System.out.print("Informe a nota a nota (ou -1 para sair): ");
      nota = entrada.nextDouble();

      if (nota <= 10 && nota >= 0) {
        total += nota;
        quantidadeDeNotas++;
      } else if (nota != -1) {
        System.out.println("Nota Inválida!");
      }
    }

    double media = total / quantidadeDeNotas;
    System.out.println("Média = " + media);

    entrada.close();

  }
}

// Calcule a média das notas de uma turma
// Não sabemos a quantidade de alunos
// de 0 a 10
// armazena a nota na variável total, soma de todas as notas
// outra variável que armazeno as notas válidas, quantidade de notas digitadas
// quando quiser sair o usuário vai digitar -1
// ao sair, mostrar o cálculo da média
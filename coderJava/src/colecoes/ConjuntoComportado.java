package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
  public static void main(String[] args) {

//    Quando uso <String> obrigatoriamente a lista será do tipo String.
//    Set<String> lista = new HashSet<>();
//    lista.add("1.2");
    SortedSet<String> listaAprovados = new TreeSet<>(); // O TreeSet garante a ordem de inserção
    listaAprovados.add("Ana");
    listaAprovados.add("Carlos");
    listaAprovados.add("Luca");
    listaAprovados.add("Pedro");

    for (String candidatos : listaAprovados) {
      System.out.println(candidatos);
    }

    Set<Integer> nums = new HashSet<>();
    nums.add(1);
    nums.add(2);
    nums.add(120);
    nums.add(6);

    for (int n : nums) {
      System.out.println(n);
    }
  }
}

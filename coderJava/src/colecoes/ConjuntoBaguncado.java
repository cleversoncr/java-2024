package colecoes;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "rawtypes"})
public class ConjuntoBaguncado {

  public static void main(String[] args) {

    HashSet conjunto = new HashSet();

    conjunto.add(1.2); // double -> Double
    conjunto.add(true); // boolean -> Boolean
    conjunto.add("Teste"); // String
    conjunto.add(1); // int -> Interger
    conjunto.add('x'); // char -> Caractere

    System.out.println("Tamanho é " + conjunto.size());

    conjunto.add("teste");
    conjunto.add('x'); // não aceita repeticao
    System.out.println("Tamanho é " + conjunto.size());

    System.out.println(conjunto.remove('x'));

    System.out.println("Tamanho é " + conjunto.size());
    System.out.println(conjunto.contains('x'));

    Set nums = new HashSet();
    nums.add(1);
    nums.add(2);
    nums.add(3);

    System.out.println(nums);
    System.out.println(conjunto);

//    conjunto.addAll(nums); // União entre dois conjuntos
    conjunto.retainAll(nums); // Intercessão entre dois conjuntos
    System.out.println(conjunto);

    conjunto.clear();
    System.out.println(conjunto);
  }
}

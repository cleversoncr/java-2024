package academy.devdojo.maratonajava.introducao;

/**
 * Nomenclaturas (convenção)<br><br>
 * Classes >>> padrão camelcase, sendo que a primeira <b>sempre</b> será maiúscula.<br>
 * Variáveis >>> padrão camelcase, mas a primeira <b>sempre</b> será minúscula.
 */
public class Aula02TiposPrimitivos {
  public static void main(String[] args) {
    // int, double, float, char, byte, short, long, boolean
    int idade = 10;
    int idadeCasting = (int) 10000000000L;
    long numeroGrande = 100000L;
    double salarioDouble = 2000.0D;
    float salarioFloat = 2000.0F;
    byte salarioByte = 127;
    short salarioShort = 32000;
    boolean verdadeiro = true;
    boolean falso = false;
    char caractere = '\u0041';

    System.out.println("A idade é " + idade + " anos.");
    System.out.println(verdadeiro);
    System.out.println("char " + caractere);
    System.out.println("float " + salarioFloat);
    System.out.println(idadeCasting);
  }
}

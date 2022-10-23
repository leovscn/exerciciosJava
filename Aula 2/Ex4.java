import java.util.Scanner;

public class Ex4 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String frase = sc.nextLine();

    System.out.println(frase);
    frase = frase.replace(" ", ""); // remove o espaço do meio;
    System.out.println("a frase reversa e sem espaços: ");

    for (int i = frase.length() - 1; i >= 0; i--) { // int i = n - 1, para o indice dar certo

      System.out.print(frase.charAt(i));
    }

    sc.close();
  }

}

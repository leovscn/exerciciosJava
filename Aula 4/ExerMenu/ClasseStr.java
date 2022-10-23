package ExerMenu;

import java.util.Scanner;

public class ClasseStr {

  public static String maiusculas(String a) {
    return (a.toUpperCase());

  }

  public static boolean pertence() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Escreva a frase A: ");
    String a = scan.nextLine();
    a = a.toLowerCase();
    System.out.println("Escreva a frase B: ");
    String b = scan.nextLine();
    b = b.toLowerCase();

    boolean ok = false;
    for (int i = 0; i < b.length(); i++) {
      for (int j = 0; j < a.length(); j++) {

        if (b.charAt(i) == a.charAt(j)) {
          ok = true;

          break;
        }
      }
    }
    scan.close();
    return ok;
  }

  public static void imprimeString(String a) {

    System.out.println(a);
  }

  public static void imprimeInt(int a) {

    System.out.println(a);
  }

}

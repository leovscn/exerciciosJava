import java.util.Scanner;

public class Ex6 {
  // -------------------------------------------//
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.err.println("Insira o valor de x: ");
    int x = scan.nextInt();
    while (x > 1) {
      if (x % 2 == 0) {
        x = x / 2;
      } else {

        x = 3 * x + 1;
      }
      System.out.println(x);
    }

    scan.close();
  }
  // -------------------------------------------//

}
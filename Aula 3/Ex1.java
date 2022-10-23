import java.util.Arrays;
import java.util.Scanner;

/**
 * Ex1
 */
public class Ex1 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    double notas[] = new double[5];

    double soma = 0;
    for (int i = 0; i < notas.length; i++) {

      notas[i] = sc.nextDouble();
      soma = soma + notas[i];
    }
    sc.close();
    System.out.println("A média das notas é: " + soma / notas.length);
    Arrays.sort(notas);

    for (int i = notas.length - 1; i >= 0; i--) {
      System.out.print((notas[i] + "\t"));
    }

  }
}

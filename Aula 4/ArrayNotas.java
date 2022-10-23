import java.util.Arrays;
import java.util.Scanner;
public class ArrayNotas {
  public static void main(String[] args) {
    recebeNotas();
  }
  public static void recebeNotas() {
    int[] notas = new int[5];
    int ac = 0;
    int i;
    for (i = 0; i < notas.length; i++) {
      System.out.println("Insira nota " + (i + 1));
      notas[i] = new Scanner(System.in).nextInt();
      ac = notas[i] + ac;
    }
    Arrays.sort(notas);

    for (i = notas.length -1 ; i >= 0 ; i--) {
      System.out.print(notas[i]+"\t");
    }
    int media = ac / notas.length;
    System.out.println("Nota total: " + ac + "\nE média: " + media);
  }
}

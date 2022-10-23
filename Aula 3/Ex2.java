/**
 * Ex2
 */
public class Ex2 {

  public static void main(String[] args) {
    double array[][] = new double[40][40];

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length; j++) {
        array[i][j] = (int) (Math.random() * 255) + 1;
        System.out.print((int) array[i][j] + "\t");

      }
      System.out.println("\n");
    }
  }
}
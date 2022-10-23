/**
 * Ex1 - DADO
 */
public class Ex1 {
  public static void main(String[] args) {

    double result = 0;
    for (int i = 0; i < 3; i++) {
      double nrDado = (int) (Math.random() * 6) + 1;
      result = result + nrDado;
      System.out.println("Resultado do giro: " + nrDado);
    }
    System.out.println("Resultado total: " + result);

  }

}
public class Ex4 {
  // -------------------------------------------//
  public static void main(String[] args) {
    int fatorial = 1;
    for (int i = 1; i < 11; i++) {
      fatorial *= i; // mesmo que fatorial = fatorial * i;
      System.out.println(i + "!" + " = " + fatorial);
    }

  }
  // -------------------------------------------//
}

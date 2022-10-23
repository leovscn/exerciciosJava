public class Ex5 {
  // -------------------------------------------//
  public static void main(String[] args) {

    int n1 = 0;
    int n2 = 1;
    int aux = 0;
    System.out.println("O");
    System.out.println("1");
    while (n2 < 100) {
      aux = n1;
      n1 = n2;
      n2 = aux + n1;
      System.out.println(n2);
      ;
    }
  }
  // -------------------------------------------//
}

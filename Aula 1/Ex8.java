import java.util.Scanner;

public class Ex8 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Escreva o número do mês desejado :");
    int n = scan.nextInt();
    switch (n) {
      case 1, 3, 5, 7, 8, 10, 12:
        System.out.println("31 dias");
        break;
      case 2:
        System.out.println("28 dias, e uma vez a cada 4 anos, possui 29 dias.");

        break;
      case 4, 6, 9, 11:
        System.out.println("30 dias");
        break;
      default:
        System.out.println("Este não é um mês válido");

        break;
    }

    scan.close();
  }

}

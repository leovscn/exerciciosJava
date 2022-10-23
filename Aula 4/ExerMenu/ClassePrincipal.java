package ExerMenu;

import java.util.Scanner;

public class ClassePrincipal {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print(
        "\tSomente valores inteiros \n1 - Dobro\n2 - Triplo\n3 - Multiplicação\n4 - Potencia\n5 - Maiúscula\n6 - Pertence\n9 - Sair\n");
    int controlador = scan.nextInt();
    int n;
    int n2;

    while (controlador != 9) {

      switch (controlador) {
        case 1:
          System.out.println("Escreva o valor a ser dobrado: ");
          n = scan.nextInt();
          System.out.println("Resultado:  ");
          ClasseStr.imprimeInt(ClasseMat.dobro(n));
          break;
        case 2:
          System.out.println("Escreva o valor a ser triplicado: ");
          n = scan.nextInt();
          System.out.println("Resultado:  ");
          ClasseStr.imprimeInt(ClasseMat.triplo(n));
          break;

        case 3:
          System.out.println("Escreva o valor 1 : ");
          n = scan.nextInt();
          System.out.println("Escreva o valor 2: ");
          n2 = scan.nextInt();
          System.out.println("Resultado: ");
          ClasseStr.imprimeInt(ClasseMat.mult(n, n2));
          break;

        case 4:
          System.out.println("Escreva o valor base : ");
          n = scan.nextInt();
          System.out.println("Escreva o valor da potência : ");
          n2 = scan.nextInt();
          System.out.println("Resultado: ");
          ClasseStr.imprimeInt(ClasseMat.pot(n, n2));
          break;
        case 5:
          System.out.println("Insira a String a virar Maiúscula: ");
          String a = new Scanner(System.in).nextLine();
          ClasseStr.imprimeString(ClasseStr.maiusculas(a));
          break;
        case 6:

          if (ClasseStr.pertence())
            ClasseStr.imprimeString("Pertence!");
          else
            ClasseStr.imprimeString("não pertence!");
          break;

        default:
          System.out.println("número inválido");

          break;
      }
      System.out.println("\n");
      System.out.println("|| - Selecione uma opção - ||" +
          "\n  \"1 - Dobro || 2 - Triplo || 3 - Multiplicação || 4 - Potencia || 5 - Maiúscula || 6 - Pertence || 9 - Sair");

      controlador = scan.nextInt();
    }
    System.out.println("Finalizado!");
    scan.close();
  }
}

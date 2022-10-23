package ExerContagem;

import java.util.concurrent.TimeUnit;

public class Contagem {

  public static void contar() { // conta até 10.

    for (int i = 0; i < 10; i++) {
      System.out.print(i + 1+"\t");
    }

  }

  public static void contar(int fim) { // Conta até
    for (int i = 1; i <= fim; i++)
      System.out.println(i);
  }

  public static void contar(int inicio, int fim) {
    System.out.println("inicio = " + inicio + " , e fim = " + fim);
    for (int i = inicio; i < fim + 1; i++) {
      System.out.print(i + "\t");
    }
    System.out.println("\n");
  }

  public static void contar(int inicio, int fim, int pausa) {
    for (int i = inicio; i <= fim; i++) {
      System.out.println(i);
        try {
        TimeUnit.SECONDS.sleep(pausa);
      } catch (Exception ignored) {
        }
    }

  }
}

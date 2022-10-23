import java.util.Scanner;

/* Uma farmácia precisa ajustar os preços de seus produtos em 12%. Elabore umaclasse que receba o valor do produto e aplique o percentual de acréscimo. O novovalor a ser calculado deve ser arredondado para mais ou para menos usando o
método round. A classe deve ter um laço de repetição que encerre o programa
quando o usuário fornecer o valor zero para o valor do produto. */

public class Ex2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Insira o valor do produto: ");
    double valorProduto = sc.nextDouble() * 1.12;

    while (valorProduto != 0) {
      System.out.println("o Resultado ajustado deu: " + Math.round(valorProduto));// errado

      valorProduto = sc.nextDouble() * 1.12;
    }
    System.out.println("Finalizado");
    sc.close();
  }
}

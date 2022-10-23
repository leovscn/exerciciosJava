import java.util.Scanner;

/* - Elabore uma classe que receba uma frase e verifique se ela possui palavras:
Rivera ou Livramento. Caso encontre uma dessas palavras, imprima “Conteúdoimpróprio - Informe Fronteira”, se não, imprima a frase, toda em maiúsculas*/

public class Ex5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String teste = sc.nextLine();
    teste = teste.toLowerCase();
    if (teste.contains("livramento") || teste.contains("rivera"))
      System.out.println("Conteúdo impróprio - Informe Fronteira");
    else
      System.out.println(teste.toUpperCase());

    sc.close();
  }
}

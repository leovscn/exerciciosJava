public class Ex3 {
  public static void main(String[] args) {
    double nRandom = (int) (Math.random() * 6) + 5; // entre 5 e 10 sendo o "+5 a o causador do piso 5 "
    System.out.println("O número sorteado foi: " + nRandom);

    System.out.print("A senha gerada: ");

    StringBuilder sb = new StringBuilder(); // cria string
    for (int i = 0; i < nRandom; i++) {
      int senha = (int) (Math.random() * 9) + 1;
      sb.append(senha); // append puxa para sb
    }

    System.out.print(sb);

  }

}

import java.util.Scanner;

public class tadutorPig {
    public static void main(String[] args) {
        tokenPig("olá boa noite a todos");

    }

    public static void tokenPig(String frase){

        while (!(frase.equalsIgnoreCase("exit"))){
                System.out.println("Insira a frase a ser traduzida: ");
                frase = new Scanner(System.in).nextLine();
                String[] tokens = frase.split(" ");
                StringBuilder novaFrase = new StringBuilder();

                for (String x: tokens) {

                    String n = x.charAt(0)+"ay"; // pega o primeiro char e concatena "ay"

                    StringBuilder y = new StringBuilder(x+n); // junta n(char+ay) com a palavra tokenizada

                    y.deleteCharAt(0); // dela o primeiro char da palavra

                    novaFrase.append(y).append(" "); // reúne a palavra modificada na frase;
                }

                System.out.println(novaFrase);

            }
        System.out.println("Tradutor Finalizado!");
    }
}

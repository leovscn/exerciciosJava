import java.util.Scanner;

public class ClasseCodificador {
    public static void codificador() {
        String frase;
        System.out.println("Insira a frase:");
         frase = new Scanner(System.in).nextLine();
        String[] tokens = frase.split(" ");
        for (String palavra : tokens) {
            try {


            if (palavra.charAt(0) == 'a' || palavra.charAt(0) == 'e' || palavra.charAt(0) == 'i' || palavra.charAt(0) == 'o' || palavra.charAt(0) == 'u') {

                System.out.print("bon");
                for (int i = palavra.length(); i > 0; i--) {
                    switch (palavra.charAt(i-1)) {
                        case 'a' -> System.out.print('e');
                        case 'e' -> System.out.print("i");
                        case 'i' -> System.out.print("o");
                        case 'o' -> System.out.print("u");
                        case 'u' -> System.out.print("a");
                        default -> System.out.print(palavra.charAt(i-1));
                    }
                }
            } else {
                System.out.print("ban");
                for (int i = palavra.length(); i > 0; i--) {
                    switch (palavra.charAt(i-1)) {
                        case 'a' -> System.out.print("u");
                        case 'e' -> System.out.print("a");
                        case 'i' -> System.out.print("e");
                        case 'o' -> System.out.print("i");
                        case 'u' -> System.out.print("o");
                        default -> System.out.print(palavra.charAt(i-1));
                    }
                }


            } } catch (Exception e){
                System.out.println(e.getMessage());
            }
            System.out.print(" ");
        }// fim for each
        System.out.println();
    }
}

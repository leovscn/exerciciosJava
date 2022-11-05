import java.util.Scanner;

public class Morse {
    public static void main(String[] args) {
        conversorMorse();
    }

    public static void conversorMorse() {
        String[] morseArray = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----", "/"};
        String[] arrayLetras = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y","Z",  "1", "2", "3", "4", "5", "6", "7", "8", "9","0"," "};

        StringBuilder output = new StringBuilder();

        System.out.println("Insira o código morse: ");
        String input = new Scanner(System.in).nextLine();

        String[] tokens = input.split(" ");
        for (String token: tokens) {
            for(int i = 0; i< morseArray.length; i++){
                if (morseArray[i].equals(token)){
                    output.append(arrayLetras[i]);
                }
            }
        }

        System.out.println(output);
    }
}

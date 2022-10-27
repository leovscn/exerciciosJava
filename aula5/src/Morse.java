import java.util.Scanner;

public class Morse {
    public static void main(String[] args) {
        conversorMorse();
    }
    public static void conversorMorse(){

        StringBuilder output = new StringBuilder();
        System.out.println("Insira o código morse: ");
        String input = new Scanner(System.in).nextLine();
        String[] tokens = input.split(" ");
        for (String token : tokens) {
            switch (token) {
                case ".-" -> output.append("A");
                case "-..." -> output.append("B");
                case "-.-." -> output.append("C");
                case "-.." -> output.append("D");
                case "." -> output.append("E");
                case "..-." -> output.append("F");
                case "--." -> output.append("G");
                case "...." -> output.append("H");
                case ".." -> output.append("I");
                case ".---" -> output.append("J");
                case "-.-" -> output.append("K");
                case ".-.." -> output.append("L");
                case "--" -> output.append("M");
                case "-." -> output.append("N");
                case "---" -> output.append("O");
                case ".--." -> output.append("P");
                case "--.-" -> output.append("Q");
                case ".-." -> output.append("R");
                case "..." -> output.append("S");
                case "-" -> output.append("T");
                case "..-" -> output.append("U");
                case "...-" -> output.append("V");
                case ".--" -> output.append("W");
                case "-..-" -> output.append("X");
                case "-.--" -> output.append("Y");
                case "--.." -> output.append("Z");
                case ".----" -> output.append("1");
                case "..---" -> output.append("2");
                case "...--" -> output.append("3");
                case "....-" -> output.append("4");
                case "....." -> output.append("5");
                case "-...." -> output.append("6");
                case "--..." -> output.append("7");
                case "---.." -> output.append("8");
                case "----." -> output.append("9");
                case "-----" -> output.append("0");
                case "/" -> output.append(" ");
                default -> System.out.println("entrada inválida");

            }

        } System.out.println(output);
    }
}

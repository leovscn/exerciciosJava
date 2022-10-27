import java.util.Scanner;

public class Datas {
    public static void main(String[] args) {
        String data = "21 de julho de 2022";
        System.out.println(data);
        converteData(data);

        data = "27/10/2022";
        System.out.println("valor de data modificado -> "+data);
        converteData(data);
    }
    public static void converteData(String data){
        //data = new Scanner(System.in).nextLine(); //caso queira inserir a data
        String[] tokens;
        if(data.length() == 10){
            tokens = data.split("/");
            switch (tokens[1]) {
            case "01" -> data = tokens[0] + " de janeiro de " + tokens[2];
            case "02" -> data = tokens[0] + " de fevereiro de " + tokens[2];
            case "03" -> data = tokens[0] + " de março de " + tokens[2];
            case "04" -> data = tokens[0] + " de abril de " + tokens[2];
            case "05" -> data = tokens[0] + " de maio de " + tokens[2];
            case "06" -> data = tokens[0] + " de junho de " + tokens[2];
            case "07" -> data = tokens[0] + " de julho de " + tokens[2];
            case "08" -> data = tokens[0] + " de agosto de " + tokens[2];
            case "09" -> data = tokens[0] + " de setembro de " + tokens[2];
            case "10" -> data = tokens[0] + " de outubro de " + tokens[2];
            case "11" -> data = tokens[0] + " de novembro de " + tokens[2];
            case "12" -> data = tokens[0] + " de dezembro de " + tokens[2];
            default -> {
                System.out.println("data inválida, insira novamente: \n");
                data = new Scanner(System.in).nextLine();
            }
        }
        } else {
            tokens = data.split(" de ");// reparando nos espaços para não dar erro no split;
            switch (tokens[1]) {
                case "janeiro" -> data = tokens[0] + "/01/" + tokens[2];
                case "fevereiro" -> data = tokens[0] + "/02/" + tokens[2];
                case "março" -> data = tokens[0] + "/03/" + tokens[2];
                case "abril" -> data = tokens[0] + "/04/" + tokens[2];
                case "maio" -> data = tokens[0] + "/05/" + tokens[2];
                case "junho" -> data = tokens[0] + "/06/" + tokens[2];
                case "julho" -> data = tokens[0] + "/07/" + tokens[2];
                case "agosto" -> data = tokens[0] + "/08/" + tokens[2];
                case "setembro" -> data = tokens[0] + "/09/" + tokens[2];
                case "outubro" -> data = tokens[0] + "/10/" + tokens[2];
                case "novembro" -> data = tokens[0] + "/11/" + tokens[2];
                case "dezembro" -> data = tokens[0] + "/12/" + tokens[2];
                default -> {
                    System.out.println("data inválida, insira novamente: \n");
                    data = new Scanner(System.in).nextLine();
                }
            }

        }
        System.out.println(data);
    }
}

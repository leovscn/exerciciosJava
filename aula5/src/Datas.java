import java.util.Scanner;

public class Datas {
    public static void main(String[] args) {
        String data = "27/01/2022";
        converteData(data);
        data = "21 de julho de 2000";
        converteData(data);
    }

    public static void converteData(String data) {
        String[] meses = {"", "janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        String[] tokens;
        if (data.length() == 10) {
            tokens = data.split("/");

            System.out.println(tokens[0] + " de " + meses[Integer.parseInt(tokens[1])] + " de " + tokens[2]);
        } else {
            tokens = data.split(" de ");
            for (int i = 0; i < meses.length ; i++) {
                if(meses[i].equals(tokens[1])){
                    System.out.println(tokens[0]+"/"+ String.format("%02d",i) +"/"+tokens[2] );
                }
            }

        }

    }
}


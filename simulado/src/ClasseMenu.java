import java.util.Scanner;

public class ClasseMenu {
    public static void main(String[] args) {
       classeMenu();
    }
    public static void classeMenu(){
        boolean next = false;
        int menu = 0;
        while (!next) {
            System.out.println("Informe a opção desejada: ");
            System.out.println("1 - Doadores de sangue");
            System.out.println("2 - Codificador");
            System.out.println("3 - Sair");

            try {
                menu = new Scanner(System.in).nextInt();
                try {
                    switch (menu) {
                        case 1:
                            ClasseAcademia.classeDoadores();
                            break;
                        case 2:
                            ClasseCodificador.codificador();
                            break;
                        case 3:
                            next = true;
                            break;
                        default:
                            System.out.println("Insira um valor válido;");
                    }
                } catch (Exception e){
                    System.out.println("insira um valor inteiro;");
                }
            } catch (Exception e){
                System.out.println("Você inseriu um valor diferente de inteiro;");

            }


        }
    }
}
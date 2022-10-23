import java.util.Scanner;

public class Estacionamento {
    public static void main(String[] args) {
        String[] vagas = new String[10];
        int controlador = 0;

        while(controlador != 4){
            System.out.println("1 - Entrada | 2 - Saída | 3 - Situação das vagas | 4 - Encerrar: ");
            controlador = new Scanner(System.in).nextInt();
            switch (controlador) {
                case 1:

                    System.out.println("Insira a vaga desejada: ");
                    int nVaga = new Scanner(System.in).nextInt();
                    if(vagas[nVaga-1] != null) {
                        System.out.println("Vaga ocupada!");
                        break;
                        }
                    System.out.println("Insira a placa do veículo: ");
                    String placa = new Scanner(System.in).nextLine();
                    vagas[nVaga-1] = placa;

                    break;
                case 2:
                    System.out.println("Insira a vaga a ser liberada: ");
                    nVaga = new Scanner(System.in).nextInt();
                    if(vagas[nVaga-1] == null){
                        System.out.println("vaga já está livre!");
                        break;
                    }
                    vagas[nVaga-1] = null;
                    System.out.println("vaga liberada!");
                    break;
                case 3:
                    for (String s : vagas) {
                        System.out.print(s + "\t| ");
                    }
                    break;
                case 4:
                    System.out.println("Finalizado!");
                    break;
                default:
                    System.out.println("Nr inválido");
                    break;
            }
            System.out.println();
        }
    }
}

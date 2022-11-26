import java.util.Scanner;

public class ClasseAcademia {
    public static void classeDoadores() {
        boolean next = false;
        int nClientes = 0;
        while (!next) {
            System.out.println("Quantos clientes são?");
            try {
                nClientes = new Scanner(System.in).nextInt();
                next = true;
            } catch (Exception e) {
                System.out.println("Tipo inválido;");
            }
        }

        int[] idadeClientes = new int[nClientes];
        double[] pesoClientes = new double[nClientes];
        int[] mesClientes = new int[nClientes];
        String[] nomeClientes = new String[nClientes];
        next = false;
        for (int i = 0; i < nClientes; i++) {


                    System.out.println("Informe o nome do cliente " +( i+1));
                    nomeClientes[i] = new Scanner(System.in).nextLine();

                while (!next) {
                try {
                    System.out.println("Informe o peso do cliente " + (i+1));
                    pesoClientes[i] = new Scanner(System.in).nextDouble();
                    next = true;
                } catch (Exception e) {
                    System.out.println("Tipo inválido;");
                    }
                }
                next = false;
                while (!next) {
                try {
                    System.out.println("Informe a idade do cliente " + (i+1));
                    idadeClientes[i] = new Scanner(System.in).nextInt(); next = true;
                } catch (Exception e) {
                    System.out.println("Tipo inválido;");
                    }
                }
                next= false;
                while (!next) {

                try {
                    System.out.println("Informe os meses de academia do cliente " + (i+1));
                    mesClientes[i] = new Scanner(System.in).nextInt();next = true;
                } catch (Exception e) {
                    System.out.println("Tipo inválido;");
                }
                }


        }
        next = false; // menu
        int menu = 0;
        while (!next) {
                System.out.println("Menu:\n 1 - Busca por nome\n 2 - Busca por Indice;");
            try {

                menu = new Scanner(System.in).nextInt();
                try {
                    switch (menu) {
                        case 1:
                            System.out.println("insira o termo a ser buscado: ");
                            String nome = new Scanner(System.in).nextLine();
                            for (int i = 0; i < nomeClientes.length; i++) {
                                if (nomeClientes[i].indexOf(nome) >= 0) {
                                    System.out.println("Encontrados;");
                                    System.out.println(nomeClientes[i] + " " + idadeClientes[i] + " " + pesoClientes[i] + " " + mesClientes[i]);
                                } else {
                                    System.out.println("nenhum encontrado;");
                                }
                            }
                            break;
                        case 2:
                            System.out.println("insira o indice a ser buscado: ");
                            int indice = new Scanner(System.in).nextInt();
                            try {
                                System.out.println("Encontrado:");
                                System.out.println(nomeClientes[indice-1] + " " + idadeClientes[indice-1] + " " + pesoClientes[indice-1] + " " + mesClientes[indice-1]);
                            } catch (ArrayIndexOutOfBoundsException e){
                                System.out.println("Indice inválido ou cliente inexistente");
                            }
                            break;
                        case 3:
                            next = true;
                            ClasseMenu.classeMenu();
                            break;

                        default:
                            System.out.println("Insira um valor válido;");
                            break;
                    }

                } catch (Exception e) {
                    System.out.println("insira um valor inteiro;");
                }
            } catch (Exception e) {
                System.out.println("Você inseriu um valor diferente de inteiro;");

            }
        }
    }

}

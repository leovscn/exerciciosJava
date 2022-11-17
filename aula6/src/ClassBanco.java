import java.util.InputMismatchException;
import java.util.Scanner;

public class ClassBanco {

    public static void main(String[] args) {
        boolean next = false;
        System.out.println("Quantos clientes serão cadastrados? ");
        int nClientes = 0;
        while (!next) {
            try {
                nClientes = new Scanner(System.in).nextInt();
                int[] clientes = new int[nClientes];
                next = true;
            } catch (Exception e) {
                System.out.println("insira um valor inteiro...");

            }
        } // pega nClientes

        String[] nome = new String[nClientes];
        int[] inteiro = new int[nClientes];
        double[] saldo = new double[nClientes];


        for (int i = 0; i < nClientes; i++) {
            next = false;
            while (!next) {

                System.out.println("Nome?");
                nome[i] = new Scanner(System.in).next();
                next = true;

            }
            next = false;

            while (!next) {
                try {
                    System.out.println("RG/cedula?");
                    inteiro[i] = new Scanner(System.in).nextInt();
                    next = true;

                } catch (Exception e) {
                    System.out.println("insira tipo Inteiro");

                }
            }
            next = false;
            while (!next) {
                try {
                    System.out.println("Salario inicial?");
                    saldo[i] = new Scanner(System.in).nextDouble();
                    next = true;
                } catch (Exception e) {
                    System.out.println("insira tipo Double;");
                }
            }
        }//preenchimento dos dados;


        while (next) {
            System.out.println("Menu:");
            System.out.println("1 – Sacar;");
            System.out.println("2 – Depositar;");
            System.out.println("3 – Saldo;");
            System.out.println("4 – Sair;");
            int meNum = 0;
            try {
                 meNum = new Scanner(System.in).nextInt();

            } catch (InputMismatchException e) {
                System.out.println("Exc:" + e);
    
            }



            switch (meNum) {
                case 1 : {

                    try {
                        int numConta = acharConta();
                        System.out.println("Insira o valor de saque: ");
                        double valorSaque = 0;
                        valorSaque = new Scanner(System.in).nextDouble();
                        double aux = saldo[numConta-1];
                        saldo[numConta - 1] = sacar(valorSaque, saldo[numConta - 1]);

                        if(aux == saldo[numConta-1]){
                            System.out.println("- Usuário:"+nome[numConta-1]+" - Saldo: R$" + saldo[numConta - 1] + "\n*Saque de R$ " + valorSaque + ": não efetuado\n");
                        } else {System.out.println("- Usuário:"+nome[numConta-1]+" - Saldo: R$" + saldo[numConta - 1] + "\n*Saque de R$ " + valorSaque + ": efetuado\n");}


                    } catch (InputMismatchException e) {

                        System.out.println("Tipo inválido. Insira um inteiro. - " + e);

                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("verifique se a conta referente a este número existe.");
                    }
                    break;
                }
                case 2 : {
                    try {
                        int numConta = acharConta();
                        System.out.println("Insira o valor de Deposito: ");

                        double deposito = new Scanner(System.in).nextDouble();
                        saldo[numConta-1] = depositar(deposito, saldo[numConta - 1]);

                        System.out.println("Novo saldo " +saldo[numConta-1]
                            +"\nUsername: "+ nome[numConta-1]);}

                    catch (InputMismatchException e){
                        System.err.println("Tipo inválido :"+ e);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("verifique se a conta referente a este número existe.");
                    }
                    break;
                }
                case 3 : {

                    try{
                        int numConta = acharConta();
                        System.out.println("Nome : "+nome[numConta-1]+"\nSaldo : "+saldo[numConta-1]);
                    } catch (InputMismatchException e){
                        System.err.println(e.getMessage());
                    }
                    catch (IndexOutOfBoundsException e) {
                        System.out.println("verifique se a conta referente a este número existe.");
                    } break;
                }
                case 4 : {
                    next = false;
                    break;
                }
                default: {
                    System.out.println("Insira uma opção válida:");
                }
            }

        }

    }

    private static double depositar(double deposito, double saldo) {

        return deposito+saldo;
    }


    private static int acharConta() {
        System.out.println("insira o Num. da conta:");
        return new Scanner(System.in).nextInt();
    }


    private static double sacar(double valorSaque, double saldo){

        if(saldo >= valorSaque){
            saldo -=  valorSaque;}
        else {
            System.err.println("valor saque inválido");

        }
        return saldo;
    }


}

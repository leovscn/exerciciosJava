import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Contatos {

    public static void main(String[] args) throws IOException {
        int opcao = 0;
        while (opcao != 4){
                System.out.println("------------------------------------------------\ninsira a opção desejada:\n1 - Novo Contato\n2 - Listar Contato                       \n3 - Acessar Contato                        \n4 - sair   \n------------------------------------------------"        );
            try {


                opcao = new Scanner(System.in).nextInt(); }
            catch (InputMismatchException e){
            System.out.println("Insira um inteiro;");
            }
            switch (opcao){
                case 1:
                    novoContato();

                    break;
                case 2:
                    listar();
                    break;
                case 3:
                    acessarContato();
                    break;
                case 4:
                    System.out.println("Finalizado!");
                    break;
                default:
                    System.out.println("Insira um nº válido");
                    break;
            }

        }

    }


    public static void novoContato() throws IOException {
        System.out.println("Nome");
        String nome = new Scanner(System.in).nextLine();
        String nomeArquivo = nome.replace(" ","_");
        File file1 = new File(System.getProperty("user.dir")+"\\Contatos\\"+nomeArquivo+".txt");

            if(file1.exists()){
            System.out.println("este arquivo já existe!");;
            } else  {
            System.out.println("Telefone");
            String telefone = new Scanner(System.in).next();

            System.out.println("Email");
            String email = new Scanner(System.in).next();

            Formatter saida = new Formatter(System.getProperty("user.dir")+"\\Contatos\\"+nomeArquivo+".txt");

            saida.format("%s%n%s%n%s", nomeArquivo, telefone, email);

            saida.close();}
    }


    public static void listar() throws IOException {
        Path arquivo = Paths.get(System.getProperty("user.dir")+"\\Contatos");
        if(Files.exists(arquivo)) {
            DirectoryStream<Path> conteudo = Files.newDirectoryStream(arquivo);

            for(Path linha:conteudo) {
                System.out.println(linha.getFileName());
            }
        } else {
            System.out.println("Diretorio não encontrado");
        }
    }

    public static void acessarContato() {
        System.out.println("Insira o nome");
        String  nome = new Scanner(System.in).nextLine();
        try {
            Scanner saida = new Scanner(Paths.get(System.getProperty("user.dir") + "\\Contatos\\" + nome + ".txt"));
            while (saida.hasNext()) {
                System.out.printf("%s", saida.nextLine());
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Verifique se o contato existe.");
            System.err.println(e.getMessage());
        }
    }
}
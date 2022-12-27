import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        System.out.println("Insira o email");
        String email = new Scanner(System.in).next();
        System.out.println("Insira a senha");
        String senha = new Scanner(System.in).next();
        // conecta com o BD
            final String obrigatorio =
                    "?autoReconnect=true&useSSL=false&&serverTimezone=UTC";

            final String url =
                    "jdbc:mysql://localhost:3309/trabJDBC" + obrigatorio;

            String sql = "Select * FROM usuarios";

        try {
            Connection conexao = DriverManager.getConnection(url, "root", "");
            PreparedStatement insert = (PreparedStatement)
                    conexao.prepareStatement("INSERT INTO usuarios (nome, email) VALUES (?, ?)"); //substitui a ? do insert por teste")
            insert.setString(1, "José");
            insert.setString(2, "José@gemeio.com");
            insert.executeQuery();
            conexao.close();
            insert.close();

        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}

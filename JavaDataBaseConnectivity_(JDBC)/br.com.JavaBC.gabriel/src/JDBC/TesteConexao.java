package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost?verifyCertificate=false&useSSL=true";
        String usuario = "root";
        String senha ="Bersek_852#bob";

        Connection conexao = DriverManager
                .getConnection(url, usuario, senha);

        System.out.println("Conexão efetuada com sucesso!");
        conexao.close();
    }

}

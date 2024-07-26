package JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaPessoa {
    public static void main(String[] args) throws SQLException {
        Connection conexao = FabricaConexao.getConexao();

        //Cria database
        //String sqlDataBase ="CREATE DATABASE IF NOT EXISTS curso_java";

        //Código SQL
        String sql = """
            CREATE TABLE IF NOT EXISTS pessoas(
            codigo INT AUTO_INCREMENT PRIMARY KEY,
            nome VARCHAR(80) NOT NULL
            )
            """;

        //Cria um statment
        Statement stmt = conexao.createStatement();

        stmt.execute(sql);

        conexao.close();
    }
}

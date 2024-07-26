package JDBC;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;

public class CriarBanco {
    public static void main(String[] args)  throws SQLException{

        Connection conexao = FabricaConexao.getConexao();

        //ccria um statment para execução de ocmadndos
        Statement stmt = conexao.createStatement();

        //CRIANDO BANDO DE DADOS
        stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");

        conexao.close();
    }
}



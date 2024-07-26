package JDBC;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexao {


    public static Connection getConexao(){
        try {
            Properties prop = gProperties();
            //url para coneção
            String url = prop.getProperty("banco.url");
            //usuario do banco
            String usuario = prop.getProperty("banco.usuario");
            //Senha do banco de dados
            String senha =prop.getProperty("banco.senha");
            //Conecta na porta do banco de dados
            return DriverManager.getConnection(url, usuario, senha);  
        } catch (SQLException | IOException e) {
            //joga um erro de Run time com base SQLException
            throw new RuntimeException(e);
        }
    }

    private static Properties gProperties() throws IOException{
        Properties prop = new Properties();
        String caminho = "\\\\conexao.properties";
        prop.load(FabricaConexao.class.getResourceAsStream(caminho));

        return prop;
    }

}

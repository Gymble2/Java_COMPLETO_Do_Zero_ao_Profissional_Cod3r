package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirRegistros {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws SQLException{
        Scanner entrada = new Scanner(System.in);
        

        System.out.print("Digite o Codigo: ");
        int paramCodigo = entrada.nextInt();

        Connection conexao = FabricaConexao.getConexao();

        String sql ="""
            DELETE FROM pessoas WHERE codigo >= ?
            """;
            
        //Statement preparado para n ter SQL injection
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1,paramCodigo );

        if(stmt.executeUpdate() > 0){
            System.out.println("Pessoa excluida com sucesos");
        }else{
            System.out.println("Nada foi feito");
        }

        entrada.close();
        stmt.close();
        conexao.close();
    }
}



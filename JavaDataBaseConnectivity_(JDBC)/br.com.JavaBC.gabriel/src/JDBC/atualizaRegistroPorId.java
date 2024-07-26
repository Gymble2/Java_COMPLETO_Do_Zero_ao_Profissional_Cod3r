package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class atualizaRegistroPorId {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws SQLException{
        Scanner entrada = new Scanner(System.in);
        

        System.out.print("Digite o Codigo: ");
        String paramCodigo = entrada.nextLine();

        Connection conexao = FabricaConexao.getConexao();

        String sqlInicial ="""
            SELECT * FROM pessoas WHERE codigo =?
            """;

        String sqlUpdate ="""
            UPDATE pessoas SET nome = ? WHERE codigo = ?
            """;

        //Statement preparado para n ter SQL injection
        PreparedStatement stmt = conexao.prepareStatement(sqlInicial);
        stmt.setString(1,paramCodigo );

        //Pega o resultado como String e verifica no IF abaixo
        ResultSet r = stmt.executeQuery();

        if(r.next()){
            Pessoa p = new Pessoa(r.getInt(1), r.getString(2));

            System.out.println("O nome atual é "+p.getNome());

            System.out.print("Digite o novo nome: ");
            String paramNome = entrada.nextLine();

            //Reinicia o stmt para novo comando
            stmt.close();
            //Insere o novo comando no stmt
            stmt = conexao.prepareStatement(sqlUpdate);
            //Seta as strings para subistituir o w
            stmt.setString(1,paramNome);
            stmt.setString(2,paramCodigo);
            //Executa o código no banco
            stmt.execute();

            System.out.println("pessoa alterada com sucesso");
        }
        entrada.close();
        stmt.close();
        conexao.close();
    }
}


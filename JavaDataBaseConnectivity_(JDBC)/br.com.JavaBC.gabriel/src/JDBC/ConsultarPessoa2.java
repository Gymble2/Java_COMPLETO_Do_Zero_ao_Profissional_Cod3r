package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoa2 {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws SQLException{
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o parametro: ");
        String param = entrada.nextLine();

        Connection conexao = FabricaConexao.getConexao();

        String sql ="SELECT * FROM pessoas WHERE nome LIKE ?;";

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, "%"+param+"%");

        ResultSet result = stmt.executeQuery();
        List<Pessoa> pessoas = new ArrayList<>();

        while (result.next()) {
            int codigo = result.getInt("codigo");
            String nome = result.getString("nome");
            pessoas.add(new Pessoa(codigo, nome));
        }

        for (Pessoa p : pessoas) {
                System.out.println(p.getCodigo() +" - "+ p.getNome());
        }
        
        stmt.close();
        conexao.close();
    }
}

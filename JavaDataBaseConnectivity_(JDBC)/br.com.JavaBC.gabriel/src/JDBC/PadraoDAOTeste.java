package JDBC;

public class PadraoDAOTeste {
    public static void main(String[] args) {
        PadraoDAO dao = new PadraoDAO();

        String sql = """
                Insert into pessoas 
                    (nome)
                Values
                    (?);
                """;

        dao.incluir(sql, "Joao borges");
        dao.incluir(sql, "Djavan pereira");
        dao.incluir(sql, "Leonardo");

        dao.close();
    }
}

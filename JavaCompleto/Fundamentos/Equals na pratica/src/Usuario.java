import java.util.Objects;

public class Usuario {
    String nome;
    String email;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario usuario)) return false;
        return Objects.equals(nome, usuario.nome) && Objects.equals(email, usuario.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, email);
    }
}

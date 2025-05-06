package sistema_library.service;

import sistema_library.domain.Usuario;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class UsuarioService {
    private List<Usuario> usuarios = new ArrayList<>();

    public List<Usuario> getUsuarios() {

        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {

        this.usuarios = usuarios;
    }

    public void adicionarUsuario(String nomeUser, String dataNascimentoUserStr, String emailUser, Integer idUser) {
        Usuario usuario = new Usuario();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimentoUser = LocalDate.parse(dataNascimentoUserStr, dtf);

        usuario.setNomeUser(nomeUser);
        usuario.setDataNascimentoUser(dataNascimentoUser);
        usuario.setEmailUser(emailUser);
        usuario.setIdUser(idUser);
        this.usuarios.add(usuario);
    }

    public List<Usuario> recuperarTodosUsuarios() {

        return this.usuarios;
    }


    public void ConsultarEmprestimosDoUsuario(Usuario usuario) {
        //mostrar todos emprestimos realizados do livro
    }
}

package br.jvictor.biblioteca.execucao;

import br.jvictor.biblioteca.controller.UsuarioController;
import br.jvictor.biblioteca.domain.Usuario;
import br.jvictor.biblioteca.service.EmprestimoService;

import java.util.List;

public class MainUsuario {

    private  UsuarioController controller = new UsuarioController();
    private EmprestimoService emprestimoService = new EmprestimoService();

    public static void main(String[] args) {
        realizarFluxoUsuario();
    }

    public static void realizarFluxoUsuario() {
        MainUsuario mainUsuario = new MainUsuario();
        mainUsuario.adicionarUsuario();

        String nome = "João Victor";
        mainUsuario.buscarUsuarioCadastrado(nome);

        Integer idUsuario = mainUsuario.buscarIdUsuarioPorNome(nome);

        if (idUsuario != -1) {
            System.out.println("Usuário de nome "+  nome + " tem o ID: " + idUsuario);
        } else {
            System.out.println("Usuário não cadastrado." );
        }
    }

    private void adicionarUsuario() {
        controller.adicionaUsuariosFluxoTeste();
    }

    private void buscarUsuarioCadastrado(String nomeUsuario){
        List<Usuario> usuarioList = controller.recuperarTodosUsuarios();

        if (usuarioList == null || usuarioList.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado!");
            return;
        }

        Usuario usuario = emprestimoService.buscarUsuarioCadastrado(usuarioList, nomeUsuario);

        if (usuario == null) {
            System.out.println("Nenhum usuário pelo nome "+  nomeUsuario + " existe no cadastro!");
            return;
        }

        System.out.println("Usuário "+  usuario.getNomeUser() + " tem o ID: " + usuario.getIdUser());
    }

    private Integer buscarIdUsuarioPorNome(String nomeUsuario) {
        List<Usuario> usuarioList = controller.recuperarTodosUsuarios();

        if (usuarioList == null || usuarioList.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado!");
            return -1;
        }

        Usuario usuario = emprestimoService.buscarUsuarioCadastrado(usuarioList, nomeUsuario);

        if (usuario == null) {
            System.out.println("Nenhum usuário pelo nome "+  nomeUsuario + " existe no cadastro!");
            return -1;
        }

        return usuario.getIdUser();
    }
}

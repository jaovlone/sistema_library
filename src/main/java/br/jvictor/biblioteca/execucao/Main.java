package br.jvictor.biblioteca.execucao;

import br.jvictor.biblioteca.controller.AutorController;
import br.jvictor.biblioteca.controller.LivroController;
import br.jvictor.biblioteca.controller.UsuarioController;

public class Main {
    public static void main(String[] args) {

        adicionarUsuario();

        adicionarAutores();

        adicionarLivros();

        //TODO - fazer empréstimo
    }

    protected static void adicionarUsuario() {
        UsuarioController controller = new UsuarioController();

        controller.adicionaUsuariosFluxoTeste();
        controller.recuperarTodosUsuarios();
    }

    protected static void adicionarAutores() {
        AutorController controller = new AutorController();

        controller.adicionaAutorTesteFluxo();
    }

    protected static void adicionarLivros() {
        LivroController controller = new LivroController();

        controller.adicionaLivrosTesteFluxo();
    }
}

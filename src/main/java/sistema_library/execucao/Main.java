package sistema_library.execucao;

import sistema_library.controller.UsuarioController;

public class Main {
    public static void main(String[] args) {

        adicionarUsuario();
    }

    protected static void adicionarUsuario() {
        UsuarioController controller = new UsuarioController();

        //controller.adicionaUsuariosFluxoTeste();
        controller.recuperarTodosUsuarios();
    }
}

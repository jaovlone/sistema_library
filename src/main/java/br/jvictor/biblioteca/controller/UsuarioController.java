package br.jvictor.biblioteca.controller;
import br.jvictor.biblioteca.domain.Usuario;
import br.jvictor.biblioteca.service.UsuarioService;

import java.util.List;

public class UsuarioController {

    private UsuarioService usuarioService = new UsuarioService();

    public void adicionaUsuariosFluxoTeste() {
        String nomeUser ="João Victor";
        String dataNascimentoUser = "12/12/2006";
        String emailUser ="jvictorbs06@gmail.com";
        Integer idUser = 3000;
        adicionarUsuario(nomeUser, dataNascimentoUser, emailUser, idUser);

        nomeUser ="Gabriel";
        dataNascimentoUser = "30/01/2007";
        emailUser ="gabrielbrabo1@gmail.com";
        idUser = 3001;
        adicionarUsuario(nomeUser, dataNascimentoUser, emailUser,idUser);

        nomeUser ="Alessandro";
        dataNascimentoUser = "08/04/1974";
        emailUser ="alessandro.teixeira@gmail.com";
        idUser = 3002;
        adicionarUsuario(nomeUser, dataNascimentoUser, emailUser,idUser);

    }

    public List<Usuario> recuperarTodosUsuarios() {
        List<Usuario> listaUsuarios = usuarioService.recuperarTodosUsuarios();

        return listaUsuarios;

    }

    private void adicionarUsuario(String nomeUser, String dataNascimentoUser, String emailUser, Integer idUser) {
        usuarioService.adicionarUsuario(nomeUser, dataNascimentoUser, emailUser,idUser);
    }
}

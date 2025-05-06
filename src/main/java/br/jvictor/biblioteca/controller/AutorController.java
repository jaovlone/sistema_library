package br.jvictor.biblioteca.controller;

import br.jvictor.biblioteca.domain.Autor;
import br.jvictor.biblioteca.domain.Usuario;
import br.jvictor.biblioteca.service.AutorService;
import java.time.LocalDate;
import java.util.List;

public class AutorController {
    AutorService autorService = new AutorService();


        public void adicionaAutorTesteFluxo() {

            String nomeAutor = "Stephen King";
            String dataNascimentoAutor = "08/04/1974";
            Integer idAutor = 2229;
            autorService.adicionarAutor(nomeAutor, dataNascimentoAutor, idAutor);

            nomeAutor = "Victorius John";
            dataNascimentoAutor = "12/12/2006";
            idAutor = 2220;
            autorService.adicionarAutor(nomeAutor, dataNascimentoAutor, idAutor);

            nomeAutor = "J.K Rowling";
            dataNascimentoAutor = "31/07/1965";
            idAutor = 2221;
            autorService.adicionarAutor(nomeAutor, dataNascimentoAutor, idAutor);

            nomeAutor = "Machado de Assis";
            dataNascimentoAutor = "21/06/1839";
            idAutor = 2222;
            autorService.adicionarAutor(nomeAutor, dataNascimentoAutor, idAutor);
        }

    public void recuperarTodosAutores() {
        List<Autor> lista = autorService.recuperarTodosAutores();

        if (lista == null || lista.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado!");
        } else {
            //foreach
            for(Autor elemento: lista) {
                System.out.println("Nome: " + elemento.getNomeAutor() + " => email: " + elemento.getIdAutor());
            }
        }

    }

}

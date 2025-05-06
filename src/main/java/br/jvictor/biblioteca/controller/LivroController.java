package br.jvictor.biblioteca.controller;

import br.jvictor.biblioteca.domain.Autor;
import br.jvictor.biblioteca.service.AutorService;
import br.jvictor.biblioteca.service.LivroService;
import java.time.LocalDate;
import java.util.List;

public class LivroController {
    private LivroService livroService = new LivroService();
    private AutorService autorService = new AutorService();

    public void adicionaLivrosTesteFluxo() {
        Integer idAutorEncontrado = -1;

        /**
         * Recupera do terminal o nome do Autor => com Scanner
         * Aí percorrer a lista para descobrir o respectio ID daquele autor
         * e passar para o construtor
         */


        //Primeiro livro
        idAutorEncontrado = realizarLeituraAutorPeloTerminal();

        String titulo = "O iluminado";
        String nomeDoAutor = "Stephen King";
        Boolean disponibilidade = true;
        String dataCadastro = "22 - 04 - 2025";
        LocalDate dataAtualizacao = LocalDate.now();
        Integer idBook = 1000;
        livroService.adicionarLivro(titulo, idAutorEncontrado, disponibilidade, LocalDate.parse(dataCadastro), dataAtualizacao, idBook);


        //Segundo livro
        idAutorEncontrado = realizarLeituraAutorPeloTerminal();

        titulo = "Harry Potter e a pedra filosofal";
        nomeDoAutor = "J.K Rowling";
        disponibilidade = true;
        dataCadastro = "22 - 04 - 2025";
        dataAtualizacao = LocalDate.now();
        idBook = 1001;
        livroService.adicionarLivro(titulo, idAutorEncontrado, disponibilidade, LocalDate.parse(dataCadastro), dataAtualizacao, idBook);

        //Terceiro livro
        idAutorEncontrado = realizarLeituraAutorPeloTerminal();

        titulo = "Dom Casmuro";
        nomeDoAutor = "Machado de Assis";
        disponibilidade = true;
        dataCadastro = "22 - 04 - 2025";
        dataAtualizacao = LocalDate.now();
        idBook = 1002;
        livroService.adicionarLivro(titulo, idAutorEncontrado, disponibilidade, LocalDate.parse(dataCadastro), dataAtualizacao, idBook);

        //Quarto livro
        idAutorEncontrado = realizarLeituraAutorPeloTerminal();

        titulo = "Doutor Sono";
        nomeDoAutor = "Stephen King";
        disponibilidade = true;
        dataCadastro = "22 - 04 - 2025";
        dataAtualizacao = LocalDate.now();
        idBook = 1003;
        livroService.adicionarLivro(titulo, idAutorEncontrado, disponibilidade, LocalDate.parse(dataCadastro), dataAtualizacao, idBook);

    }



    private Integer realizarLeituraAutorPeloTerminal() {
        List<Autor> listaAutores = autorService.recuperarTodosAutores();

        String nomeAutorLido = "xxx";//ler do scanner TODO
        Integer idAutorEncontrado = buscarIdAutorPorNome(listaAutores, nomeAutorLido);

        if (idAutorEncontrado == -1) {
            System.out.println("Autor não encontrado. Programa finalizado!");

            //Chamada de uma função recursiva
            realizarLeituraAutorPeloTerminal();
        }

        return idAutorEncontrado;
    }

    private Integer buscarIdAutorPorNome(List<Autor> listaAutores, String nomeAutorLido) {
        Integer idAutorEncontrado = -1;

        for (Autor autor: listaAutores) {
            if (nomeAutorLido.equalsIgnoreCase(autor.getNomeAutor())) {
                //se encontrar ==> recuperar o id do autor
                idAutorEncontrado = autor.getIdAutor();
            }
        }

        return idAutorEncontrado;
    }


}

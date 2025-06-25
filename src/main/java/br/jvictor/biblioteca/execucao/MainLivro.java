package br.jvictor.biblioteca.execucao;

import br.jvictor.biblioteca.controller.LivroController;
import br.jvictor.biblioteca.service.LivroService;

import java.time.LocalDate;

public class MainLivro {
    private LivroController controller = new LivroController();
    private LivroService service = new LivroService();

    public static void main(String[] args) {
        realizarFluxoLivro();
    }

    public static void realizarFluxoLivro(){
        MainLivro mainLivro = new MainLivro();

        mainLivro.adicionarLivros();
        mainLivro.adicionarLivro("Hobbit",3001, false , LocalDate.ofEpochDay(2006-06-25), LocalDate.now(),2001);
        mainLivro.listarTodosLivros();
        mainLivro.buscarLivroPeloTitulo();
    }


    private  void adicionarLivros() {

        controller.adicionaLivrosTesteFluxo();
    }

    private  void buscarLivroPeloTitulo(){

        service.buscarLivroPeloTitulo();
    }
    private  void listarTodosLivros(){

        service.listarTodosLivros();
    }
    private  void adicionarLivro(String titulo, Integer idAutor, Boolean disponibilidade, LocalDate
            dataCadastro, LocalDate dataAtualizacao, Integer idLivro){

        service.adicionarLivro(titulo, idAutor,  disponibilidade,
                dataCadastro,  dataAtualizacao,  idLivro);
    }
}

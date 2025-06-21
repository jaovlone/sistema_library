package br.jvictor.biblioteca.execucao;

import br.jvictor.biblioteca.controller.AutorController;
import br.jvictor.biblioteca.controller.LivroController;
import br.jvictor.biblioteca.controller.UsuarioController;
import br.jvictor.biblioteca.domain.Livro;
import br.jvictor.biblioteca.domain.Usuario;
import br.jvictor.biblioteca.service.AutorService;
import br.jvictor.biblioteca.service.EmprestimoService;
import br.jvictor.biblioteca.service.LivroService;

import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //    TODO instanciar os outros Main
        MainUsuario.realizarFluxoUsuario();

        //TODO criar MainLivro, MainAutores e MainEmprestimo
    }




    //bota no MainAutores
    protected static void adicionarAutores() {
        AutorController controller = new AutorController();

        controller.adicionaAutorTesteFluxo();
    }

    protected  static void adicionarAutor(String nomeAutor, String dataNascimentoAutorStr, Integer idAutor){
        AutorService autorService = new AutorService();

        autorService.adicionarAutor(nomeAutor, dataNascimentoAutorStr, idAutor);
    }

    protected static void recuperarTodosAutores(){
        AutorService autorService = new AutorService();

        autorService.recuperarTodosAutores();
    }

    //********************************************************************************************************

    //bota no MainLivros TODO
    protected static void adicionarLivros() {
        LivroController controller = new LivroController();

        controller.adicionaLivrosTesteFluxo();
    }

    protected static void buscarLivroPeloTitulo(){
        LivroService livroService = new LivroService();

        livroService.buscarLivroPeloTitulo();
    }
    protected static void listarTodosLivros(){
        LivroService livroService = new LivroService();

        livroService.listarTodosLivros();
    }
    protected static void adicionarLivro(String titulo, Integer idAutor, Boolean disponibilidade, LocalDate
            dataCadastro, LocalDate dataAtualizacao, Integer idLivro){
        LivroService livroService = new LivroService();

        livroService.adicionarLivro(titulo, idAutor,  disponibilidade,
                dataCadastro,  dataAtualizacao,  idLivro);
    }


    //******************************************************************************************


    // botar no MainEmprestimo  TODO

    protected static void realizarEmprestimoDeLivro() {
        EmprestimoService emprestimo = new EmprestimoService();
        //colocar o disponibilizarLivro e buscarLivroNaBiblioteca dentro quando ambos estiverem funcionando
        emprestimo.realizarEmprestimoDeLivro();
    }

    protected static void devolucaoDoLivro(){
        EmprestimoService emprestimoService = new EmprestimoService();

        emprestimoService.devolucaoDoLivro();
    }

    protected  static void buscarLivroNaBiblioteca(List<Livro> livros, String tiuloLivroEscolhido){
        EmprestimoService emprestimoService = new EmprestimoService();

        emprestimoService.buscarLivroNaBiblioteca(livros,tiuloLivroEscolhido);
    }
    protected  static void consultarEmprestimosDeUmLivro(){
        EmprestimoService emprestimoService = new EmprestimoService();

        emprestimoService.consultarEmprestimosDeUmLivro();
    }
    protected static void consultarEmprestimosDoUsuario(List<Usuario> usuarios){
        EmprestimoService emprestimoService = new EmprestimoService();

        emprestimoService.consultarEmprestimosDoUsuario(usuarios);
    }
    protected static void realizarLeituraLivroPeloTerminal(){
        EmprestimoService emprestimoService = new EmprestimoService();

        emprestimoService.realizarLeituraLivroPeloTerminal();
    }
    protected  static void realizarLeituraUserPeloTerminal(){
        EmprestimoService emprestimoService = new EmprestimoService();

        emprestimoService.realizarLeituraUserPeloTerminal();
    }



    //so pra subir mesmo





}

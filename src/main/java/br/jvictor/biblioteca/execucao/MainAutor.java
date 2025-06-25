package br.jvictor.biblioteca.execucao;

import br.jvictor.biblioteca.controller.AutorController;
import br.jvictor.biblioteca.service.AutorService;

public class MainAutor {
    private AutorController controller = new AutorController();
    private AutorService service = new AutorService();

    public static void main(String[] args){
        realizarFluxoAutor();
    }

    public static void realizarFluxoAutor(){
        MainAutor mainAutor = new MainAutor();
        mainAutor.adicionarAutores();
        mainAutor.recuperarTodosAutores();
        mainAutor.adicionarAutor("Tolken","25/05/1965",2008);
    }

    private  void adicionarAutores() {

        controller.adicionaAutorTesteFluxo();
    }

    private   void adicionarAutor(String nomeAutor, String dataNascimentoAutorStr, Integer idAutor){

        service.adicionarAutor(nomeAutor, dataNascimentoAutorStr, idAutor);
    }

    private  void recuperarTodosAutores(){

        service.recuperarTodosAutores();
    }

}

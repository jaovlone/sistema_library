package br.jvictor.biblioteca.execucao;

import br.jvictor.biblioteca.domain.Emprestimo;
import br.jvictor.biblioteca.domain.Livro;
import br.jvictor.biblioteca.domain.Usuario;
import br.jvictor.biblioteca.service.EmprestimoService;
import br.jvictor.biblioteca.service.LivroService;

import java.util.List;
import java.util.Scanner;

public class MainEmprestimo {
    private EmprestimoService service = new EmprestimoService();
    private Emprestimo emprestimo = new Emprestimo();
    private List<Livro> livros;
    private LivroService livroService = new LivroService();
    private List<Usuario> usuarios;

   public static void main (String[]args){
       realizarFluxoEmprestimo();
   }

    public static void realizarFluxoEmprestimo (){
       MainEmprestimo mainEmprestimo = new MainEmprestimo();
       String  nomeUsuarioCadastrado = "João Victor";
       String tituloLivroEscolhido = "Três Mosqueteiros";

        mainEmprestimo.buscarLivroNaBiblioteca();

       mainEmprestimo.realizarLeituraLivroPeloTerminal();
       mainEmprestimo.realizarEmprestimoDeLivro();
       mainEmprestimo.devolucaoDoLivro();
       mainEmprestimo.consultarEmprestimosDeUmLivro();
       mainEmprestimo.realizarLeituraUserPeloTerminal();

       mainEmprestimo.consultarEmprestimosDoUsuario(List<Usuario,nomeUsuarioCadastrado);
    }

    private  void realizarEmprestimoDeLivro() {
        service.realizarEmprestimoDeLivro();
    }

    private  void devolucaoDoLivro(){

        service.devolucaoDoLivro();
    }

    private   void buscarLivroNaBiblioteca(){
        Scanner scanner = new Scanner(System.in);
        String tituloLivroEscolhido =scanner.nextLine();
        service.buscarLivroNaBiblioteca(livros,tituloLivroEscolhido);
    }
    private   void consultarEmprestimosDeUmLivro(){

        service.consultarEmprestimosDeUmLivro();
    }
    private  void consultarEmprestimosDoUsuario(List<Usuario> usuarios,String nomeUsuarioCadastrado){
        Scanner scanner = new Scanner(System.in);
        nomeUsuarioCadastrado = scanner.nextLine();
        service.consultarEmprestimosDoUsuario(usuarios,nomeUsuarioCadastrado);
    }
    private  void realizarLeituraLivroPeloTerminal(){

        service.realizarLeituraLivroPeloTerminal();
    }
    private   void realizarLeituraUserPeloTerminal(){

        service.realizarLeituraUserPeloTerminal();
    }

}

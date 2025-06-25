package br.jvictor.biblioteca.execucao;

public class Main {

    public static void main(String[] args) {
        MainUsuario.realizarFluxoUsuario();
        MainLivro.realizarFluxoLivro();
        MainAutor.realizarFluxoAutor();
        MainEmprestimo.realizarFluxoEmprestimo();
    }
}

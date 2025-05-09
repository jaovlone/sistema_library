package br.jvictor.biblioteca.service;

import br.jvictor.biblioteca.domain.Livro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Emprestimo {
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(List<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }
    Livro livro = new Livro();
    public void realizarEmprestimoDeLivro(List<Livro> livros) {
        System.out.println("/n Qual livro deseja pegar ?");
        Scanner scanner = new Scanner(System.in);
        String livroEscolhido = scanner.nextLine();
        buscarLivroNaBiblioteca(livros, livroEscolhido);
        disponibilizarLivro(livros, );



        //TODO
        //this.emprestimos.add(emprestimo);
    }

    public boolean disponibilizarLivro(List<Livro> livros, boolean disponibilidade){
       boolean disponibilidadeDoLivro = livro.getDisponibilidade();
        for(Livro livro : livros){
           if(livro.getDisponibilidade()){
               if (disponibilidade == true) {
                   return disponibilidade;
               } else {
                   return disponibilidade;

               }
           }
       }


    }







    public String buscarLivroNaBiblioteca(List<Livro> livros, String livroEscolhido){
        for (Livro livro: livros) {
            if (livroEscolhido.equalsIgnoreCase (livro.getTitulo())) {
                return livro.getTitulo();



            }
        }





    }




    public void devolucaoDoLivro(boolean disponibilidade) {
        System.out.println("/n Qual livro deseja devolver?");
        Scanner scanner = new Scanner(System.in);
        String livroDevolvido = scanner.nextLine();
        //associar data de atualização com a data de devolução do livro e salvar no registro do livro
        if (disponibilidade = false) {
            System.out.println("/n 0" + livroDevolvido + "foi devolvido com sucesso");
        } else {
            System.out.println("/n O" + livroDevolvido + "não foi emprestado, ele ainda está disponivel para empréstimo");
        }
    }
}

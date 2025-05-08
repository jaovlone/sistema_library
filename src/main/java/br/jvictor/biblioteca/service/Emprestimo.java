package br.jvictor.biblioteca.service;

import br.jvictor.biblioteca.domain.Autor;
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

    public void realizarEmprestimoDeLivro() {
        System.out.println("/n Qual livro deseja pegar ?");
        Scanner scanner = new Scanner(System.in);
        String livroEscolhido = scanner.nextLine();
        Boolean disponibilidadeDoLivro = buscarLivroNaBiblioteca(livros, livroEscolhido);

        if (disponibilidadeDoLivro == true) {
            System.out.println("/n O" + livroEscolhido + "foi emprestado com sucesso");
        } else {
            System.out.println("/n Livro indisponivel no momento");
        }


        //TODO
        //this.emprestimos.add(emprestimo);
    }
    public void buscarLivroNaBiblioteca(List<Livro> livros, String livroEscolhido){
        for (Livro livro: livros) {
            if (livroEscolhido.equalsIgnoreCase (livro.getTitulo())) {
                if(livroEscolhido.getDisponibilidade ==true){
                    return livro.getTitulo();
                }
                = livro.getTitulo();
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

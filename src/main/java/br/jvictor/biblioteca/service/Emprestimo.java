package br.jvictor.biblioteca.service;

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

    public void RealizarEmprestimoDeLivro(boolean disponibilidade) {
        System.out.println("/n Qual livro deseja pegar ?");
        Scanner scanner = new Scanner(System.in);
        String livroEscolhido = scanner.nextLine();
        //associar data de atualização com a data de emprestimo do livro e salvar no registro do livro
        if (disponibilidade) {
            System.out.println("/n O" + livroEscolhido + "foi emprestado com sucesso");
        } else {
            System.out.println("/n Livro indisponivel no momento");
        }
        //TODO
        //this.emprestimos.add(emprestimo);
    }

    public void DevolucaoDoLivro(boolean disponibilidade) {
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

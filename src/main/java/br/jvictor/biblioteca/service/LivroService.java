package br.jvictor.biblioteca.service;

import br.jvictor.biblioteca.domain.Livro;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class LivroService {
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private ArrayList<Livro> livros = new ArrayList<>();

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public void BuscarLivroPeloTitulo(Livro livros) {
        System.out.println("Escreva o título do livro que deseja buscar.");
        Scanner scanner = new Scanner(System.in);
        String livroBuscado = scanner.nextLine();
        //buscar pelo titulo o livro na lista livros
    }


    public void ListarTodosLivrosDisponiveis ( ) {

        for (Livro livro : livros) {
//            if (boolean disponibilidade) {
//                System.out.println("/n Os livros disponíveis são :" + livros);
//            }else{
//                    System.out.println("Não há livros disponíveis no momento");
//            }

        }

    }


    public void ConsultarEmprestimosDeUmLivro(Livro livro) {
    }

    public void adicionarLivro(String titulo, String nomeAutor, Boolean disponibilidade, LocalDate dataCadastro, LocalDate dataAtualizacao, Integer idLivro) {
        Livro livro = new Livro(titulo, nomeAutor, disponibilidade, dataCadastro, dataAtualizacao, idLivro);
        livro.setTitulo(titulo);
        livro.setNomeDoAutor(nomeAutor);
        livro.setDisponibilidade(disponibilidade);
        livro.setDataCadastro(dataCadastro);
        livro.setDataAtualizacao(dataAtualizacao);
        livro.setIdBook(idLivro);
        this.livros.add(livro);

    }
}

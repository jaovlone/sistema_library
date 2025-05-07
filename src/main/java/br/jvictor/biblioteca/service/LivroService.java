package br.jvictor.biblioteca.service;

import br.jvictor.biblioteca.domain.Autor;
import br.jvictor.biblioteca.domain.Livro;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LivroService {
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private List<Livro> livros = new ArrayList<>();

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public void buscarLivroPeloTitulo() {
        System.out.println("Escreva o título do livro que deseja buscar.");
        Scanner scanner = new Scanner(System.in);
        String tituloBuscado = scanner.nextLine();
        for (Livro livro : livros) {
            if (tituloBuscado.equalsIgnoreCase(livro.getTitulo())) {
                tituloBuscado = livro.getTitulo();
                System.out.println("/n O livro encontrado foi" + tituloBuscado);
            }
        }
    }


    public List<Livro> ListarTodosLivros() {
        for (Livro livro : livros) {
            System.out.println("Os autores disponíveis são : " + livros);
        }
        return this.livros;
    }


    public void ConsultarEmprestimosDeUmLivro() {
    }

    public void adicionarLivro(String titulo, Integer idAutor, Boolean disponibilidade, LocalDate
            dataCadastro, LocalDate dataAtualizacao, Integer idLivro) {
        Livro livro = new Livro();
        livro.setTitulo(titulo);
        livro.setDisponibilidade(disponibilidade);
        livro.setDataCadastro(dataCadastro);
        livro.setDataAtualizacao(dataAtualizacao);
        livro.setIdBook(idLivro);
        //setando o relacionamento entre autor e livro
        livro.setIdAutor(idAutor);

        this.livros.add(livro);

    }

    public List<Livro> recuperarTodosLivros() {
        return this.livros;
    }
}


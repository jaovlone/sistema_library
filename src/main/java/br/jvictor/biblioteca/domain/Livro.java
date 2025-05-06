package br.jvictor.biblioteca.domain;

import java.time.LocalDate;
import java.util.ArrayList;

public class Livro {
    private ArrayList<String> livros;
    private Integer idBook;
    private String titulo;
    private Boolean disponibilidade;
    private LocalDate dataCadastro;
    private LocalDate dataAtualizacao;
    private Integer idAutor;// Foreig key - Chave estrangeira da outra entidade

//    public Livro(String titulo, Integer idAutor, Boolean disponibilidade, LocalDate dataCadastro, LocalDate dataAtualizacao, Integer idBook) {
//        this.titulo = titulo;
//        this.idAutor = idAutor;
//        this.disponibilidade = disponibilidade;
//        this.dataCadastro = dataCadastro;
//        this.dataAtualizacao = dataAtualizacao;
//        this.idBook = idBook;
//    }

    public ArrayList<String> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<String> livros) {
        this.livros = livros;
    }

    public Integer getIdBook() {
        return idBook;
    }

    public void setIdBook(Integer idBook) {
        this.idBook = idBook;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Boolean getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(Boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalDate getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(LocalDate dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    public Integer getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Integer idAutor) {
        this.idAutor = idAutor;
    }
}

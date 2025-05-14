package br.jvictor.biblioteca.domain;

import java.time.LocalDate;

public class Emprestimo {

    private Integer idBook;
    private Integer idUser;
    private LocalDate dataInicioEmprestimo;
    private LocalDate dataFimEmprestimo;

    public Integer getIdBook() {
        return idBook;
    }

    public void setIdBook(Integer idBook) {
        this.idBook = idBook;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public LocalDate getDataInicioEmprestimo() {
        return dataInicioEmprestimo;
    }

    public void setDataInicioEmprestimo(LocalDate dataInicioEmprestimo) {
        this.dataInicioEmprestimo = dataInicioEmprestimo;
    }

    public LocalDate getDataFimEmprestimo() {
        return dataFimEmprestimo;
    }

    public void setDataFimEmprestimo(LocalDate dataFimEmprestimo) {
        this.dataFimEmprestimo = dataFimEmprestimo;
    }
}

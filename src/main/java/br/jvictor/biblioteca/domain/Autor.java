package br.jvictor.biblioteca.domain;

import java.time.LocalDate;

public class Autor {
    private Integer idAutor;
    private String nomeAutor;
    private LocalDate dataNascimentoAutor;

    // Não precisa ter uma iniciação dos atributos da classe com os getters and setters posteriormente

    public Integer getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Integer idAutor) {
        this.idAutor = idAutor;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public LocalDate getDataNascimentoAutor() {
        return dataNascimentoAutor;
    }

    public void setDataNascimentoAutor(LocalDate dataNascimentoAutor) {
        this.dataNascimentoAutor = dataNascimentoAutor;
    }
}

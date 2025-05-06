package sistema_library.domain;

import java.time.LocalDate;

public class Autor {
    private Integer idAutor;
    private String nomeAutor;
    private LocalDate dataNascimentoAutor;


    public Autor(String nomeAutor, LocalDate dataNascimentoAutor, Integer idAutor) {
        this.nomeAutor = nomeAutor;
        this.dataNascimentoAutor = dataNascimentoAutor;
        this.idAutor = idAutor;
    }

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

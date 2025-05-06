package br.jvictor.biblioteca.domain;

import java.time.LocalDate;

public class Usuario {
    private Integer idUser;
    private String nomeUser;
    private LocalDate dataNascimentoUser;
    private String emailUser;

//    public Usuario(String nomeUser, LocalDate dataNascimentoUser, String emailUser, Integer idUser) {
//        this.nomeUser = nomeUser;
//        this.dataNascimentoUser = dataNascimentoUser;
//        this.emailUser = emailUser;
//        this.idUser = idUser;
//    }

    public String getNomeUser() {
        return nomeUser;
    }

    public void setNomeUser(String nomeUser) {
        this.nomeUser = nomeUser;
    }

    public LocalDate getDataNascimentoUser() {
        return dataNascimentoUser;
    }

    public void setDataNascimentoUser(LocalDate dataNascimentoUser) {
        this.dataNascimentoUser = dataNascimentoUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }
}

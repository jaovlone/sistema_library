package br.jvictor.biblioteca.service;

import br.jvictor.biblioteca.domain.Autor;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AutorService {
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private List<Autor> autores;

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public void ListarOsAutores() {
        for(Autor autor : autores){
            System.out.println("Os autores disponíveis são : " + autores);
        }
    }

    public void BuscarLivrosPeloAutor() {
        System.out.println("Escreva o nome do autor do livro que deseja buscar.");
        Scanner scanner = new Scanner(System.in);
        String autorBuscado = scanner.nextLine();
        //try {
           boolean encontrouAutorBuscado = false;

            if (!encontrouAutorBuscado) {
                System.out.println("\n Nenhum livro encontrado para este autor");
            }
           // for(Livro livro : )
       // }
    }

    // ou passar os atributos na assinatura do método (id, nome, data.. )
    public void adicionarAutor(String nomeAutor, String dataNascimentoAutorStr, Integer idAutor) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimentoAutor = LocalDate.parse(dataNascimentoAutorStr, dtf);

        Autor autor = new Autor();
        autor.setDataNascimentoAutor(dataNascimentoAutor);
        autor.setIdAutor(idAutor);
        autor.setNomeAutor(nomeAutor);

        if (this.autores == null) {
            this.autores = new ArrayList<>();
        }

        this.autores.add(autor);
    }

    public List<Autor> recuperarTodosAutores() {
        return this.autores;
    }


}

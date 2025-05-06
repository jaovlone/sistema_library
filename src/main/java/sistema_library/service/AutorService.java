package sistema_library.service;

import sistema_library.domain.Autor;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class AutorService {
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private ArrayList<Autor> listaAutores = new ArrayList<>();

    public ArrayList<Autor> getListaAutores() {
        return listaAutores;
    }

    public void setListaAutores(ArrayList<Autor> listaAutores) {
        this.listaAutores = listaAutores;
    }

    public void ListarOsAutores() {
        for(Autor autor : listaAutores){
            System.out.println("Os autores disponíveis são : " +listaAutores);
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
    //TODO vc pode ter um método passando o objeto Autor já preenchido
    // ou passar os atributos na assinatura do método (id, nome, data.. )
    public void adicionarAutor(String nomeAutor, LocalDate dataNascimentoAutor, Integer idAutor) {
        Autor autor = new Autor(nomeAutor, dataNascimentoAutor, idAutor);
        autor.setDataNascimentoAutor(dataNascimentoAutor);
        autor.setIdAutor(idAutor);
        autor.setNomeAutor(nomeAutor);
        this.listaAutores.add(autor);

    }
    /**
     * TODO esse método negocial.. ele fica no *Service
     * @param nomeAutor
     * @param dataNascimentoAutor
     * @param idAutor
     */
}

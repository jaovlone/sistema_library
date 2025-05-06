package biblioteca.controller;

import biblioteca.service.AutorService;
import java.time.LocalDate;

public class AutorController {
    //TODO essa classe chama a classe service.

    /**
     * Só um metodo de teste.. cria uma com um main para ser usado por todo mundo
     */
        public void adicionaAutorTesteFluxo() {
            AutorService autorService = new AutorService();
            String nomeAutor = "Stephen King";
            String dataNascimentoAutor = "08/04/1974";
            Integer idAutor = 2229;
            autorService.adicionarAutor(nomeAutor, LocalDate.parse(dataNascimentoAutor), idAutor);

            nomeAutor = "Victorius John";
            dataNascimentoAutor = "12/12/2006";
            idAutor = 2220;
            autorService.adicionarAutor(nomeAutor, LocalDate.parse(dataNascimentoAutor), idAutor);

            nomeAutor = "J.K Rowling";
            dataNascimentoAutor = "31/07/1965";
            idAutor = 2221;
            autorService.adicionarAutor(nomeAutor, LocalDate.parse(dataNascimentoAutor), idAutor);

            nomeAutor = "Machado de Assis";
            dataNascimentoAutor = "21/06/1839";
            idAutor = 2222;
            autorService.adicionarAutor(nomeAutor, LocalDate.parse(dataNascimentoAutor), idAutor);
            System.out.println();
        }

}

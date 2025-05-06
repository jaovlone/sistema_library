package sistema_library.controller;

import sistema_library.service.LivroService;
import java.time.LocalDate;

public class LivroController {
    public void AdicionaLivrosTesteFluxo() {
        LivroService livroService = new LivroService();
        String titulo = "O iluminado";
        String nomeDoAutor = "Stephen King";
        Boolean disponibilidade = true;
        String dataCadastro = "22 - 04 - 2025";
        LocalDate dataAtualizacao = LocalDate.now();
        Integer idBook = 1000;
        livroService.adicionarLivro(titulo, nomeDoAutor, disponibilidade, LocalDate.parse(dataCadastro), dataAtualizacao, idBook);

        titulo = "Harry Potter e a pedra filosofal";
        nomeDoAutor = "J.K Rowling";
        disponibilidade = true;
        dataCadastro = "22 - 04 - 2025";
        dataAtualizacao = LocalDate.now();
        idBook = 1001;
        livroService.adicionarLivro(titulo, nomeDoAutor, disponibilidade, LocalDate.parse(dataCadastro), dataAtualizacao, idBook);

        titulo = "Dom Casmuro";
        nomeDoAutor = "Machado de Assis";
        disponibilidade = true;
        dataCadastro = "22 - 04 - 2025";
        dataAtualizacao = LocalDate.now();
        idBook = 1002;
        livroService.adicionarLivro(titulo, nomeDoAutor, disponibilidade, LocalDate.parse(dataCadastro), dataAtualizacao, idBook);

        titulo = "Doutor Sono";
        nomeDoAutor = "Stephen King";
        disponibilidade = true;
        dataCadastro = "22 - 04 - 2025";
        dataAtualizacao = LocalDate.now();
        idBook = 1003;
        livroService.adicionarLivro(titulo, nomeDoAutor, disponibilidade, LocalDate.parse(dataCadastro), dataAtualizacao, idBook);

    }
}

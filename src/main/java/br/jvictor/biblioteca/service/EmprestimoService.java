package br.jvictor.biblioteca.service;

import br.jvictor.biblioteca.domain.Emprestimo;
import br.jvictor.biblioteca.domain.Livro;
import br.jvictor.biblioteca.domain.Usuario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmprestimoService {
    private List<Emprestimo> emprestimos = new ArrayList<>();
    private List<Emprestimo> emprestimosDevolvidos = new ArrayList<>();

    private LivroService livroService = new LivroService();
    private UsuarioService usuarioService = new UsuarioService();

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(List<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }

    public void realizarEmprestimoDeLivro() {
        System.out.println("/n Qual livro deseja pegar ?");
        Scanner scanner = new Scanner(System.in);

        List<Livro> livros = livroService.listarTodosLivros();

        // 1- Buscar o livro solicitado
        String livroEscolhido = scanner.nextLine();

        Livro livroEncontrado = this.buscarLivroNaBiblioteca(livros, livroEscolhido);

        if (livroEncontrado == null) {
            System.out.println("/n O" + livroEncontrado + "não está cadastrado na biblioteca");
            return;
        }

        // 2 - Buscar o usuários
        List<Usuario> usuarios = usuarioService.recuperarTodosUsuarios();

        String usuarioEmprestimo = scanner.nextLine();

        Usuario usuarioCadastrado = this.buscarUsuarioCadastrado(usuarios, usuarioEmprestimo);

        if (usuarioCadastrado == null) {
            System.out.println("/n O" + usuarioCadastrado + "não está cadastrado na biblioteca");
            return;
        }

        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setIdBook(livroEncontrado.getIdBook());
        emprestimo.setIdUser(usuarioCadastrado.getIdUser());
        emprestimo.setDataInicioEmprestimo(LocalDate.now());


        //TODO
        this.emprestimos.add(emprestimo);
    }

    public Usuario buscarUsuarioCadastrado(List<Usuario> usuarios, String nomeUsuario) {
        Usuario usuarioCadastrado = null;

        for (Usuario usuario : usuarios) {
            if (nomeUsuario.equalsIgnoreCase(usuario.getNomeUser())) {
                usuarioCadastrado = usuario;
            }
        }
        return usuarioCadastrado;
    }

    public Livro buscarLivroNaBiblioteca(List<Livro> livros, String tiuloLivroEscolhido) {
        Livro livroEncontrado = null;

        for (Livro livro : livros) {
            if (tiuloLivroEscolhido.equalsIgnoreCase(livro.getTitulo())) {
                livroEncontrado = livro;
            }
        }
        return livroEncontrado;
    }


    public void devolucaoDoLivro() {

        System.out.println("/n Qual livro deseja devolver?");
        Scanner scanner = new Scanner(System.in);
        String tituloLivroDevolvido = scanner.nextLine();

        List<Livro> livros = livroService.listarTodosLivros();
        Livro livroDevolvido = this.buscarLivroNaBiblioteca(livros, tituloLivroDevolvido);

        if (livroDevolvido == null) {
            System.out.println("/n O" + livroDevolvido + "não está cadastrado na biblioteca");
        } else {
            System.out.println("/n O"+ livroDevolvido+ "foi devolvido com sucesso , na data de" + livroDevolvido.getDataAtualizacao());
        }




        /**
         * TODO
         * 1) procurar pelo id do livro na lista de Emprestimo
         * 2) qdo encontrar.. setar a data final do emprestimo
         * 3) pega esse empréstimo q teve a data fim atualizada e coloca ele na lista de emprestimosDevolvidos
         * 4) remove esse emprestimo da lista de emprestimos.
         */

    }

    public void consultarEmprestimosDeUmLivro() {
        System.out.println("/n Qual livro você deseja ver histórico de empréstimos ?");
        Scanner scanner = new Scanner(System.in);
        String historicoLivro = scanner.nextLine();
        List<Emprestimo> emprestimos = getEmprestimos();

        //procura na lista de emprestimo se o livro está lá . comparando os ids dos dois
        //TODO
    }

    public void consultarEmprestimosDoUsuario() {
        System.out.println("/n Qual usuário você deseja ver histórico de empréstimos ?");
        Scanner scanner = new Scanner(System.in);
        String historicoUsuario = scanner.nextLine();
        List<Emprestimo> emprestimos = getEmprestimos();

        //procura na lista de emprestimo se o usuário está lá . comparando os ids dos dois
        //TODO
    }
}

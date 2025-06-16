public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String editora;
    private String isbn;

    public Livro(String titulo, String autor, int anoPublicacao, String editora, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.editora = editora;
        this.isbn = isbn;
    }

    // Métodos getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getEditora() {
        return editora;
    }

    public String getIsbn() {
        return isbn;
    }

    // Método para exibir informações do livro
    public void exibirInformacoes() {
        System.out.println("📚 Título: " + titulo);
        System.out.println("✍️ Autor: " + autor);
        System.out.println("📅 Ano de Publicação: " + anoPublicacao);
        System.out.println("🏢 Editora: " + editora);
        System.out.println("🔢 ISBN: " + isbn);
    }
}

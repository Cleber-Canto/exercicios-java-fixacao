public class TesteLivro {
    public static void main(String[] args) {
        Livro livro = new Livro(
            "O Senhor dos Anéis",
            "J.R.R. Tolkien",
            1954,
            "Allen & Unwin",
            "978-3-16-148410-0"
        );

        livro.exibirInformacoes();
    }
}

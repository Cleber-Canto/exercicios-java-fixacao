public class TesteLivroDeLivraria {
    public static void main(String[] args) {
        LivroDeLivraria livro = new LivroDeLivraria(
            "1984",
            "George Orwell",
            1949,
            "Companhia das Letras",
            "978-85-359-0277-2",
            39.90,
            12
        );

        livro.exibirInformacoesDeVenda();
    }
}

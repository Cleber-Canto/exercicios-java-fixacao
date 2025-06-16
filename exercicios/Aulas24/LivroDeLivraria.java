public class LivroDeLivraria extends Livro {
    private double preco;
    private int quantidadeEmEstoque;

    public LivroDeLivraria(String titulo, String autor, int anoPublicacao, String editora, String isbn,
                           double preco, int quantidadeEmEstoque) {
        super(titulo, autor, anoPublicacao, editora, isbn);
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void exibirInformacoesDeVenda() {
        super.exibirInformacoes();
        System.out.println("💰 Preço: R$" + preco);
        System.out.println("📦 Estoque: " + quantidadeEmEstoque + " unidade(s)");
    }
}

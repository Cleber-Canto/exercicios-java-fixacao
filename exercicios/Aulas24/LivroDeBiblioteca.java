public class LivroDeBiblioteca extends Livro {
    private boolean emprestado;
    private String nomeDoLeitor;

    public LivroDeBiblioteca(String titulo, String autor, int anoPublicacao, String editora, String isbn) {
        super(titulo, autor, anoPublicacao, editora, isbn);
        this.emprestado = false;
        this.nomeDoLeitor = null;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public String getNomeDoLeitor() {
        return nomeDoLeitor;
    }

    public void emprestar(String nomeLeitor) {
        if (!emprestado) {
            this.emprestado = true;
            this.nomeDoLeitor = nomeLeitor;
            System.out.println("📖 Livro emprestado para: " + nomeLeitor);
        } else {
            System.out.println("❌ Livro já está emprestado para: " + nomeDoLeitor);
        }
    }

    public void devolver() {
        if (emprestado) {
            System.out.println("📚 Livro devolvido por: " + nomeDoLeitor);
            this.emprestado = false;
            this.nomeDoLeitor = null;
        } else {
            System.out.println("🔍 Esse livro não está emprestado no momento.");
        }
    }

    public void exibirStatus() {
        super.exibirInformacoes();
        if (emprestado) {
            System.out.println("🔒 Status: Emprestado para " + nomeDoLeitor);
        } else {
            System.out.println("🔓 Status: Disponível para empréstimo");
        }
    }
}


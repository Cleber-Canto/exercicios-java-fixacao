public class TesteLivroDeBiblioteca {
    public static void main(String[] args) {
        LivroDeBiblioteca livro = new LivroDeBiblioteca(
            "Dom Casmurro",
            "Machado de Assis",
            1899,
            "Livraria Garnier",
            "978-85-123-4567-8"
        );

        // Exibe status inicial
        livro.exibirStatus();

        // Tenta emprestar o livro
        System.out.println("\nTentando emprestar para Ana...");
        livro.emprestar("Ana");

        // Exibe status após empréstimo
        livro.exibirStatus();

        // Tenta emprestar novamente
        System.out.println("\nTentando emprestar para Bruno...");
        livro.emprestar("Bruno");

        // Devolve o livro
        System.out.println("\nRealizando devolução...");
        livro.devolver();

        // Exibe status final
        livro.exibirStatus();
    }
}

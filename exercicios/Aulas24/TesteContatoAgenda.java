public class TesteContatoAgenda {
    public static void main(String[] args) {
        ContatoAgenda contato = new ContatoAgenda(
            "Cleber Canto",
            "(92) 91234-5678",
            "cleber@example.com",
            "Rua Amazonas, 123 - Manaus",
            "Contato da faculdade"
        );

        contato.exibirContato();
    }
}

public class TesteContaCorrente {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente(12345, 1000.0, true, 500.0);

        conta1.exibirInformacoes();

        System.out.println("\n➡️ Tentando sacar R$1200...");
        conta1.sacar(1200.0);

        conta1.exibirInformacoes();

        System.out.println("\n➡️ Depositando R$300...");
        conta1.depositar(300.0);

        conta1.exibirInformacoes();

        System.out.println("\n➡️ Tentando sacar R$2000...");
        conta1.sacar(2000.0);

        conta1.exibirInformacoes();
    }
}

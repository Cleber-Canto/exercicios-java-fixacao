public class ContaCorrente {
    private int numero;
    private double saldo;
    private boolean especial;
    private double limite;

    public ContaCorrente(int numero, double saldoInicial, boolean especial, double limite) {
        this.numero = numero;
        this.saldo = saldoInicial;
        this.especial = especial;
        this.limite = limite;
    }

    public boolean sacar(double valor) {
        if (saldo + (especial ? limite : 0) >= valor) {
            saldo -= valor;
            return true;
        } else {
            System.out.println("❌ Saldo insuficiente.");
            return false;
        }
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public double consultarSaldoDisponivel() {
        return saldo + (especial ? limite : 0);
    }

    public void exibirInformacoes() {
        System.out.println("🔢 Conta nº: " + numero);
        System.out.println("💰 Saldo atual: R$" + saldo);
        System.out.println("✨ Conta especial: " + (especial ? "Sim" : "Não"));
        System.out.println("📈 Limite disponível: R$" + limite);
        System.out.println("🔎 Saldo total disponível: R$" + consultarSaldoDisponivel());
    }
}

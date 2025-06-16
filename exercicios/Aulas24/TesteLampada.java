public class TesteLampada {
    public static void main(String[] args) {
        LampadaSupermercado lampada = new LampadaSupermercado("Philips", "LED", 15, "Branca", 29.90);

        System.out.println("\n🔎 Informações da Lâmpada:");
        lampada.exibirInformacoes();

        System.out.println("\n💡 Ligando a lâmpada...");
        lampada.ligar();
        System.out.println("Está ligada? " + (lampada.estaLigada() ? "Sim" : "Não"));

        System.out.println("\n🔌 Desligando a lâmpada...");
        lampada.desligar();
        System.out.println("Está ligada? " + (lampada.estaLigada() ? "Sim" : "Não"));
    }
}

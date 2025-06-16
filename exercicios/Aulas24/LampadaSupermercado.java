public class LampadaSupermercado {
    private String marca;
    private String tipo; // ex: LED, fluorescente
    private int potencia; // em watts
    private String corLuz; // ex: branca, amarela
    private double preco;
    private boolean ligada;

    public LampadaSupermercado(String marca, String tipo, int potencia, String corLuz, double preco) {
        this.marca = marca;
        this.tipo = tipo;
        this.potencia = potencia;
        this.corLuz = corLuz;
        this.preco = preco;
        this.ligada = false; // desligada por padrão
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public boolean estaLigada() {
        return ligada;
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Tipo: " + tipo);
        System.out.println("Potência: " + potencia + "W");
        System.out.println("Cor da luz: " + corLuz);
        System.out.println("Preço: R$" + preco);
        System.out.println("Está ligada? " + (ligada ? "Sim" : "Não"));
    }
}

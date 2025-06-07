public class TabelaPrecosLoja {
    public static void main(String[] args) {
        double precoUnitario = 1.99;

        System.out.println("✅ Lojas Quase Dois - Tabela de preços");
        
        for (int quantidade = 1; quantidade <= 50; quantidade++) {
            double total = quantidade * precoUnitario;
            System.out.printf("%d - R$ %.2f%n", quantidade, total);
        }
    }
}

public class FibonacciAte500 {
    public static void main(String[] args) {
        int primeiro = 0, segundo = 1, proximo;

        System.out.println("✅ Sequência de Fibonacci até ultrapassar 500:");

        System.out.print(primeiro + " " + segundo + " "); // Imprime os dois primeiros números

        // Gera a sequência até que o próximo número seja maior que 500
        while (segundo <= 500) {
            proximo = primeiro + segundo;
            if (proximo > 500) {
                break; // Para o loop se ultrapassar 500
            }
            System.out.print(proximo + " ");
            primeiro = segundo;
            segundo = proximo;
        }

        System.out.println(); // Quebra de linha no final
    }
}

public class ImpressaoNumeros {
    public static void main(String[] args) {
        // Exibir números um abaixo do outro
        System.out.println("✅ Números de 1 a 20 (um abaixo do outro):");
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }

        // Exibir números um ao lado do outro
        System.out.println("\n✅ Números de 1 a 20 (um ao lado do outro):");
        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // Quebra de linha no final
    }
}

import java.util.Scanner;

public class VerificadorDeLetra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite uma letra
        System.out.print("Digite uma letra: ");
        char letra = scanner.next().toLowerCase().charAt(0); // Converte para minúscula

        // Verifica se é vogal ou consoante
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("A letra '" + letra + "' é uma vogal.");
        } else if (Character.isLetter(letra)) {
            System.out.println("A letra '" + letra + "' é uma consoante.");
        } else {
            System.out.println("Entrada inválida! Digite apenas letras.");
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class VerificadorDeSexo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite uma letra
        System.out.print("Digite F para Feminino ou M para Masculino: ");
        String letra = scanner.next().toUpperCase(); // Converte para maiúscula

        // Verifica o valor digitado
        if (letra.equals("F")) {
            System.out.println("F - Feminino");
        } else if (letra.equals("M")) {
            System.out.println("M - Masculino");
        } else {
            System.out.println("Sexo Inválido");
        }

        scanner.close();
    }
}

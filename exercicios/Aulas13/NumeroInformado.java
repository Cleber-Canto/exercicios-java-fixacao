import java.util.Scanner;

public class NumeroInformado {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
            
            System.out.println("O número informado foi " + numero);
        }
    }
}

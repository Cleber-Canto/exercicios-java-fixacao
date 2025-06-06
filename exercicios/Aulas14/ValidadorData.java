import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ValidadorData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Solicita ao usuário a data
        System.out.print("Digite uma data no formato dd/mm/aaaa: ");
        String dataEntrada = scanner.next();

        try {
            // Tenta converter a data para verificar se é válida
            LocalDate data = LocalDate.parse(dataEntrada, formato);
            System.out.println("A data " + dataEntrada + " é válida.");
        } catch (DateTimeParseException e) {
            System.out.println("A data " + dataEntrada + " é inválida.");
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class SeparadorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário um número inteiro menor que 1000
        System.out.print("Digite um número inteiro menor que 1000: ");
        int numero = scanner.nextInt();

        // Verifica se o número está dentro do intervalo válido
        if (numero < 0 || numero >= 1000) {
            System.out.println("Número inválido! Digite um valor entre 0 e 999.");
        } else {
            // Calcula centenas, dezenas e unidades
            int centenas = numero / 100;
            int dezenas = (numero % 100) / 10;
            int unidades = numero % 10;

            // Formata corretamente a saída
            String resultado = "";
            if (centenas > 0) {
                resultado += centenas + (centenas == 1 ? " centena" : " centenas");
                if (dezenas > 0 || unidades > 0) resultado += ", ";
            }
            if (dezenas > 0) {
                resultado += dezenas + (dezenas == 1 ? " dezena" : " dezenas");
                if (unidades > 0) resultado += " e ";
            }
            if (unidades > 0) {
                resultado += unidades + (unidades == 1 ? " unidade" : " unidades");
            }

            // Exibe o resultado final
            System.out.println(numero + " = " + resultado);
        }

        scanner.close();
    }
}

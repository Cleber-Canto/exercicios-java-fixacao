import java.util.Scanner;

public class ValidacaoDadosUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome, sexo, estadoCivil;
        int idade;
        double salario;

        // Validação do nome
        do {
            System.out.print("Digite seu nome (mínimo 3 caracteres): ");
            nome = scanner.nextLine();
            if (nome.length() <= 3) {
                System.out.println("Erro: O nome deve ter mais de 3 caracteres.");
            }
        } while (nome.length() <= 3);

        // Validação da idade
        do {
            System.out.print("Digite sua idade (entre 0 e 150): ");
            idade = scanner.nextInt();
            if (idade < 0 || idade > 150) {
                System.out.println("Erro: A idade deve estar entre 0 e 150 anos.");
            }
        } while (idade < 0 || idade > 150);

        // Validação do salário
        do {
            System.out.print("Digite seu salário (deve ser maior que zero): ");
            salario = scanner.nextDouble();
            if (salario <= 0) {
                System.out.println("Erro: O salário deve ser maior que zero.");
            }
        } while (salario <= 0);

        scanner.nextLine(); // Limpar buffer do Scanner

        // Validação do sexo
        do {
            System.out.print("Digite seu sexo ('f' para feminino, 'm' para masculino): ");
            sexo = scanner.nextLine().toLowerCase();
            if (!sexo.equals("f") && !sexo.equals("m")) {
                System.out.println("Erro: O sexo deve ser 'f' ou 'm'.");
            }
        } while (!sexo.equals("f") && !sexo.equals("m"));

        // Validação do estado civil
        do {
            System.out.print("Digite seu estado civil ('s' solteiro, 'c' casado, 'v' viúvo, 'd' divorciado): ");
            estadoCivil = scanner.nextLine().toLowerCase();
            if (!estadoCivil.equals("s") && !estadoCivil.equals("c") && !estadoCivil.equals("v") && !estadoCivil.equals("d")) {
                System.out.println("Erro: O estado civil deve ser 's', 'c', 'v' ou 'd'.");
            }
        } while (!estadoCivil.equals("s") && !estadoCivil.equals("c") && !estadoCivil.equals("v") && !estadoCivil.equals("d"));

        System.out.println("\n✅ Dados validados com sucesso!");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Sexo: " + (sexo.equals("f") ? "Feminino" : "Masculino"));
        System.out.println("Estado Civil: " + estadoCivil.toUpperCase());

        scanner.close();
    }
}

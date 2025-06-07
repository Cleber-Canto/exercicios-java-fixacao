import java.util.Scanner;

public class ValidacaoUsuarioSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usuario, senha;

        // Loop até que a senha seja diferente do nome de usuário
        do {
            System.out.print("Digite seu nome de usuário: ");
            usuario = scanner.nextLine();

            System.out.print("Digite sua senha: ");
            senha = scanner.nextLine();

            if (usuario.equals(senha)) {
                System.out.println("Erro: A senha não pode ser igual ao nome de usuário! Tente novamente.");
            }

        } while (usuario.equals(senha));

        System.out.println("Cadastro realizado com sucesso!");
        scanner.close();
    }
}

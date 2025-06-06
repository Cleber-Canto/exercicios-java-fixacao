import java.util.Scanner;

public class InvestigacaoCrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int respostasPositivas = 0;

        // Lista de perguntas
        String[] perguntas = {
            "Telefonou para a vítima?",
            "Esteve no local do crime?",
            "Mora perto da vítima?",
            "Devia para a vítima?",
            "Já trabalhou com a vítima?"
        };

        // Faz as perguntas ao usuário
        System.out.println("Responda com 'S' para sim ou 'N' para não.");
        for (String pergunta : perguntas) {
            System.out.print(pergunta + " ");
            char resposta = scanner.next().toUpperCase().charAt(0);
            if (resposta == 'S') {
                respostasPositivas++;
            }
        }

        // Determina a classificação da pessoa
        String classificacao;
        if (respostasPositivas == 5) {
            classificacao = "Assassino";
        } else if (respostasPositivas >= 3) {
            classificacao = "Cúmplice";
        } else if (respostasPositivas == 2) {
            classificacao = "Suspeita";
        } else {
            classificacao = "Inocente";
        }

        // Exibe a classificação final
        System.out.println("\n📌 Classificação: " + classificacao);

        scanner.close();
    }
}

import java.util.Scanner;

public class AgendaPessoalMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] agenda = new String[31][24]; // 31 dias, 24 horas
        int opcao;

        do {
            System.out.println("\n===== AGENDA PESSOAL =====");
            System.out.println("1 - Adicionar/Alterar compromisso");
            System.out.println("2 - Consultar compromisso");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o dia do mês (1-31): ");
                    int diaAdd = scanner.nextInt();
                    System.out.print("Digite a hora (0-23): ");
                    int horaAdd = scanner.nextInt();
                    scanner.nextLine(); // consumir newline
                    if (diaAdd < 1 || diaAdd > 31 || horaAdd < 0 || horaAdd > 23) {
                        System.out.println("❌ Dia ou hora inválidos!");
                    } else {
                        System.out.print("Digite o compromisso: ");
                        String compromisso = scanner.nextLine();
                        agenda[diaAdd - 1][horaAdd] = compromisso;
                        System.out.println("✅ Compromisso agendado com sucesso!");
                    }
                    break;

                case 2:
                    System.out.print("Digite o dia do mês (1-31): ");
                    int diaConsulta = scanner.nextInt();
                    System.out.print("Digite a hora (0-23): ");
                    int horaConsulta = scanner.nextInt();
                    if (diaConsulta < 1 || diaConsulta > 31 || horaConsulta < 0 || horaConsulta > 23) {
                        System.out.println("❌ Dia ou hora inválidos!");
                    } else {
                        String consulta = agenda[diaConsulta - 1][horaConsulta];
                        if (consulta == null) {
                            System.out.println("📭 Nenhum compromisso agendado.");
                        } else {
                            System.out.println("📌 Compromisso: " + consulta);
                        }
                    }
                    break;

                case 0:
                    System.out.println("👋 Encerrando agenda...");
                    break;

                default:
                    System.out.println("❌ Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}

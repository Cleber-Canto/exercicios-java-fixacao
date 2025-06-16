import java.util.Scanner;

public class AgendaAnualMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Agenda: 12 meses, até 31 dias, 8 horas por dia
        String[][][] agenda = new String[12][31][8];

        int opcao;

        do {
            System.out.println("\n===== AGENDA ANUAL =====");
            System.out.println("1 - Adicionar/Alterar compromisso");
            System.out.println("2 - Consultar compromisso");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Mês (1-12): ");
                    int mesAdd = scanner.nextInt();
                    System.out.print("Dia (1-31): ");
                    int diaAdd = scanner.nextInt();
                    System.out.print("Hora (0-7): ");
                    int horaAdd = scanner.nextInt();
                    scanner.nextLine(); // limpar quebra de linha

                    if (validarEntrada(mesAdd, diaAdd, horaAdd)) {
                        System.out.print("Digite o compromisso: ");
                        String compromisso = scanner.nextLine();
                        agenda[mesAdd - 1][diaAdd - 1][horaAdd] = compromisso;
                        System.out.println("✅ Compromisso salvo com sucesso!");
                    } else {
                        System.out.println("❌ Entrada inválida.");
                    }
                    break;

                case 2:
                    System.out.print("Mês (1-12): ");
                    int mesConsulta = scanner.nextInt();
                    System.out.print("Dia (1-31): ");
                    int diaConsulta = scanner.nextInt();
                    System.out.print("Hora (0-7): ");
                    int horaConsulta = scanner.nextInt();

                    if (validarEntrada(mesConsulta, diaConsulta, horaConsulta)) {
                        String compromisso = agenda[mesConsulta - 1][diaConsulta - 1][horaConsulta];
                        if (compromisso == null || compromisso.isEmpty()) {
                            System.out.println("📭 Nenhum compromisso agendado.");
                        } else {
                            System.out.println("📌 Compromisso: " + compromisso);
                        }
                    } else {
                        System.out.println("❌ Entrada inválida.");
                    }
                    break;

                case 0:
                    System.out.println("👋 Saindo da agenda.");
                    break;

                default:
                    System.out.println("❌ Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static boolean validarEntrada(int mes, int dia, int hora) {
        return mes >= 1 && mes <= 12 &&
               dia >= 1 && dia <= 31 &&
               hora >= 0 && hora <= 7;
    }
}

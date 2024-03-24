import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número total de eleitores: ");
        int numeroEleitores = scanner.nextInt();

        if (numeroEleitores <= 0) {
            System.out.println("O número total de eleitores deve ser um número positivo.");
        } else {
            int[] votosCandidatos = new int[3]; // Array para armazenar os votos de cada candidato

            for (int i = 1; i <= numeroEleitores; i++) {
                System.out.println("Eleitor " + i + ":");
                System.out.println("Digite o número do candidato (1, 2 ou 3) em quem você deseja votar:");
                int voto = scanner.nextInt();

                // Verifica se o voto é válido (entre 1 e 3) e incrementa a contagem de votos do candidato correspondente
                if (voto >= 1 && voto <= 3) {
                    votosCandidatos[voto - 1]++; // Ajusta o índice do array conforme o número do candidato
                } else {
                    System.out.println("Voto inválido. Por favor, digite um número entre 1 e 3.");
                    i--; // Volta uma iteração para permitir que o eleitor vote novamente
                }
            }

            // Mostra o número de votos de cada candidato
            System.out.println("\nResultado da eleição:");
            for (int candidato = 0; candidato < 3; candidato++) {
                System.out.println("Candidato " + (candidato + 1) + ": " + votosCandidatos[candidato] + " votos");
            }
        }

        scanner.close();
    }
}

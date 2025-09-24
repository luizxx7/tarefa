import java.util.Scanner;

public class SistemaESCOLAR   {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[8];

        // Recebendo as 8 notas
        System.out.println("Digite as 8 notas anuais:");
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // Calculando médias bimestrais
        double[] mediasBimestrais = new double[4];
        for (int i = 0; i < 4; i++) {
            mediasBimestrais[i] = (notas[i * 2] + notas[i * 2 + 1]) / 2;
        }

        // Calculando médias semestrais
        double semestre1 = (mediasBimestrais[0] + mediasBimestrais[1]) / 2;
        double semestre2 = (mediasBimestrais[2] + mediasBimestrais[3]) / 2;

        // Média final
        double mediaFinal = (semestre1 + semestre2) / 2;

        // Exibindo os resultados
        System.out.println("\n--- Resultados ---");
        System.out.println("1º Bimestre: " + mediasBimestrais[0]);
        System.out.println("2º Bimestre: " + mediasBimestrais[1]);
        System.out.println("1º Semestre: " + semestre1);
        System.out.println("3º Bimestre: " + mediasBimestrais[2]);
        System.out.println("4º Bimestre: " + mediasBimestrais[3]);
        System.out.println("2º Semestre: " + semestre2);
        System.out.println("Média Final: " + mediaFinal);
    }
}

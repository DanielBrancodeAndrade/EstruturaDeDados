import java.util.Scanner;

    public class Questao21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] modelos = new String[5];
        double[] consumo = new double[5];
        final double PRECO_GASOLINA = 2.25;
        final double DISTANCIA = 1000.0;

        System.out.println("Comparativo de Consumo de Combustível");

        for (int i = 0; i < modelos.length; i++) {
            System.out.printf("Veículo %d\n", (i + 1));
            System.out.print("Nome: ");
            modelos[i] = sc.nextLine();
            System.out.print("Km por litro: ");
            consumo[i] = sc.nextDouble();
            sc.nextLine();
        }

        System.out.println("\nRelatório Final");

        int indiceMaisEconomico = 0;
        double maiorConsumo = consumo[0];

        for (int i = 0; i < modelos.length; i++) {
            double litros = DISTANCIA / consumo[i];
            double custo = litros * PRECO_GASOLINA;

            System.out.printf("%d - %s - %.1f - %.1f litros - R$ %.2f\n",
                    (i + 1), modelos[i], consumo[i], litros, custo);

            if (consumo[i] > maiorConsumo) {
                maiorConsumo = consumo[i];
                indiceMaisEconomico = i;
            }
        }

        System.out.printf("\nO menor consumo é do %s.\n", modelos[indiceMaisEconomico]);

        sc.close();
    }
}


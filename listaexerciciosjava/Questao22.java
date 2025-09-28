import java.util.Scanner;

    public class Questao22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] defeitos = new int[4]; 
        int total = 0;

        while (true) {
            System.out.print("Informe o número de identificação do mouse (0 encerra): ");
            int id = sc.nextInt();

            if (id == 0) break; 

            System.out.println("Informe o tipo de defeito:");
            System.out.println("1 - necessita da esfera");
            System.out.println("2 - necessita de limpeza");
            System.out.println("3 - necessita troca do cabo ou conector");
            System.out.println("4 - quebrado ou inutilizado");

            int tipo = sc.nextInt();

            if (tipo >= 1 && tipo <= 4) {
                defeitos[tipo - 1]++;
                total++;
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }

        System.out.println("\nRelatório Final:");
        System.out.println("Quantidade de mouses: " + total);
        System.out.println();
        System.out.println("Situação\t\t\t\tQuantidade\tPercentual");

        String[] situacoes = {
            "1- necessita da esfera",
            "2- necessita de limpeza",
            "3- necessita troca do cabo ou conector",
            "4- quebrado ou inutilizado"
        };

        for (int i = 0; i < defeitos.length; i++) {
            double percentual = total > 0 ? (defeitos[i] * 100.0 / total) : 0;
            System.out.printf("%-35s %5d %10.1f%%\n", situacoes[i], defeitos[i], percentual);
        }

        sc.close();
    }
}


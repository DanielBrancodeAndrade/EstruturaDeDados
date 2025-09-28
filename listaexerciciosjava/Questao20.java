import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao20 {

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Double> salarios = new ArrayList<>();
        List<Double> abonos = new ArrayList<>();

        double salario;
        double totalGasto = 0;
        int countMinimos = 0;
        double maiorAbono = 0;

        System.out.println("Projeção de Gastos com Abono");
        System.out.println("============================");

        while (true) {
            System.out.print("Salário: ");
            salario = sc.nextDouble();

            if (salario == 0) break; // encerra leitura

            double abono = salario * 0.20;
            if (abono < 100) {
                abono = 100;
                countMinimos++;
            }

            salarios.add(salario);
            abonos.add(abono);

            totalGasto += abono;

            if (abono > maiorAbono) {
                maiorAbono = abono;
            }
        }

        System.out.println("\nSalário - Abono");
        for (int i = 0; i < salarios.size(); i++) {
            System.out.printf("R$ %.2f - R$ %.2f\n", salarios.get(i), abonos.get(i));
        }

        System.out.println();
        System.out.printf("Foram processados %d colaboradores\n", salarios.size());
        System.out.printf("Total gasto com abonos: R$ %.2f\n", totalGasto);
        System.out.printf("Valor mínimo pago a %d colaboradores\n", countMinimos);
        System.out.printf("Maior valor de abono pago: R$ %.2f\n", maiorAbono);

        sc.close();
    }
}


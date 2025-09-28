//Faça um programa em Java que leia um vetor de 10 números reais e mostreos na ordem inversa
import java.util.Scanner
public class Questao02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            numeros[i] = sc.nextDouble();
        }

        System.out.println("Números em ordem inversa:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        sc.close();
    }
}

import java.util.*;

public class QU27 {
    public static void main(String[] args) {
        int N = 1000;
        List<Integer> perfeitos = new ArrayList<>();

        for (int i = 2; i < N; i++) {
            if (ehPerfeito(i)) {
                perfeitos.add(i);
            }
        }
        System.out.println(perfeitos);
    }

    public static boolean ehPerfeito(int n) {
        int soma = 1;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) soma += i;
        }
        return soma == n;
    }
}


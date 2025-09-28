import java.util.*;

public class QU26 {
    public static void main(String[] args) {
        int N = 10; 
        int[] primos = new int[N];
        int count = 0, num = 2;

        while (count < N) {
            if (ehPrimo(num)) {
                primos[count++] = num;
            }
            num++;
        }
        System.out.println(Arrays.toString(primos));
    }

    public static boolean ehPrimo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}


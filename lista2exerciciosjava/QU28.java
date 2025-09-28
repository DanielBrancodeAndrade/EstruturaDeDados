import java.util.Arrays;

public class QU28 {
    public static void main(String[] args) {
        int N = 10;
        int[] fib = new int[N];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < N; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        System.out.println(Arrays.toString(fib));
    }
}


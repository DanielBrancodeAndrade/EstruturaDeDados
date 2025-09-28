import java.util.*;

public class QU30 {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5};
        Set<Integer> set = new LinkedHashSet<>();

        for (int n : array) set.add(n);

        System.out.println(set);
    }
}


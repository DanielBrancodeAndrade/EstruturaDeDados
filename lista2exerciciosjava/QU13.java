    public class QU13 {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};
        int[] copia = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            copia[i] = original[i];
        }

        System.out.println("Array original:");
        for (int n : original) System.out.print(n + " ");

        System.out.println("\nArray cópia:");
        for (int n : copia) System.out.print(n + " ");
    }
}


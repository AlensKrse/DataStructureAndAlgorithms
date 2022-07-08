package main.sort;

public class Recursive {

    public static void main(String[] args) {
        final long beforeIterative = System.nanoTime();
        final int iterativeFactorial = iterativeFactorial(40);
        final long thenIterative = System.nanoTime();

        System.out.println(thenIterative - beforeIterative);

        final long beforeRecursive = System.nanoTime();
        final int recursiveFactorial = recursiveFactorial(Integer.MAX_VALUE);
        final long thenRecursive = System.nanoTime();

        System.out.println(thenRecursive - beforeRecursive);

        System.out.println(iterativeFactorial);
        System.out.println(recursiveFactorial);
    }

    public static int recursiveFactorial(int number) {
        if (number == 0) {
            return 1;
        }

        return number * recursiveFactorial(number - 1);
    }


    public static int iterativeFactorial(int number) {
        if (number == 0) {
            return 1;
        }

        int factorial = 1;
        for (int count = 1; count <= number; count++) {
            factorial *= count;
        }

        return factorial;
    }
}

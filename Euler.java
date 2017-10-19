package net.projecteuler;

public class Euler {
    public int fibonacci(int n) {
        if(n < 1) {throw new IllegalArgumentException();}
        if (n == 1 || n == 2) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public int shakingHandsFullGraph(int n){
        return n*(n - 1)/2;
    }

    public int shakingHandsCombination(int n){
        return factorialCyclical(n) / (2 * factorialCyclical(n - 2));
    }

    public int factorialRecursive(int n){
        return n == 0 || n == 1 ? 1 : factorialRecursive(n - 1) * n;
    }

    public int factorialCyclical(int n){
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }
}

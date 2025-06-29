// Project Euler Problem 6 - Sum Square Difference
// https://projecteuler.net/problem=6
// 2024-06-23

public class EulerP0006 {
    public static void main(String[] args) {
        int MAX = 100;
        long difference = consecutiveSum(MAX)*consecutiveSum(MAX) - sumOfSquares(MAX);
        System.out.println(difference);
    }

    private static long sumOfSquares(int n) {
        // Sum of 1^2 + ... + n^2
        return n * (n+1) * (2*n + 1) / 6;
    }

    private static long consecutiveSum(int n) {
        // Sum from 1 to n
        int sum = n * (n + 1) / 2;
        return sum;
    }
}
// Project Euler Problem 5 - Smallest Multiple
// https://projecteuler.net/problem=5
// 2024-06-22

public class EulerP0005 {
    public static void main(String[] args) {
        int MAX = 20;
        long product = 1;

        for (int i = 2; i <= MAX; i++) {
            long t = gcd(product, i);
            product = product*i/t;
        }

        System.out.println(product);
    }

    private static long gcd(long a, long b) {
        // Greatest Common Divisor
        // Division-based Euclidean Algorithm
        while (b != 0) {
            long t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}
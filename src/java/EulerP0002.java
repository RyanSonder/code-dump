// Project Euler Problem 2 - Even Fibonacci Numbers
// https://projecteuler.net/problem=2
// 2024-06-22

public class EulerP0002 {
    public static void main(String[] args) {
        // Even Fibonacci Numbers
        // O(n)
        int MAX = 4_000_000;
        long sum = 0;
        
        // Phi is used in Binet's formula
        double phi = (1 + Math.sqrt(5))/2;
        double root5 = Math.sqrt(5);

        // Even numbers occur every 3 numbers in the sequence
        for (int i = 0;; i += 3) {
            long num = Math.round(Math.pow(phi,i)/root5);
            if (num >= MAX) break;
            sum += num;
        }

        System.out.println(sum);
    }
}
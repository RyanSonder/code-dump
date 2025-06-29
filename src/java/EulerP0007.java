// Project Euler Problem 7 - 10 001st Prime
// https://projecteuler.net/problem=7
// 2024-06-23

public class EulerP0007 {
    public static void main(String[] args) {
        int MAX = 10_001;
        long largestPrime = 2;
        for (int i = 1; i < MAX;) {
            long n = largestPrime + 1;
            while (!isPrime(n)) {
                n++;
            }
            largestPrime = n;
            i++;
        }
        System.out.println(largestPrime);
    }

    private static boolean isPrime(long n) {
        // Trial Division method of prime checking
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
// Project Euler Problem 4 - Largest Palindrome Product
// https://projecteuler.net/problem=4
// 2024-06-23

public class EulerP0004 {
    public static void main(String[] args) {
        int a = 999;
        int largestPalindrome = 0;
        while (a >= 100) {
            int b = a - a%11;
            while (b >= 100) {
                if (isPalindrome(a*b) && a*b > largestPalindrome) {
                    largestPalindrome = a*b;
                }
                b -= 11;
            }
            
            a -= 1;
        }
        System.out.println(largestPalindrome);
    }

    private static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            reversed = reversed * 10 + lastDigit;
            num /= 10;
        }

        return original == reversed;
    }
}
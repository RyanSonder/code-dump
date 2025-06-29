// Project Euler Problem 1 - Multiples of 3 or 5
// https://projecteuler.net/problem=1
// 2024-06-22

public class EulerP0001 {
    public static void main(String[] args) {
        int MAX = 1_000;
        int sum = 0;
        
        sum += arithmeticSum(MAX, 3);
        sum += arithmeticSum(MAX, 5);
        sum -= arithmeticSum(MAX, 15);
    
        System.out.println(sum);
    }
    
    private static int arithmeticSum(int MAX, int multiple) {
        int n = (MAX - 1) / multiple;
        int sum = multiple * n * (n + 1) / 2;
        return sum;
    }
}
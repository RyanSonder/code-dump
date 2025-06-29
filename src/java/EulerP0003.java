// Project Euler Problem 3 - Largest Prime Factor
// https://projecteuler.net/problem=3
// 2024-06-23

public class EulerP0003 {
    public static void main(String[] args) {
        long num = 600851475143L;
        for (int i = 2; i * i <= num; i++) {
            while (num % i == 0) {
                num /= i;
            }
        }
        System.out.println(num);
    }
}
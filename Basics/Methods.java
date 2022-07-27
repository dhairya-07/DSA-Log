package DSA.Basics;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        PrintPrime(num1, num2);

    }

    static boolean IsPrime(int a) {
        if (a <= 1)
            return false;
        int i = 2;
        while (i * i <= a) {
            if (a % i == 0)
                return false;
            i++;
        }
        return true;

    }

    static void PrintPrime(int num1, int num2) {
        for (int i = num1; i <= num2; i++) {
            if (IsPrime(i))
                System.out.print(i + " ");
        }
    }

}

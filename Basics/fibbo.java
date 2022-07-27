package DSA.Basics;

import java.util.Scanner;

public class fibbo {

  public static void main(String[] args) {
    System.out.println("Which DSA.Basics.fibbo no. you want??");
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int a = 0;
    int b = 1;
    int count = 2;
    while (count <= n) {
      int temp = b;
      b = a + b;
      a = temp;
      count++;
    }
    System.out.println(n + "th fibbonachi number is " + b);
    input.close();
  }
}

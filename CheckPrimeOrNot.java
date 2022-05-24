# Prime-Number-or-not

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    
    Scanner a = new Scanner(System.in);
    System.out.println("enter a value");
    int num = a.nextInt();
    boolean flag = false;
    for (int i = 2; i <= num / 2; ++i) {
      
      if (num % i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag)
      System.out.println(num + " is  prime number.");
    else
      System.out.println(num + " is not prime number.");
  }
}

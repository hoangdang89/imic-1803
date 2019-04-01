package imic.buoi6;

import java.util.Scanner;

public class Condition
{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    int age = scan.nextInt();

    //Complex:
    if (age < 6){
      System.out.println("BABY");
    } else if(age < 12){
      System.out.println("Teenager");
    } else if(age < 20) {
      System.out.println("Young");
    } else {
      System.out.println("Adult!!");
    }

    //Simple
    if (age < 6){
      System.out.println("BABY");
    }

    //2nd level:
    if (age < 6){
      System.out.println("BABY");
    } else {
      System.out.println("Teenager");
    }
  }
}

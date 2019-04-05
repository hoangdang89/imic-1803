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

  public static void doSwitch()
  {
    int age = 8;
    switch(age) {
      case 7 :
        //do nothing
        break;
      case 8 :
      case 9 :
      case 10 :
        System.out.println("Teenager");
        break; // optional
      case 15:
        System.out.println("Young");
        break; // optional
      default : // Optional
        System.out.println("BABY");
    }
  }

  public static void doSwitch2()
  {
    // char grade = args[0].charAt(0);
    char grade = 'C';
    switch(grade) {
      case 'A' :
        System.out.println("Excellent!");
        break;
      case 'B' :
      case 'C' :
        System.out.println("Well done");
        break;
      case 'D' :
        System.out.println("You passed");
      case 'F' :
        System.out.println("Better try again");
        break;
      default :
        System.out.println("Invalid grade");
    }
    System.out.println("Your grade is " + grade);
  }

  public static String doIfElse2(int age, boolean isChildren)
  {
    String ketQua = "";

    if(age < 6){
      ketQua = "BABY";
    } else if(age < 12){
      ketQua = "Teenager";
    } else if(age < 20) {
      ketQua = "Young";
    } else{
      ketQua = "Adult!!";
      if(isChildren == true) {
        ketQua = "married";
      }
    }

    return ketQua;
  }
}

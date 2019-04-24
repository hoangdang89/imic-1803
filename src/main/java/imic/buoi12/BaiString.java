package imic.buoi12;

import java.util.Arrays;

public class BaiString
{

  public static void vietHoaString()
  {
    String myString = "I love coding Java!!";
    myString = myString.toUpperCase();
    System.out.println(myString);

    String mySpecicalString = "\"<([{\\^-=$!|]})?*+.>\"";
  }

  public static void printSpecialCharacter()
  {
    String mySpecicalString = "\"<([{\\^-=$!|]})?*+.>\"";
    System.out.println(mySpecicalString);
  }

  public static int searchStringInString(String input, String bigString)
  {
    return bigString.indexOf(input);
  }

  public static int countStringInString(String input, String bigString)
  {
    int count = 0;

    int position = 0;
    while(position >= 0){
      position = bigString.indexOf(input);
      if(position >= 0){
        count++;
        position += input.length();
        bigString = bigString.substring(position, bigString.length());
      }
    }

    return count;
  }

  public static int countStringInString2(String input, String bigString)
  {
    int count = 0;
    String[] strArrays = bigString.split(" ");

    //Print strArrays in Lamda style: ask Thay Hoang... neu khong biet..
    Arrays.stream(strArrays).forEach(System.out::println);

    for(String value: strArrays){
      if(value.equalsIgnoreCase("we")){
        count++;
      }
    }

    return count;
  }
}

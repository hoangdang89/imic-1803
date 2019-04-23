package imic.buoi13;

import java.util.ArrayList;
import java.util.List;

public class ListDemo
{

  public static void demoList()
  {
    List myList = new ArrayList();
    myList.add(12);
    myList.add("Hello");
    myList.add(3.7);

    int[] myIntArray = {1, 2, 3};
    myList.add(myIntArray);

    for(Object value: myList){
      System.out.println("value -> " + value);
    }
    System.out.println("size -> " + myList.size());
  }
}

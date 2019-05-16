package imic.buoi19;

import org.junit.Test;

public class JavaCollectionTest
{


  @Test
  public void findStudentInMap()
  {
    String maSo = "MS03";
    Student foundStudent = (new JavaCollection()).findStudentInMap(maSo);
    System.out.println("found Student -> " + foundStudent);
    assert foundStudent != null;
  }
}

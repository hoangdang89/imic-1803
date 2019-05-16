package imic.buoi19;

import java.util.HashMap;
import java.util.Map;

public class JavaCollection
{
  Map<String, Student> mapStudents = new HashMap();

  public Student findStudentInMap(String maSo)
  {
    initMapStudents();

    System.out.println("list of current Students ...");
    for (Student student : mapStudents.values()) {
      System.out.println("student -> " + student.toString());
    }

    System.out.println(String.format("Student need to find: MSSV = %s", maSo));
    return mapStudents.get(maSo);
  }

  private void initMapStudents()
  {
    mapStudents.put("MS01", new Student("MS01", "Tony Teo", 7.0));
    mapStudents.put("MS02", new Student("MS02", "Tony Stark", 10.0));
    mapStudents.put("MS03", new Student("MS03", "Thor", 7.0));
    mapStudents.put("MS04", new Student("MS04", "Dr. Strength", 9.0));
    mapStudents.put("MS05", new Student("MS05", "Huge", 6.0));
  }
}

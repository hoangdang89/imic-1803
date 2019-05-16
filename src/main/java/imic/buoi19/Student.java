package imic.buoi19;

public class Student
{

  String mssv;
  String name;
  double grade;

  public Student(String maSo, String name, double grade)
  {
    this.mssv = maSo;
    this.name = name;
    this.grade = grade;
  }


  @Override
  public String toString()
  {
    String out = getClass().getName() + "@{" +
        String.format(" mssv = '%s',", this.mssv) +
        String.format(" name = '%s',", this.name) +
        String.format(" grade = '%s'", this.grade) +
        "}";
    return out;
  }

}

package google;

import imic.buoi2.helloworld.App;
import org.junit.Test;

public class AppTest
{

  @Test
  public void testDatTenBien()
  {
    //Test chu hoa chu thuong!!
    String publicXYZ;
    String Test = "Peter";
    System.out.println(Test);
    String test = "David";
    System.out.println(test);
  }

  @Test
  public void checkAllPrimitiveDataType()
  {
    App.checkAllPrimitiveDataType();
  }

  @Test
  public void checkObjectType()
  {
    App.checkClassObjectType();
  }

  @Test
  public void checkReferenceType()
  {
    App.checkReferenceType();
  }
}
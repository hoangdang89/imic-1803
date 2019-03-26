package google;

import imic.Chicken;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest
{

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
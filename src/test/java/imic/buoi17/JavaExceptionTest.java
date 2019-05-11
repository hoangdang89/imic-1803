package imic.buoi17;

import org.junit.Test;

import static org.junit.Assert.*;

public class JavaExceptionTest
{

  @Test
  public void handleJavaException() throws DevideByZeroException
  {
    JavaException exp = new JavaException();
    exp.handleJavaException();
  }
}
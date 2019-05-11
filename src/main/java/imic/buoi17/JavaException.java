package imic.buoi17;

public class JavaException
{

  public void handleJavaException() throws DevideByZeroException
  {
    //devideByZero();
    //devideByZeroWithException();

    Object[] items = {1, "3", "x"};
    errorByDevideByString(10.0, items);
  }


  public int devideByZero()
  {
    int a = 7;
    int b = 0;
    return a / b;
  }

  public int devideByZeroWithException() throws DevideByZeroException
  {
    int a = 7;
    int b = 0;
    if(b == 0){
      throw new DevideByZeroException();
    } else {
      return a / b;
    }
  }

  public void errorByDevideByString(Double N, Object[] items)
  {
    for(Object item: items){
      Double d = Double.valueOf(items.toString());
      System.out.println(N / d);
    }
  }


}

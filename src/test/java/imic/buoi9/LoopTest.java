package imic.buoi9;

import org.junit.Test;

public class LoopTest
{

  @Test
  public void doSomethingWithLoop()
  {
    Loop.doWhile();
  }

  @Test
  public void doWhileWithContinue()
  {
    Loop.doWhileWithContinue();
  }

  @Test
  public void doWithFor()
  {
    Loop.doWithFor();
  }

  @Test
  public void doWithForAndContinue()
  {
    Loop.doWithForAndContinue();
  }

  @Test
  public void doLuckyNumber7()
  {
    Loop.doLuckyNumber7();
  }

  @Test
  public void tinhGiaiThuaN()
  {
    int N = 5;
    int ketQua = Loop.tinhGiaiThuaN(N);
    System.out.println("ketQua = " + ketQua);
  }
}
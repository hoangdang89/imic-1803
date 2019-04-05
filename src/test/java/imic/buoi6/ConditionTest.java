package imic.buoi6;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConditionTest
{

  @Test
  public void doSwitch()
  {
    Condition.doSwitch();
  }

  @Test
  public void doSwitch2()
  {
    Condition.doSwitch2();
  }

  @Test
  public void doIfElse2()
  {
    String testBaby = Condition.doIfElse2(4, false);
    System.out.println("testBaby -> " + testBaby);
    assert testBaby == "BABY";

    String testTeenager = Condition.doIfElse2(8, true);
    System.out.println("testTeenager -> " + testTeenager);
    assert testTeenager == "Teenager";

    String testYoung = Condition.doIfElse2(13, true);
    System.out.println("testYoung -> " + testYoung);
    assert testYoung == "Young";

    String testMarried = Condition.doIfElse2(23, true);
    System.out.println("testMarried -> " + testMarried);
    assert testMarried == "married";
  }
}
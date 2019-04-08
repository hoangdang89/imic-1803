package imic.buoi9;

public class Loop
{
  public static void doWhile()
  {
    String myName = "Hoang Dang";

    //LOOP: try to print 10 lines of myName:
    int x = 0;
    while( x < 10 ) {
      System.out.println(myName);
      x++;

      if(x >= 10){
        break; //To stop While here!!!
      }
    }
  }

  public static void doWhileWithContinue()
  {
    //LOOP: try to print EVEN numbers only!!
    int x = 0;
    while( x < 10 )
    {
      if(x % 2 != 0){
        x++;
        continue;
      }

      System.out.println(x);
      x++;
    }
  }

  public static void doWithFor()
  {
    for(int x = 10; x <= 20; x = x + 1) {
      System.out.println("value of x : " + x );
      //System.out.print("\n");
    }
  }

  public static void doWithForAndContinue()
  {
    //Print SO_CHAN only!!
    for(int x = 10; x <= 20; x = x + 1)
    {
      if(x % 2 != 0){
        continue;
      }

      System.out.println("value of x : " + x );
    }
  }

  public static void doLuckyNumber7()
  {
    //Note: print cac chu so co tan cung bang chu so "7".
    for(int x = 15; x <= 100; x++)
    {
      if(x % 10 == 7){
        System.out.println(x);
      }
    }
  }

  public static int tinhGiaiThuaN(int N)
  {
    int nGiaiThua = 1;

    for(int i = 1; i <= N; i++){
      nGiaiThua = nGiaiThua * i;
    }

    return nGiaiThua;
  }
}

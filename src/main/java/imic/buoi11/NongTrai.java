package imic.buoi11;

public class NongTrai
{
  Object[] giaSuc = new Object[10];

  public NongTrai()
  {
    //How tong = 10..
    int soCongGa = 1;
    int soConCuu = 1;
    int soConDe = 1;
    int soConBo = 1;

    for(int i = 0; i < soCongGa; i ++){
      Ga conGa = new Ga();
      giaSuc[i] = conGa;
    }

  }
}

package imic.buoi10;

public class Bai02
{

  /**
   * Bai02.a: Tim UocSoLonNhat cua so nguyen duong N, ngoai tru chinh no!!!
   * Vi du: N = 6 -> UocSoLonNhat = 3
   */
  public static int timUocSoLonNhat(int n)
  {
    int uocSoLonNhat = 1;

    for(int i = 1; i < n; i++){
      if(n % i == 0) {
        System.out.println(i + " la uoc cua " + n);
        if(i > uocSoLonNhat){
          uocSoLonNhat = i;
        }
      }
    }

    return uocSoLonNhat;
  }


}

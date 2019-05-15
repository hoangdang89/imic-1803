package imic.buoi19;

public class OpenChrome
{
  public static void main(String[] args)
  {
    try {
      Process p = Runtime.getRuntime().exec("\"/Program Files (x86)/Google/Chrome/Application/chrome.exe\"");
      p.waitFor();
      System.out.println("Google Chrome launched!");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

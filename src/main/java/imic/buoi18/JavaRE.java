package imic.buoi18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRE
{

  public static void matchWordByRE()
  {
    // Create a Pattern object
    String pattern = "\\b[mM][a-zA-Z]+";
    Pattern regex = Pattern.compile(pattern);

    // Now create matcher objectmany.
    String line = "Line 22: To find m234 out how many groups are present in the expression, call the groupCount method on a matcher object. The groupCount method returns an int showing the number of capturing groups present in the matcher's pattern.\n" +
        "\tLine 36:    public static void main( String args[] ) {\n" +
        "\tLine 44:       // Now create matcher object.\n" +
        "\tLine 45:       Matcher m = r.matcher(line);\n" +
        "\tLine 51:          System.out.println(\"NO MATCH\");\n" +
        "\tLine 63: Here is the table listing down all the regular expression metacharacter syntax available in Java −";
    Matcher matcher = regex.matcher(line);

    int count = 0;
    while(matcher.find()) {
      count++;
      System.out.println("Found value: " + matcher.group(0) );
    }
  }

  public static void matchStringWithRE()
  {
    String myText = "import java.util.regex.Matcher";
    boolean result = myText.matches(".+Matcher.*");
    System.out.println(result);
  }

  public static void replaceStringWithRE()
  {
    String line = "Line 22: To find m234 out how many groups are present in the expression, call the groupCount method on a matcher object. The groupCount method returns an int showing the number of capturing groups present in the matcher's pattern.\n" +
        "\tLine 36:    public static void main( String args[] ) {\n" +
        "\tLine 44:       // Now create matcher object.\n" +
        "\tLine 45:       Matcher m = r.matcher(line);\n" +
        "\tLine 51:          System.out.println(\"NO MATCH\");\n" +
        "\tLine 63: Here is the table listing down all the regular expression metacharacter syntax available in Java −";

    //Replace all "Line xx" by "Hoang xxL"
    String newString = line.replaceAll("Line (\\d+): ", "Hoang $1L");
    System.out.println(newString);
  }

  public static void fillTheFormWithRE()
  {
    String myForm = "" +
        "\nName: <Ten asfasfwe>" +
        "\nDate: <Date werfwee>" +
        "\nMoney: <Money werwer>";


    Customer[] myCustomers = new Customer[3];

    String newForm = myForm.replaceAll(
        "\nName: .+" +
        "\nDate: .+" +
        "\nMoney: .+"
        , "\nName: Hoang Dang" +
        "\nDate: 10/05/2019" +
        "\nMoney: 100\\$");
    System.out.println(newForm);
  }
}

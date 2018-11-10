import java.io.*;
import java.util.Scanner;
public class SumString {
  
  public static void main (String[] args) throws FileNotFoundException{
    Boolean allowHex = false;
    Boolean useFile = false;
    String target = "";
    for (int i = 0; i < args.length; i++) {
      if (args[i].equals("-x")) {
        allowHex = true;
      }
      else if (args[i].equals("-f")) {
        useFile = true;
      }
      else {
        target = args[i];
      }
    }

    if (useFile) {
      File f = new File(target);
      Scanner s = new Scanner(f);
      target = "";
      while (s.hasNextLine()) {
        target += s.nextLine();
      }
    }

    System.out.println(sumStr(target, allowHex));
  }

  public static Long sumStr(String s, Boolean allowHex) {
    Long result = new Long(0);
    for (int i = 0; i < s.length(); i++) {
      int cur = (int)s.charAt(i);

      //ASCII values for 0 - 9
      if (cur >= 48 && cur <= 57) {
        result += cur - 48;
      }

      //ASCII values for hex a-f
      else if (allowHex && cur >= 97 && cur <= 102) {
        result += cur - 87;
      }
    }

    return result;
  }
}
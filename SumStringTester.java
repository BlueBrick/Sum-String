public class SumStringTester {
  
  public static void main (String [] args) {
    System.out.println("Testing: abc123, with hex values");
    Long result = SumString.sumStr("abc123", true);
    if (result != 39) {
      System.out.println("ERROR! Expected 39, actual value was " + result);
    }

    System.out.println("Testing: abc123, without hex values");
    result = SumString.sumStr("abc123", false);
    if (result != 6) {
      System.out.println("ERROR! Expected 6, actual value was " + result);
    }

    System.out.println("Testing: abc123, with hex values");
    result = SumString.sumStr("qq", true);
    if (result != 0) {
      System.out.println("ERROR! Expected 0, actual value was " + result);
    }

    System.out.println("Testing: ");
    result = SumString.sumStr("", false);
    if (result != 0) {
      System.out.println("ERROR! Expected 0, actual value was " + result);
    }

    System.out.println("Testing: aaaaaa, with hex values");
    result = SumString.sumStr("aaaaaa", true);
    if (result != 60) {
      System.out.println("ERROR! Expected 60, actual value was " + result);
    }

    System.out.println("Testing: 0123456789abcdefhijklmnopqrstuvwxyz, with hex values");
    result = SumString.sumStr("0123456789abcdefhijklmnopqrstuvwxyz", true);
    if (result != 120) {
      System.out.println("ERROR! Expected 120, actual value was " + result);
    }
  }
}
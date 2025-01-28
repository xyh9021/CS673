import java.util.Scanner;

public class Q2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.print("Please enter a string or 'q' to quit: ");
      String input = scanner.nextLine();
      if (input.equals("q")) {
        System.out.println("Exit!");
        break;
      }
      if (isPalindrome(input)) {
        System.out.println("The string is a palindrome.");
      } else {
        System.out.println("The string is not a palindrome.");
      }
    }
    scanner.close();
  }

  public static boolean isPalindrome(String str) {
    int i = 0, j = str.length() - 1;

    while (i < j) {
      if (str.charAt(i) != str.charAt(j)) {
        return false;
      }
      i++;
      j--;
    }
    return true;
  }
}

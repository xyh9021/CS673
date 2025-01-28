import java.util.Scanner;

public class Q5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please Enter a year: ");
    int year = scanner.nextInt();
    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
      System.out.println("This is a leap year.");
    } else {
      System.out.println("This is not a leap year.");
    }
    scanner.close();
  }
}

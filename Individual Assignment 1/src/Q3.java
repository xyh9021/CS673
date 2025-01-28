import java.util.*;

public class Q3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please Enter two lists in format [a,b,c],[1,2,3]: ");
    String input = scanner.nextLine().trim();
    String[] parts = input.split("\\s*,\\s*(?=\\[)");
    if (parts.length != 2) {
      System.out.println("Error: Invalid input!");
      return;
    }
    String listPattern = "\\[\\s*([a-zA-Z0-9]+\\s*,\\s*)*[a-zA-Z0-9]+\\s*\\]";
    if (!parts[0].matches(listPattern) || !parts[1].matches(listPattern)) {
      System.out.println("Error: Invalid input!");
      return;
    }
    String[] input1 = parts[0].substring(1, parts[0].length() - 1).split("\\s*,\\s*");
    String[] input2 = parts[1].substring(1, parts[1].length() - 1).split("\\s*,\\s*");

    System.out.print("[");
    int i = 0;
    for(; i < input1.length - 1; ++i){
      System.out.print(input1[i] + "," + input2[i]);
      System.out.print(",");
    }
    System.out.print(input1[i] + "," + input2[i]);
    System.out.println("]");
  }
}

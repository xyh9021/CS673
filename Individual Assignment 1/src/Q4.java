import java.math.BigInteger;

public class Q4 {
  public static void main(String[] args) {
    BigInteger i = BigInteger.ONE;
    BigInteger j = BigInteger.ONE;
    System.out.println("F(1): " + 1);
    System.out.println("F(2): " + 1);
    for (int time = 3; time <= 100; ++time) {
      BigInteger tmp = i.add(j);
      System.out.println("F(" + time + "): " + i + "+" + j + "=" + tmp);
      i = j;
      j = tmp;
    }
  }
}

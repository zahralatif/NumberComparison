public class NumberComparison {

  public static void main(String[] args) {
    int A = 20;
    int B = 10;
    int C = 30;
    int D = 40;

    int sumAB = A + B;
    int sumCD = C + D;

    if (sumAB < sumCD) {
      System.out.println(
        "The sum of 20 and 10 is less than the sum of 30 and 40."
      );
    } else {
      System.out.println(
        "The sum of 20 and 10 is not less than the sum of 30 and 40."
      );
    }
  }
}

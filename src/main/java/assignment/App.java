/*
 * This Java source file was generated by the Gradle 'init' task.
 */

package assignment;

public class App {
  public String getGreeting() {
    return "Hello world.";
  }

  public String challenge1() {
    /*
     remove unnecessary parenthesis from each statement
     (a + b) - (2 * c)
     (2 * x) / (y * z)
     (x + 3) * (n % p)
     (-a) / (-(b + c))
     (x / y) % (-z))
     x / (y % (-z))
    */

    String answer = "";
    answer += "(a + b) - (2 * c)";
    answer += "(2 * x) / (y * z)";
    answer += "(x + 3) * (n % p)";
    answer += "(-a) / (-(b + c))";
    answer += "(x / y) % (-z))";
    answer += "x / (y % (-z))";

    return answer;
  }

  public String challenge2() {
    byte b1 = 10, b2 = 20;
    short p = 200;
    int n = 500;
    long q = 100;
    float x = 2.5f;
    double y = 5.25;

    String answer = "";

    // give type and value of the following expressions
    // b1 + b2
    answer += "value:, type:";

    // p + b1
    answer += "value:, type:";

    // b1 * b2
    answer += "value:, type:";

    // q + p * (b1 + b2)
    answer += "value:, type:";

    // x + q * n
    answer += "value:, type:";

    // b1 * q / x
    answer += "value:, type:";

    // b1 * q * 2. / x
    answer += "value:, type:";

    // b1 * q * 2.f / x
    answer += "value:, type:";

    return answer;
  }

  public String challenge3() {
    // switch values a and b
    int a = 1, b = 2;

    // do NOT touch this line
    return Integer.toString(a) + Integer.toString(b);
  }

  public String challenge4() {
    char c = 60, ce = 'e', cg = 'g';
    byte b = 10;

    String answer = "";

    // give type and value of the following expressions
    // c + 1
    answer += "value:, type:";

    // 2 * c
    answer += "value:, type:";

    // cg - ce
    answer += "value:, type:";

    // b * c
    answer += "value:, type:";

    return answer;
  }

  public String challenge5() {
    int i=10, j=5;
    String answer = "";

    // give the result of the relational operator and i and j values
    // like i  == 20 -> true 10 5
    // i < 5 && j++ < 10
    answer += "";

    // i < 5 & j++ < 10
    answer += "";

    // i < 15 & j++ < 10
    answer += "";

    // i < 15 || j++ < 10
    answer += "";

    return answer;
  }

  public String challenge6() {
    byte b;
    short p;
    int n;
    long q;
    final int N = 10;
    float x;
    double y;

    String answer = "";

    // are the following expression correct? answer true or false
    // b = n
    answer += "";

    // b = 25
    answer += "";

    // b = 500
    answer += "";

    // x = 2 * q
    answer += "";

    // y = b * b
    answer += "";

    // p = b * b
    answer += "";

    // b = b + 5
    answer += "";

    // p = 5 * N - 3;
    answer += "";

    return answer;
  }

  public String challenge7() {
    int i, j, n;

    String answer = "";

    // give the value asked for each instruction
    i = 0;
    n = i++;
    answer += "i= n=";

    i = 10;
    n = ++i;
    answer += "i= n=";

    i = 20;
    j = 5;
    n = i++ * ++j;
    answer += "i= j= n=";

    i = 15;
    n = i += 3;
    answer += "i= n=";

    i = 3;
    j = 5;
    n = i *= --j;
    answer += "i= j= n=";

    return answer;
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());
    System.out.println(new App().challenge7());
  }
}

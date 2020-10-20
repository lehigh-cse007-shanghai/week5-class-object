/*
 * This Java source file was generated by the Gradle 'init' task.
 */

package assignment;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class AppTest {
  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private final PrintStream originalOut = System.out;

  @Before
  public void setUpStreams() {
    System.setOut(new PrintStream(outContent));
  }

  @After
  public void restoreStreams() {
    System.setOut(originalOut);
  }

  @Test
  public void test1(){
    Point p1 = new Point();
    Point p2 = new Point();
    Point p3 = new Point();
    p1.x = 1;
    p1.y = 2;
    p2.x = 3;
    p2.y = 4;
    p3.x = 5;
    p3.y = 6;
    Triangle triangle = new Triangle();
    triangle.p1 = p1;
    triangle.p2 = p2;
    triangle.p3 = p3;
    triangle.sortPoints();
    triangle.deriveSegmentsFromPoints();

    String result = "";
    result += triangle.p1.whoAmI();
    result += triangle.p2.whoAmI();
    result += triangle.p3.whoAmI();
    result += triangle.s1.whoAmI();
    result += triangle.s1.p1.whoAmI();
    result += triangle.s1.p2.whoAmI();
    result += triangle.s2.whoAmI();
    result += triangle.s2.p1.whoAmI();
    result += triangle.s2.p2.whoAmI();
    result += triangle.s3.whoAmI();
    result += triangle.s3.p1.whoAmI();
    result += triangle.s3.p2.whoAmI();
    result += triangle.whoAmI();

    String correct_answer = "Point(1, 2)Point(3, 4)Point(5, 6)Segment(Point(1, 2), Point(3, 4))Point(1, 2)Point(3, 4)Segment(Point(3, 4), Point(5, 6))Point(3, 4)Point(5, 6)Segment(Point(1, 2), Point(5, 6))Point(1, 2)Point(5, 6)Triangle(Segment(Point(1, 2), Point(3, 4)), Segment(Point(3, 4), Point(5, 6)), Segment(Point(1, 2), Point(5, 6)))";

    assertEquals(result, correct_answer);
  }


  @Test
  public void test2(){
    Point p1 = new Point();
    Point p2 = new Point();
    Point p3 = new Point();
    p1.x = 3;
    p1.y = 4;
    p2.x = 1;
    p2.y = 2;
    p3.x = 5;
    p3.y = 6;
    Triangle triangle = new Triangle();
    triangle.p1 = p1;
    triangle.p2 = p2;
    triangle.p3 = p3;
    triangle.sortPoints();
    triangle.deriveSegmentsFromPoints();

    String result = "";
    result += triangle.p1.whoAmI();
    result += triangle.p2.whoAmI();
    result += triangle.p3.whoAmI();
    result += triangle.s1.whoAmI();
    result += triangle.s1.p1.whoAmI();
    result += triangle.s1.p2.whoAmI();
    result += triangle.s2.whoAmI();
    result += triangle.s2.p1.whoAmI();
    result += triangle.s2.p2.whoAmI();
    result += triangle.s3.whoAmI();
    result += triangle.s3.p1.whoAmI();
    result += triangle.s3.p2.whoAmI();
    result += triangle.whoAmI();

    String correct_answer = "Point(1, 2)Point(3, 4)Point(5, 6)Segment(Point(1, 2), Point(3, 4))Point(1, 2)Point(3, 4)Segment(Point(3, 4), Point(5, 6))Point(3, 4)Point(5, 6)Segment(Point(1, 2), Point(5, 6))Point(1, 2)Point(5, 6)Triangle(Segment(Point(1, 2), Point(3, 4)), Segment(Point(3, 4), Point(5, 6)), Segment(Point(1, 2), Point(5, 6)))";

    assertEquals(result, correct_answer);
  }

  @Test
  public void test3(){
    Point p1 = new Point();
    Point p2 = new Point();
    Point p3 = new Point();
    p1.x = 3;
    p1.y = 4;
    p2.x = 5;
    p2.y = 6;
    p3.x = 1;
    p3.y = 2;
    Triangle triangle = new Triangle();
    triangle.p1 = p1;
    triangle.p2 = p2;
    triangle.p3 = p3;
    triangle.sortPoints();
    triangle.deriveSegmentsFromPoints();

    String result = "";
    result += triangle.p1.whoAmI();
    result += triangle.p2.whoAmI();
    result += triangle.p3.whoAmI();
    result += triangle.s1.whoAmI();
    result += triangle.s1.p1.whoAmI();
    result += triangle.s1.p2.whoAmI();
    result += triangle.s2.whoAmI();
    result += triangle.s2.p1.whoAmI();
    result += triangle.s2.p2.whoAmI();
    result += triangle.s3.whoAmI();
    result += triangle.s3.p1.whoAmI();
    result += triangle.s3.p2.whoAmI();
    result += triangle.whoAmI();

    String correct_answer = "Point(1, 2)Point(3, 4)Point(5, 6)Segment(Point(1, 2), Point(3, 4))Point(1, 2)Point(3, 4)Segment(Point(3, 4), Point(5, 6))Point(3, 4)Point(5, 6)Segment(Point(1, 2), Point(5, 6))Point(1, 2)Point(5, 6)Triangle(Segment(Point(1, 2), Point(3, 4)), Segment(Point(3, 4), Point(5, 6)), Segment(Point(1, 2), Point(5, 6)))";

    assertEquals(result, correct_answer);
  }

}

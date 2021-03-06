/*
 * This Java source file was generated by the Gradle 'init' task.
 */

package assignment;

public class App {
  public static void main(String[] args) {
    // Make the necessary and meaningful modifications on the
    // Point, Segment and Triangle classes so the the code would run correctly,
    // both from a code point of view, and from a mathematical point of view.
    Point p1 = new Point();
    Point p2 = new Point();
    Point p3 = new Point();
    p1.x = 0;
    p1.y = 4;
    p2.x = 3;
    p2.y = 0;
    p3.x = 0;
    p3.y = 0;
    Triangle triangle = new Triangle();
    triangle.sortPoints();
    triangle.deriveSegmentsFromPoints();

    /* Those lines should output:
      Point(0, 0)
      Point(3, 0)
      Point(0, 4)
      Segment(Point(0, 0), Point(3, 0))
      Point(0, 0)
      Point(3, 0)
      Segment(Point(3, 0), Point(0, 4))
      Point(3, 0)
      Point(0, 4)
      Segment(Point(0, 0), Point(0, 4))
      Point(0, 0)
      Point(0, 4)
      Triangle(Segment(Point(0, 0), Point(3, 0)), Segment(Point(3, 0), Point(0, 4)), Segment(Point(0, 0), Point(0, 4)))
      true
    */
    System.out.println(triangle.p1.whoAmI() );
    System.out.println(triangle.p2.whoAmI() );
    System.out.println(triangle.p3.whoAmI() );
    System.out.println(triangle.s1.whoAmI() );
    System.out.println(triangle.s1.p1.whoAmI() );
    System.out.println(triangle.s1.p2.whoAmI() );
    System.out.println(triangle.s2.whoAmI() );
    System.out.println(triangle.s2.p1.whoAmI() );
    System.out.println(triangle.s2.p2.whoAmI() );
    System.out.println(triangle.s3.whoAmI() );
    System.out.println(triangle.s3.p1.whoAmI() );
    System.out.println(triangle.s3.p2.whoAmI() );
    System.out.println(triangle.whoAmI() );
    System.out.println(triangle.isRightTriangle() );

  }
}

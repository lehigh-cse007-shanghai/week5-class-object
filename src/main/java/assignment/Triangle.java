package assignment;

public class Triangle {
    // write your code here.
    // add attributes (p1, p2, p3) that represent the three points of a triangle.
    // write your code here.
    // add attributes (s1, s2, s3) that represent the three segments of a triangle.


    // sort the the points of a triangle, according to its distance to point (0, 0).
    // p1 will be the nearest point
    // p3 will be the most far away point
    // In this way, p1(1, 2) + p2(3, 4) + p3(5, 8) will be the same triangle as p1(3, 4) + p2(5, 8) + p3(1, 2)
    // But both triangles will be represented as: p1(1, 2) + p2(3, 4) + p3(5, 8)
    void sortPoints()
    {
        // write your code here.
    }

    // s1 will be: (p1, p2)
    // s2 will be: (p2, p3)
    // s3 will be: (p1, p3)
    void deriveSegmentsFromPoints()
    {
        // write your code here.
    }

    // Determine if a triangle is a right one. 判断是否为直角三角形
    // This is the ONLY advanced task of this assignment.
    // This function won't be tested. Please share your code in the WeChat group and
    // have a good discussion about it.
    // We could have many different manners of implementing it.
    boolean isRightTriangle()
    {
        // write your code here.
        return false;
    }

    String whoAmI()
    {
        return ""; // modify the code, return something else here.
    }

}

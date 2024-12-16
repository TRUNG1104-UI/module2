
package ss6_bai_tai_to_java.circle_and_cylinder;

public class Run {
    public static void main(String[] args) {
        Circle circle = new Circle(4,"Red");
        Cylinder cylinder = new Cylinder(circle.getRadius(), circle.getColor(), 6);
        System.out.println(circle);
        System.out.println(cylinder);
    }
}

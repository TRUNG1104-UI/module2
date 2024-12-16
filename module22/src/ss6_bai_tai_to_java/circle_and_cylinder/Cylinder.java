
package ss6_bai_tai_to_java.circle_and_cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color, double hieght) {
        super(radius, color);
        this.height = hieght;
    }

    public Cylinder() {
        super();
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double Volume() {
        return getArena()*height;
    }
    public String toString() {
        return "Cylinder [radius=" + getRadius() + ", color=" + getColor() + ", hieght="+ height + ", Volume=" + Volume() + "]";
    }
}

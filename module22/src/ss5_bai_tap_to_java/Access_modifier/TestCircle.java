package ss5_bai_tap_to_java.Access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circler = new Circle();
        System.out.println("=== Test Circle before===");
        System.out.println(circler.getRadius());
        System.out.println(circler.getColor());

        System.out.println("=== Test Circle after===");
        circler.setRadius(10);
        circler.setColor("blue");
        System.out.println(circler.getRadius());
        System.out.println(circler.getColor());
    }
}
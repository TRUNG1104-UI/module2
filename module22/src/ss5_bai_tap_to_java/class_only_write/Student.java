package ss5_bai_tap_to_java.class_only_write;

public class Student {
    private String name = "John";
    private String classes = "C02";

    public Student() {
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public String getName() {
        return name;
    }
}
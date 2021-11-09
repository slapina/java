public class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.getArea();
        System.out.println(circle.toString());

        Cylinder cylinder = new Cylinder(circle.getRadius(), 10, circle.getColour());
        cylinder.getArea();
        cylinder.getVolume();
        System.out.println(cylinder.toString());
    }
}

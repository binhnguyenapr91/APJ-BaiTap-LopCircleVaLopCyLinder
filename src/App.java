public class App {
    public static void main(String[] args) {
        Circle circle = new Circle(4,"red");
        System.out.println("Radius of Circle: "+circle.getRadius());
        System.out.println("Color of Circle: "+circle.getColor());
        System.out.println("Area of Circle: "+circle.getArea());
        Cylinder cylinder = new Cylinder(circle.getRadius(),circle.getColor(),4);
        System.out.println("Radius of Cylinder: "+cylinder.getRadius());
        System.out.println("Color of Cylinder:" +cylinder.getColor());
        System.out.println("Volume: "+cylinder.getVolume());
    }
}

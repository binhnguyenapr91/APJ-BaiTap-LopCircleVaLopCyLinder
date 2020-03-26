public class Circle {
    private double radius;
    private  String color;

    double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    String getColor(){
        return this.color;
    }

    public Circle(){

    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    double getArea(){
        return Math.pow(radius,2)*Math.PI;
    }
}

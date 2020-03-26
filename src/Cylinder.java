public class Cylinder  extends Circle{
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    Cylinder(){

    }
    Cylinder(double radius, String color,double height){
        super(radius,color);
        this.height = height;

    }

    double getVolume (){
        return super.getArea()*this.height;
    }
}

public class Circle {
    protected double radius = 2;
    protected String colour = "green";

    public Circle(){}

    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String colour){
        this.radius = radius;
        this.colour = colour;
    }
    public double getRadius(){
        return radius;
    }
    public String getColour(){
        return colour;
    }
    public double getArea(){
        double powValue = 2;
        return Math.PI * Math.pow(radius, powValue);
    }

    public String toString(){
        String circleParameters;
        circleParameters = "radius= " + radius + ", colour is  " + colour + ", area= " + getArea();
        return circleParameters;
    }
}

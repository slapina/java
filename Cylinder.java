public class Cylinder extends Circle{
    private double height;

    public Cylinder (double radius){
    }
    public Cylinder (double radius, double height){
        this.height = height;
    }
    public Cylinder (double radius, double height, String colour){
        this.radius = getRadius();
        this.height = height;
        this.colour = getColour();
    }

    public double getArea() {
        return 2 * Math.PI * getRadius() * height + 2 * super.getArea();
    }
    public double getVolume(){
        return super.getArea() * height;
    }
    public String toString(){
        String cylinderParameters;
        cylinderParameters = "radius= " + radius + ", height= " + height + ", colour is " + colour
                + ", area= " + getArea() + ", volume= " + getVolume();
        return cylinderParameters;
    }
}

package macavinta.gianninah.revisedexercises.ex8revised;

/**
 * Created by IE on 8/1/2016.
 */
public class Circle extends Shape implements Perimeter{

    public double radius;

    public Circle(double radius){
        shapeType = "CIRCLE";
        this.radius=radius;
    }

    public double calcPerimeter(){

        return 3.14*radius*radius;
    }

    public double calcArea(){
        return 2*3.14*radius;
    }

    public Circle (double radius, double pi){
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }
}

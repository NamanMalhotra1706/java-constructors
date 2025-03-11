public class Circle {
    double radius;

    Circle(){
        System.out.println("default constructor called");
        radius = 5;
    }

    Circle(double radius){
        System.out.println("parametrized constructor called");
        this.radius = radius;
    }
    public static void main(String[] args) {
        Circle circle = new Circle();

        //Circle c2 = new Circle(4.5);
    }
}

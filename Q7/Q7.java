class Shape {

    void area() {
    System.out.println("Area not defined");
    }

}
class Circle extends Shape {

    double radius;

    Circle(double radius) {
    this.radius = radius;
}

@Override
void area() {
    System.out.println( 22 / 7 * radius * radius );
    }
}
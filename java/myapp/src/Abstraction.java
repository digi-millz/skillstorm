public class Abstraction {
    public static void main(String[] args) {
        //cannot create object of abstract class
        // Shape shape = new Shape();
    }
}
// abstract class
abstract class Shape {
    // abstract variable
    int var;
    // abstract method
    abstract double area();
}
// concrete class
class Triangle extends Shape {
    double area() {
        return 0;
    }
}
// concrete class
class Rectangle extends Shape {
    double area() {
        return 10;
    }
}
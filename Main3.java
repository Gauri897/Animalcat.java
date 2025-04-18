class Shape {
    double getArea() {
        return 0.0;
    }
}

class Rectangle extends Shape {
    double length = 5, width = 3;

    double getArea() {
        return length * width;
    }
}

public class Main3 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        System.out.println("Area of Rectangle: " + rect.getArea());
    }
}

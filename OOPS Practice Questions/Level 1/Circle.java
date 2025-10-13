class Circle {
    double radius;


    Circle(double r) {
        radius = r;
    }

    
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area of Circle: " + calculateArea());
        System.out.println("Circumference of Circle: " + calculateCircumference());
    }

    public static void main(String[] args) {
        Circle c = new Circle(7.5);
        c.display();
    }
}

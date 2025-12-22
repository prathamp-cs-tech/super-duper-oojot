abstract class Shape {
    int x, y;

    abstract void printArea();
}

class Rectangle extends Shape {
    Rectangle(int l, int b) {
        x = l;
        y = b;
    }

    void printArea() {
        System.out.println("Area of Rectangle = " + (x * y));
    }
}

class Triangle extends Shape {
    Triangle(int b, int h) {
        x = b;
        y = h;
    }

    void printArea() {
        System.out.println("Area of Triangle = " + (0.5 * x * y));
    }
}

class Circle extends Shape {
    Circle(int r) {
        x = r;
    }

    void printArea() {
        System.out.println("Area of Circle = " + (3.14 * x * x));
    }
}

class Demo {
    public static void main(String[] args) {
        Shape r = new Rectangle(10, 5);
        Shape t = new Triangle(8, 6);
        Shape c = new Circle(7);

        r.printArea();
        t.printArea();
        c.printArea();
    }
}

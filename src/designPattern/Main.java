package designPattern;

// Define the Shape interface
interface Shape {
    void draw();
}

// Define concrete shape classes
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

// Define the ShapeFactory interface
interface ShapeFactory {
    Shape createShape(String shapeType);

    Shape createShape();
}

// Define a concrete ShapeFactory implementation
class SimpleShapeFactory implements ShapeFactory {
    @Override
    public Shape createShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("square")) {
            return new Square();
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else {
            throw new IllegalArgumentException("Invalid shape type");
        }
    }

    @Override
    public Shape createShape() {
        return null;
    }
}

// Usage example
public class Main {
    public static void main(String[] args) {
        // Create a factory
        ShapeFactory factory = new SimpleShapeFactory();

        // Create shapes using the factory
        Shape circle = factory.createShape("circle");
        circle.draw();

        Shape square = factory.createShape("square");
        square.draw();

        Shape rectangle = factory.createShape("rectangle");
        rectangle.draw();
    }
}


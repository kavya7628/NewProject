// Rectangle class
class Rectangle {
    // Instance variables for the dimensions
    private double length;
    private double width;

    // Constructor to initialize the dimensions
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return length * width;
    }

    // Getter methods for length and width (optional)
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}

// Runner class to test the Rectangle class
class RectangleRunner {
    public static void main(String[] args) {
        // Create an instance of Rectangle
        Rectangle rectangle = new Rectangle(5.0, 3.0);

        // Calculate the area of the rectangle
        double area = rectangle.calculateArea();

        // Print the area of the rectangle
        System.out.println("The area of the rectangle is: " + area);
    }
}

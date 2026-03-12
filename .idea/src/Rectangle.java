public class Rectangle implements Shape {
    double width;
    double Height;

    public Rectangle(double width, double Height) {
        this.width = width;
        this.Height = Height;
    }

    @Override
    public double getArea() {
        return width * Height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + Height);
    }

    @Override
    public String getDescription() {
        return "Rectangle " + width + " x " + Height;
    }
}
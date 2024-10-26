public class Rectangle extends GeometricFigure{
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    double area(){
        return sideA + sideB;
    }

    double perimeter(){
        return 2 * (sideA + sideB);
    }
}

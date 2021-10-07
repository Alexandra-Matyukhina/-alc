public class GeometricFlatFigure {
    private double sideA;
    private double sideB;
    private double sideC;
    private double sideD;
    private double sideE;
    private double sideF;
    private double radius;
    private double diameter;
    private double circleLength;
    private double perimeter;
    private double square;
    private double minSemiAxis;
    private double maxSemiAxis;
    private double minAxis;
    private double maxAxis;
    private double diagonal1;
    private double diagonal2;
    private String name;

    public GeometricFlatFigure() {
    }

//    public GeometricFlatFigure(double sideA, double sideB, double sideC, double sideD, double diagonal1, double diagonal2) {
//        this.sideA = sideA;
//        this.sideB = sideB;
//        this.sideC = sideC;
//        this.sideD = sideD;
//        this.diagonal1 = diagonal1;
//        this.diagonal2 = diagonal2;
//    }

    public GeometricFlatFigure(double sideA, double sideB, double sideC, double sideD, double sideE, double sideF, String name) {
        this.setSideA(sideA);
        this.setSideB(sideB);
        this.setSideC(sideC);
        this.setSideD(sideD);
        this.setSideE(sideE);
        this.setSideF(sideF);
        this.setName(name);
    }

    //    public GeometricFlatFigure(double sideA, double sideB, double sideC, double sideD, double sideE, double sideF, double perimeter, double square, String name) {
//        this.sideA = sideA;
//        this.sideB = sideB;
//        this.sideC = sideC;
//        this.sideD = sideD;
//        this.sideE = sideE;
//        this.sideF = sideF;
//        this.perimeter = perimeter;
//        this.square = square;
//        this.name = name;
//    }
//
    public GeometricFlatFigure(double radius, double diameter, double circleLength, double square, String name) {
        this.setRadius(radius);
        this.setDiameter(diameter);
        this.setCircleLength(circleLength);
        this.setSquare(square);
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double getSideD() {
        return sideD;
    }

    public void setSideD(double sideD) {
        this.sideD = sideD;
    }

    public double getSideE() {
        return sideE;
    }

    public void setSideE(double sideE) {
        this.sideE = sideE;
    }

    public double getSideF() {
        return sideF;
    }

    public void setSideF(double sideF) {
        this.sideF = sideF;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getCircleLength() {
        return circleLength;
    }

    public void setCircleLength(double circleLength) {
        this.circleLength = circleLength;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public double getMinSemiAxis() {
        return minSemiAxis;
    }

    public void setMinSemiAxis(double minSemiAxis) {
        this.minSemiAxis = minSemiAxis;
    }

    public double getMaxSemiAxis() {
        return maxSemiAxis;
    }

    public void setMaxSemiAxis(double maxSemiAxis) {
        this.maxSemiAxis = maxSemiAxis;
    }

    public double getMinAxis() {
        return minAxis;
    }

    public void setMinAxis(double minAxis) {
        this.minAxis = minAxis;
    }

    public double getMaxAxis() {
        return maxAxis;
    }

    public void setMaxAxis(double maxAxis) {
        this.maxAxis = maxAxis;
    }

    public double getDiagonal1() {
        return diagonal1;
    }

    public void setDiagonal1(double diagonal1) {
        this.diagonal1 = diagonal1;
    }

    public double getDeagonal2() {
        return diagonal2;
    }

    public void setDeagonal2(double deagonal2) {
        this.diagonal2 = deagonal2;
    }
}

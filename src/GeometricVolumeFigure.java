public class GeometricVolumeFigure {

    private double edgeA;
    private double edgeB;
    private double edgeC;
    private double faceA;
    private double faceB;
    private double top;
    private double diagonal;
    private double volume;
    private double square;
    private double height;
    private String name;

    public GeometricVolumeFigure(double edgeA, double edgeB, double edgeC, double faceA, double faceB, double height, String name) {
        this.setEdgeA(edgeA);
        this.setEdgeB(edgeB);
        this.setEdgeC(edgeC);
        this.setFaceA(faceA);
        this.setFaceB(faceB);
        this.setHeight(height);
        this.setName(name);
    }

    public GeometricVolumeFigure() {
    }

    public GeometricVolumeFigure(double diagonal, double volume, double square, String name) {
        this.diagonal = diagonal;
        this.volume = volume;
        this.square = square;
        this.name = name;
    }

    public double getEdgeA() {
        return edgeA;
    }

    public void setEdgeA(double edgeA) {
        this.edgeA = edgeA;
    }

    public double getEdgeB() {
        return edgeB;
    }

    public void setEdgeB(double edgeB) {
        this.edgeB = edgeB;
    }

    public double getEdgeC() {
        return edgeC;
    }

    public void setEdgeC(double edgeC) {
        this.edgeC = edgeC;
    }

    public double getFaceA() {
        return faceA;
    }

    public void setFaceA(double faceA) {
        this.faceA = faceA;
    }

    public double getFaceB() {
        return faceB;
    }

    public void setFaceB(double faceB) {
        this.faceB = faceB;
    }

    public double getTop() {
        return top;
    }

    public void setTop(double top) {
        this.top = top;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}

public class Calculation {

    GeometricFlatFigure figure;
    Print print = new Print();
    GeometricVolumeFigure figureV;
    Number number;

    double p;
    double s;
    double v;

    //    Вычисление периметра плоских геометрических фигур и длины окружности при помощи условного оператора if,
//    который проводит выборку по стринговой переменной name методом contains.
    public double findPerimeter(String name) {

        if (name.contains("triangle")) {
            p = figure.getSideA() + figure.getSideB() + figure.getSideC();
        }
        if (name.contains("rectangle")) {
            p = (figure.getSideA() + figure.getSideB()) * 2;
        }
        if (name.contains("circle")) {

            if (figure.getDiameter() != 0) {
                p = figure.getDiameter() * Math.PI;
            }
            if (figure.getRadius() != 0) {
                p = (2 * figure.getRadius()) * Math.PI;
            }
        } else if (name.contains("diamond")) {
            p = figure.getSideA() * 4;
        } else if (name.contains("ellipse")) {
            double a = figure.getMaxSemiAxis();
            double b = figure.getMinSemiAxis();
            double c = figure.getMaxAxis() / 2;
            double d = figure.getMinAxis() / 2;
            if (a != 0 && b != 0) {
                p = 4 * (Math.PI * a * b + (a - b) * (a - b)) / (a + b);
            }
            if (c != 0 && d != 0) {
                p = 4 * (Math.PI * c * d + (c - d) * (c - d)) / (c + d);
            }
        } else {
            p = figure.getSideA() + figure.getSideB() + figure.getSideC() + figure.getSideD() + figure.getSideE() + figure.getSideF();
        }

        return p;
    }

    //    Вычисление площади плоских геометрических фигур при помощи условного оператора if,
//    который проводит выборку по стринговой переменной name методом contains.
    public double findSquare(String name) {

        if (name.contains("triangle")) {
            p = findPerimeter("triangle");
            double sp = p / 2;
            s = Math.sqrt(sp * (sp - figure.getSideA()) * (sp - figure.getSideB()) * (sp - figure.getSideC()));
        } else if (name.contains("rectangle") || name.contains("square")) {
            s = figure.getSideA() * figure.getSideB();
        } else if (name.contains("circle")) {
            s = Math.PI * (figure.getRadius() * figure.getRadius());
        } else if (name.contains("diamond")) {
            s = (figure.getDiagonal1() * figure.getDeagonal2()) / 2;
        } else if (name.contains("ellipse")) {
            if (figure.getMaxSemiAxis() != 0 && figure.getMinSemiAxis() != 0) {
                s = Math.PI * figure.getMaxSemiAxis() * figure.getMinSemiAxis();
            }
            if (figure.getMaxAxis() != 0 && figure.getMinAxis() != 0) {
                s = (Math.PI * figure.getMaxAxis() * figure.getMinAxis()) / 4;
            }
        } else {
            print.prString("Данный раздел находится в разработке.", false);
        }
        return s;
    }

    //    Вычисление объема объемных геометрических фигур при помощи условного оператора if,
//    который проводит выборку по стринговой переменной name методом contains.
    public double findVolume(String name) {

        if (name.contains("cube")) {
            int degree = 3;
            v = Math.pow(figureV.getEdgeA(), degree);
        } else if (name.contains("parallelepiped")) {
            if (figureV.getSquare() == 0) {
                v = figureV.getEdgeA() * figureV.getEdgeB() * figureV.getEdgeC();
            }
            if (figureV.getSquare() != 0 && figureV.getHeight() != 0) {
                v = figureV.getSquare() * figureV.getHeight();
            }
        } else {
            p = 0;
            print.prString("Данный раздел дополняется, приносим свои извинения. ", false);
        }


        return v;
    }

    //    Вычисление площади поверхности объемных геометрических фигур при помощи условного оператора if,
//    который проводит выборку по стринговой переменной name методом contains.
    public double findSurfaceSquare(String name) {
        if (name.contains("cube")) {
            s = 6 * (figureV.getHeight() * figureV.getHeight());
        } else if (name.contains("parallelepiped")) {
            s = 2 * ((figureV.getEdgeA() * figureV.getEdgeB()) + (figureV.getEdgeB() * figureV.getEdgeC()) + (figureV.getEdgeA() * figureV.getEdgeC()));
        } else {
            print.prString("Данный раздел дополняется, приносим свои извинения. ", false);
        }
        return s;
    }

    //    Вычисление среднего арифметического четырех чисел.
    public double findAvg(double a, double b, double c, double d) {
        double avg;
        double sum = 0;
        int j = 0;
        double[] num = {number.getA(), number.getB(), number.getC(), number.getD()};
//        Arrays.stream(num).filter(x -> x != 0).toArray();
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 0) {
                continue;
            }
            if (num[i] != 0) {
                j++;
            }
            sum += num[i];
        }
        avg = sum / j;
        return avg;
    }

    //    Вычисление среднего геометрического 4 чисел.
    public double findMean(double a, double b, double c, double d) {
        double[] num = {number.getA(), number.getB(), number.getC(), number.getD()};
        int j = 0;
        double logoSum = 0;
        double halfResult = 0;
        double mean;

        for (int i = 0; i < num.length; i++) {
            if (num[i] >= 0) {
                if (num[i] == 0) {
                    continue;
                }
                if (num[i] != 0) {
                    j++;
                }
            } else {
                print.prString("Данная операция с отрицательными числами не допустима", true);
            }
            logoSum += Math.log10(num[i]);
            halfResult = logoSum / j;
        }
        return mean = Math.pow(10, halfResult);
    }
}

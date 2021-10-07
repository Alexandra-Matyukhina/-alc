import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StartProgramme {
    public static void main(String[] args) throws IOException {

        Scan scan = new Scan();
        Print print = new Print();

        while (true) {
            print.prString("Выберите, пожалуйста, следующие варианты для расчета: ", true);
            print.prString("Найти периметр плоской фигуры - 1" + "\n" +
                    "Найти периметр и площадь квадрата - 2" + "\n" +
                    "Найти площадь и периметр прямоугольника - 3" + "\n" +
                    "Найти длину окружности по радиусу или диаметру - 4" + "\n" +
                    "Найти объем объемной геометрической фигуры - 5 " + "\n" +
                    "Найти объем и площадь поверхности куба - 6" + "\n" +
                    "Найти объем и площадь поверхности параллелепипеда - 7" + "\n" +
                    "Найти длину окружности и площадь по радиусу или диаметру - 8" + "\n" +
                    "Найти среднее арифметическое 2-4 чисел - 9" + "\n" +
                    "Найти среднее геометрическое 2-4 чисел -10" + "\n" +
                    "НАЗВАНИЯ ВСЕХ ФИГУР ВВОДИТЬ СТРОГО НА АНГЛИЙСКОМ ЯЗЫКЕ:" + "\n" +
                    "круг - circle, треугольник - triangle, прямоугольник - rectangle, etc." + "\n" +
                    "ВСЕ ПАРАМЕТРЫ ВВОДИТЬ ЧЕРЕЗ ПРОБЕЛ, ДРОБНАЯ ЧАСТЬ ЧИСЛА ОТДЕЛЯЕТСЯ ЗАПЯТОЙ", true);

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(reader.readLine());

            choice(a);
        }
    }

        public static void choice(int a){

        Scan scan = new Scan();
        Print print = new Print();
        Calculation calc = new Calculation();

        switch(a) {
            case 1:
            print.prString("Введите, пожалуйста, данные геометрической фигуры по маске: - шесть сторон и название (неизвестные параметры обозначать = 0): ", true);
            GeometricFlatFigure figure1 = new GeometricFlatFigure(scan.enterNumber(), scan.enterNumber(), scan.enterNumber(), scan.enterNumber(), scan.enterNumber(), scan.enterNumber(), scan.enterLine());
            calc.figure = figure1;
            print.prString("Периметр " + figure1.getName() + " равен: ", false);
            print.prNumber(calc.findPerimeter(figure1.getName()), true);
            break;

            case 2:
//        Задачи 1, 2 (Дана сторона квадрата, найти его периметр и площадь).
            print.prString("Введите, пожалуйста, данные квадрата по маске: - шесть сторон и название (неизвестные параметры обозначать = 0): ", true);
            GeometricFlatFigure figure2 = new GeometricFlatFigure(scan.enterNumber(), scan.enterNumber(), scan.enterNumber(), scan.enterNumber(), scan.enterNumber(), scan.enterNumber(), scan.enterLine());
            calc.figure = figure2;
            print.prString("Периметр " + figure2.getName() + " равен: ", false);
            print.prNumber(calc.findPerimeter(figure2.getName()), true);
            print.prString("Площадь " + figure2.getName() + " равна: ", false);
            print.prNumber(calc.findSquare(figure2.getName()), true);
            break;

            case 3:
//      Задача 3 (Даны 2 стороны прямоугольника, найти его площадь и периметр).
            print.prString("Введите, пожалуйста, данные прямоугольника по маске: - шесть сторон и название (неизвестные параметры обозначать = 0): ", true);
            GeometricFlatFigure figure3 = new GeometricFlatFigure(scan.enterNumber(), scan.enterNumber(), scan.enterNumber(), scan.enterNumber(), scan.enterNumber(), scan.enterNumber(), scan.enterLine());
            calc.figure = figure3;
            print.prString("Площадь " + figure3.getName() + " равна: ", false);
            print.prNumber(calc.findSquare(figure3.getName()), true);
            print.prString("Периметр " + figure3.getName() + " равен: ", false);
            print.prNumber(calc.findPerimeter(figure3.getName()), true);
            break;

            case 4:
//      Задача 4 (Дан диаметр окружности, найти ее длину).
            print.prString("Введите, пожалуйста, данные окружности по маске: радиус, диаметр, длину окружности, площадь, низвание фигуры (неизвестные параметры обозначать = 0): ", true);
            GeometricFlatFigure figure4 = new GeometricFlatFigure(scan.enterNumber(), scan.enterNumber(), scan.enterNumber(), scan.enterNumber(), scan.enterLine());
            calc.figure = figure4;
            print.prString("Длина окружности " + figure4.getName() + " равна: ", false);
            print.prNumber(calc.findPerimeter(figure4.getName()), true);
            break;

            case 5:
            print.prString("Введите, пожалуйста, данные объемной геометрической фигуры (три ребра, две грани, высоту и название (неизвестные параметры обозначать = 0):", true);
            GeometricVolumeFigure figureV1 = new GeometricVolumeFigure(scan.enterNumber(), scan.enterNumber(), scan.enterNumber(), scan.enterNumber(), scan.enterNumber(), scan.enterNumber(), scan.enterLine());
            calc.figureV = figureV1;
            print.prString("Объем " + figureV1.getName() + " равен: ", false);
            print.prNumber(calc.findVolume(figureV1.getName()), true);
            break;

            case 6:
//      Задача 5 (Дана длина ребра куба, найти его объем и площадь поверхности).
            print.prString("Введите, пожалуйста, данные куба по маске: - три ребра, две грани, высоту и название (неизвестные параметры обозначать = 0): ", true);
            GeometricVolumeFigure figureV2 = new GeometricVolumeFigure(scan.enterNumber(), scan.enterNumber(), scan.enterNumber(), scan.enterNumber(), scan.enterNumber(), scan.enterNumber(), scan.enterLine());
            calc.figureV = figureV2;
            print.prString("Объем " + figureV2.getName() + " равен: ", false);
            print.prNumber(calc.findVolume(figureV2.getName()), true);
            print.prString("Площадь поверхности " + figureV2.getName() + " равна: ", false);
            print.prNumber(calc.findSurfaceSquare(figureV2.getName()), true);
            break;

            case 7:
//      Задача 6 (Даны три ребра прямоугольного параллелепипеда, найти его объем и площадь поверхности).
            print.prString("Введите, пожалуйста, данные параллелепипеда по маске: - три ребра, две грани, высоту и название (неизвестные параметры обозначать = 0): ", true);
            GeometricVolumeFigure figureV3 = new GeometricVolumeFigure(scan.enterNumber(), scan.enterNumber(), scan.enterNumber(), scan.enterNumber(), scan.enterNumber(), scan.enterNumber(), scan.enterLine());
            calc.figureV = figureV3;
            print.prString("Объем " + figureV3.getName() + " равен: ", false);
            print.prNumber(calc.findVolume(figureV3.getName()), true);
            print.prString("Площадь поверхности " + figureV3.getName() + " равна: ", false);
            print.prNumber(calc.findSurfaceSquare(figureV3.getName()), true);
            break;

            case 8:
//      Задача 7 (Найти длину окружности и площадь круга с известным радиусом).
            print.prString("Введите, пожалуйста, данные окружности по маске: радиус, диаметр, длину окружности, площадь, низвание фигуры (неизвестные параметры обозначать = 0): ", true);
            GeometricFlatFigure figure5 = new GeometricFlatFigure(scan.enterNumber(), scan.enterNumber(), scan.enterNumber(), scan.enterNumber(), scan.enterLine());
            calc.figure = figure5;
            print.prString("Длина окружности " + figure5.getName() + " равна: ", false);
            print.prNumber(calc.findPerimeter(figure5.getName()), true);
            print.prString("Площадь " + figure5.getName() + " равна: ", false);
            print.prNumber(calc.findSquare(figure5.getName()), true);
            break;

            case 9:
//      Задача 8 (Найти среднее арифметическое введенных чисел)
            print.prString("Введите, пожалуйста, любые четыре числа (если параметр числа неизвестен, пишите 0) :", true);
            Number number1 = new Number(scan.enterNumber(), scan.enterNumber(), scan.enterNumber(), scan.enterNumber());
            calc.number = number1;
            print.prString("Среднее арифметическое введенных чисел " + " равно: ", false);
            print.prNumber(calc.findAvg(number1.getA(), number1.getB(), number1.getC(), number1.getD()), true);
            break;

            case 10:
//      Задача 9 (Найдите среднее геометрическое введенных чисел).
            print.prString("Введите, пожалуйста, любые четыре числа (если параметр числа неизвестен, пишите 0) :", true);
            Number number2 = new Number(scan.enterNumber(), scan.enterNumber(), scan.enterNumber(), scan.enterNumber());
            calc.number = number2;
            print.prString("Среднее геометрическое введенных чисел " + " равно: ", false);
            print.prNumber(calc.findMean(number2.getA(), number2.getB(), number2.getC(), number2.getD()), true);
            break;
            default: print.prString("Введены неверные данные.", true);
        }
    }
}

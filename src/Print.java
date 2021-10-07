public class Print {
    public void prString(String string, boolean wrap) {
        if (wrap == true) {
            System.out.println(string);
        }
        if (wrap == false) {
            System.out.print(string);
        }
    }

    public void prNumber(double number, boolean wrap) {
        if (wrap == true) {
            System.out.println(number);
        }
        if (wrap == false) {
            System.out.print(number);
        }

    }
}

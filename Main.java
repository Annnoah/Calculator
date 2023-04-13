public class Main {

    public static void main (String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        if (a > 0 & b > 0) {
            int c = calc.devide.apply(a, b); // на ноль делить нельзя = ошибка
            calc.println.accept(c);
        } else {
            System.out.println("На ноль делить нельзя");
        }
    }
}


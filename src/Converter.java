import java.util.Scanner;

public class Converter {
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Выберите что переводить: 1- масса, 2- расстояние ");
        int x = in.nextInt();

        switch(x) {

            case 1:
                System.out.print("Выберите единицу измерения: 1- грамм, 2- карат, 3-фунт, 4- пуд ");
                int y = in.nextInt();

                System.out.print("Введите количество выбранных единиц ");
                int z = in.nextInt();

                double g;
                double k;
                double f;
                double p;
                switch(y) {

                    case 1:
                        g = z;
                        k = g * 5;
                        f = g * 0.002205;
                        p = g * 0.00006105;
                        System.out.printf("Результат: \n" +
                                "Грамм: %f \n" +
                                "Карат: %f \n" +
                                "Фунт: %f \n" +
                                "Пуд: %f \n", g, k, f, p);
                        break;

                    case 2:
                        k = z;
                        g = k * 0.2;
                        f = k * 0.00044093;
                        p = k * 0.00001221;
                        System.out.printf("Результат: \n" +
                                "Грамм: %f \n" +
                                "Карат: %f \n" +
                                "Фунт: %f \n" +
                                "Пуд: %f \n", g, k, f, p);
                        break;

                    case 3:
                        f = z;
                        g = f * 453.592;
                        k = f * 2267.96;
                        p = f * 0.0277;
                        System.out.printf("Результат: \n" +
                                "Грамм: %f \n" +
                                "Карат: %f \n" +
                                "Фунт: %f \n" +
                                "Пуд: %f \n", g, k, f, p);
                        break;

                    case 4:
                        p = z;
                        g = p * 16380.7;
                        k = p * 81903.4;
                        f = p * 36.1132;
                        System.out.printf("Результат: \n" +
                                "Грамм: %f \n" +
                                "Карат: %f \n" +
                                "Фунт: %f \n" +
                                "Пуд: %f \n", g, k, f, p);
                        break;
                }
                break;
            case 2:
                System.out.print("Выберите единицу измерения: 1- метр, 2- миля, 3-ярд, 4- фут ");
                int l = in.nextInt();

                System.out.print("Введите количество выбранных единиц ");
                int w = in.nextInt();

                double m;
                double mi;
                double ya;
                double fut;
                switch(l) {

                    case 1:
                        m = w;
                        mi = m * 0.000621;
                        ya = m * 1.09361;
                        fut = m * 3.28084;
                        System.out.printf("Результат: \n" +
                                "Метр: %f \n" +
                                "Миля: %f \n" +
                                "Ярд: %f \n" +
                                "Фут: %f \n", m, mi, ya, fut);
                        break;

                    case 2:
                        mi = w;
                        m = mi * 1609.34;
                        ya = mi * 1760;
                        fut = mi * 5280;
                        System.out.printf("Результат: \n" +
                                "Метр: %f \n" +
                                "Миля: %f \n" +
                                "Ярд: %f \n" +
                                "Фут: %f \n", m, mi, ya, fut);
                        break;

                    case 3:
                        ya = w;
                        m = ya * 0.9144;
                        mi = ya * 0.0005682;
                        fut = ya * 3;
                        System.out.printf("Результат: \n" +
                                "Метр: %f \n" +
                                "Миля: %f \n" +
                                "Ярд: %f \n" +
                                "Фут: %f \n", m, mi, ya, fut);
                        break;

                    case 4:
                        fut = w;
                        m = fut * 0.3048;
                        mi = fut * 0.0001894;
                        ya = fut * 0.3333333;
                        System.out.printf("Результат: \n" +
                                "Метр: %f \n" +
                                "Миля: %f \n" +
                                "Ярд: %f \n" +
                                "Фут: %f \n", m, mi, ya, fut);
                        break;

                }
                break;
        }
    }
}

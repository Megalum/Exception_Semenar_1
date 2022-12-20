import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exp3 {
    public static void start() {
        List<Integer> array1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        List<Integer> array2 = new ArrayList<>(Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2));
        List<Integer> array3 = new ArrayList<>(Arrays.asList(18, 32, 49, 96, 55, 36, 93, 68, 8));
        List<Integer> array4 = new ArrayList<>(Arrays.asList(18, 32, 49, 96, 55, 36, 93, 68, 0));
        System.out.println("Выберите операцию вычисления:\n" +
                "1 - Разность\n" +
                "2 - Частное\n" +
                "3 - Сумма");
        int numberTask = Exp2.isNumber(new Scanner(System.in).next());
        String ex;
        switch (numberTask) {
            case 1:
                System.out.println("Вызвать исключение на размерность (y/n)");
                ex = new Scanner(System.in).next();
                if (ex.equals("y")) {
                    System.out.println(list(array1, array2, "-"));
                } else if (ex.equals("n")) {
                    System.out.println(list(array3, array1, "-"));
                }
                break;
            case 2:
                System.out.println("Вызвать исключение на размерность (y/n)");
                ex = new Scanner(System.in).next();
                if (ex.equals("y")) {
                    System.out.println(list(array1, array2, "/"));
                } else if (ex.equals("n")) {
                    System.out.println("Вызвать исключение на деление на ноль (y/n)");
                    ex = new Scanner(System.in).next();
                    if (ex.equals("y")) {
                        System.out.println(list(array1, array4, "/"));
                    } else if (ex.equals("n")) {
                        System.out.println(list(array3, array1, "/"));
                    }
                }
                break;
            case 3:
                System.out.println("Вызвать исключение на размерность (y/n)");
                ex = new Scanner(System.in).next();
                if (ex.equals("y")) {
                    System.out.println(list(array1, array2, "+"));
                } else if (ex.equals("n")) {
                    System.out.println(list(array3, array1, "+"));
                }
                break;
        }
    }

    private static List<Integer> list(List<Integer> array1, List<Integer> array2, String operation){
        if (array1.size() != array2.size()){
            throw new RuntimeException("Arrays are not equal");
        }
        List<Integer> output = new ArrayList<>();
        for (int i = 0; i < array1.size(); i++) {
            if (operation == "-") {
                output.add(deduct(array1.get(i), array2.get(i)));
            }
            if (operation == "+") {
                output.add(amount(array1.get(i), array2.get(i)));
            }
            if (operation == "/") {
                output.add(division(array1.get(i), array2.get(i)));
            }
        }
        return output;
    }

    private static Integer deduct(Integer a1, Integer a2){
        return a1 - a2;
    }

    private static Integer division(Integer a1, Integer a2){
        if (a2 == 0){
            throw new RuntimeException("Division by zero");
        }
        return a1 / a2;
    }

    private static int amount(Integer a1, Integer a2){
        return a1 + a2;
    }

}

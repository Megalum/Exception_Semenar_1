import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exp3 {

    //Реализация 3, 4, 5 заданий
    public static void start() {

        //Создание массивов
        System.out.printf("Введите размерность первого массива: ");
        List<Integer> array1 = arrayCreate(Exp2.isNumber(new Scanner(System.in).next()),"A");
        System.out.printf("Введите размерность второго массива: ");
        List<Integer> array2 = arrayCreate(Exp2.isNumber(new Scanner(System.in).next()),"B");

        //Выбор операции с массивами
        System.out.println("Выберите операцию вычисления:\n" +
                "1 - Разность\n" +
                "2 - Частное\n" +
                "3 - Сумма");
        int numberTask = Exp2.isNumber(new Scanner(System.in).next());
        switch (numberTask) {
            case 1:
                System.out.println(list(array1, array2, "-"));
                break;
            case 2:
                System.out.println(list(array1, array2, "/"));
                break;
            case 3:
                System.out.println(list(array1, array2, "+"));
                break;
        }
    }

    //Метод создание массива из двух других и операции над ними
    private static List<Integer> list(List<Integer> array1, List<Integer> array2, String operation){

        //Проверка на равенство размерностей
        if (array1.size() != array2.size()){
            throw new RuntimeException("Arrays are not equal");
        }

        //Виды операций
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

    //Метод разности двух чисел
    private static Integer deduct(Integer a1, Integer a2){
        return a1 - a2;
    }

    //Метод деления двух чисел
    private static Integer division(Integer a1, Integer a2){

        //Проверка деления на ноль
        if (a2 == 0){
            throw new RuntimeException("Division by zero");
        }
        return a1 / a2;
    }

    //Метод сложения двух чисел
    private static int amount(Integer a1, Integer a2){
        return a1 + a2;
    }

    //Медод создания массива
    public static List<Integer> arrayCreate(int col, String name){
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < col; i++) {
            System.out.printf(name + "[" + i + "] = ");
            array.add(Exp2.isNumber(new Scanner(System.in).next()));
        }
        return array;
    }


}

import java.util.Scanner;

public class Exp2 {
    public static void start(){
        String[][] arr1 = {{"1","2","3","4","5"},
                          {"6","-7","8","-9","10"},
                          {"-1","-2","3","4","-5"}};
        String[][] arr2 = {{"1","2","3","4","5"},
                          {"6","-7","8","-9"},
                          {"-1","-2","3","4","-5"}};
        String[][] arr3 = {{"1","2","3","4","C"},
                          {"6","-7","A","-9","10"},
                          {"-1","-2","3","4","-5"}};
        System.out.println("Выберите операцию:\n" +
                "1 - Вычисление суммы\n" +
                "2 - Ошибка размерности\n" +
                "3 - Ошибка на ввод числа");
        int numberTask = isNumber(new Scanner(System.in).next());
        switch (numberTask) {
            case 1:
                System.out.println(sum2d(arr1));
                break;
            case 2:
                sum2d(arr2);
                break;
            case 3:
                sum2d(arr3);
                break;
        }
    }

    private static int sum2d(String[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            goingBeyondDimension(arr[i]);
            for (int j = 0; j < 5; j++) {
                isNumber(arr[i][j]);
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }

    private static void goingBeyondDimension(String[] arr){
        if (arr.length != 5){
            throw new RuntimeException("Выход за пределы размерности");
        }
    }

    public static int isNumber(String val) {
        char[] charArr = val.toCharArray();
        int i;
        if (charArr[0] != '-'){
            i = 0;
        } else{
            i = 1;
        }
        for (; i < charArr.length; i++) {
            if (!Character.isDigit(charArr[i])){
                throw new RuntimeException("Значение не являеся числом");
            }
        }
        return Integer.parseInt(val);
    }

}

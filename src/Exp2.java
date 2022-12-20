import java.util.Scanner;

public class Exp2 {

    //реализация второго задания
    public static void start(){

        //Создание матрицы
        System.out.printf("Введите колличество строк матрицы: ");
        int row = Exp2.isNumber(new Scanner(System.in).next());
        System.out.printf("Введите колличество столбцов матрицы: ");
        int col = Exp2.isNumber(new Scanner(System.in).next());
        String[][] arr1 = matrixCreate(col, row);

        System.out.println(sum2d(arr1));
    }

    //Метод из задания
    private static int sum2d(String[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            goingBeyondDimension(arr[i]);               //Проверка на длинну строки
            for (int j = 0; j < 5; j++) {
                isNumber(arr[i][j]);                    //Проверка на число
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }

        return sum;
    }

    //Метод проверки на длинну строки
    private static void goingBeyondDimension(String[] arr){
        if (arr.length != 5){
            throw new RuntimeException("Выход за пределы размерности");
        }
    }

    //Метод проверки на число
    public static int isNumber(String val) {

        char[] charArr = val.toCharArray();
        int i = 0;

        if (charArr[0] == '-'){                         //Проверка на отрицательное значение
            i = 1;
        }

        for (; i < charArr.length; i++) {
            if (!Character.isDigit(charArr[i])){
                throw new RuntimeException("Значение не являеся числом");
            }
        }

        return Integer.parseInt(val);
    }

    //Метод создания матрицы
    private static String[][] matrixCreate(int row, int col){

        String[][] matrix = new String[col][row];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.printf("A[" + i + "][" + j + "] = ");
                matrix[i][j] = new Scanner(System.in).next();
            }
        }

        return matrix;
    }

}

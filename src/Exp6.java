import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exp6 {

    //Реализация 6 задания
    public static void start(){

        //Создание матрицы
        System.out.printf("Введите колличество строк матрицы: ");
        int row = Exp2.isNumber(new Scanner(System.in).next());
        System.out.printf("Введите колличество столбцов матрицы: ");
        int col = Exp2.isNumber(new Scanner(System.in).next());
        List matrix1 = matrixCreate(col, row);

        printMatrix(matrix1);
    }

    //Метод вывода матрицы
    private static void printMatrix(List<List> matrix){

        //Проверка на квадратичность матрицы
        for (List indexI: matrix) {
            if (indexI.size() != matrix.size()){
                throw new RuntimeException("The length of rows and columns are different");
            }
        }

        for (Object indexI: matrix) {
            System.out.println(indexI);
        }
    }

    //Метод создания матрицы
    private static List matrixCreate(int col, int row){
        List matrix = new ArrayList();
        for (int i = 0; i < row; i++) {
            matrix.add(Exp3.arrayCreate(col, String.valueOf(i)));
        }
        return matrix;
    }

}

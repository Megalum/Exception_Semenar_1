import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exp6 {
    public static void start(){
        List matrix1 = new ArrayList();
        for (int i = 0; i < 5; i++) {
            List array = new ArrayList();
            for (int j = 0; j < 5; j++) {
                array.add(j + i);
            }
            matrix1.add(array);
        }
        List matrix2 = new ArrayList();
        for (int i = 0; i < 6; i++) {
            List array = new ArrayList();
            for (int j = 0; j < 4; j++) {
                array.add(j + i);
            }
            matrix2.add(array);
        }
        System.out.println("Вызвать исключение (y/n)");
        String ex = new Scanner(System.in).next();
        if (ex.equals("y")) {
            printMatrix(matrix2);
        } else if (ex.equals("n")) {
            printMatrix(matrix1);
        }
    }

    private static void printMatrix(List<List> matrix){
        for (List indexI: matrix) {
            if (indexI.size() != matrix.size()){
                throw new RuntimeException("The length of rows and columns are different");
            }
        }
        for (Object indexI: matrix) {
            System.out.println(indexI);
        }
    }

}

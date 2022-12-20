import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Выберите номер задания:\n" +
                "1 - Сколько разных типов исключений вы тут сможете получить\n" +
                "2 - Создание нового массива из двух предыдущих\n" +
                "3 - Проверка что длина строк и столбцов с одинаковым индексом одинакова");
        int numberTask = Exp2.isNumber(new Scanner(System.in).next());
        switch (numberTask) {
            case 1:
                Exp2.start();
                break;
            case 2:
                Exp3.start();
                break;
            case 3:
                Exp6.start();;
                break;
        }
    }
}
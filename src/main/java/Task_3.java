import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Task_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int lengthArray = input.nextInt();
        int[] numbers = new int[lengthArray];

        System.out.println("Вводите числя для заполнения массива");
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = input.nextInt();
        }
        List<Integer> numbersOut = new ArrayList<Integer>();
        for (int i = 0; i <numbers.length; i++) {
            if (numbers[i]%3 == 0) {
                numbersOut.add(numbers[i]);
            }
        }
        System.out.println("Элементы, кратные 3:\n");
        for (Integer out: numbersOut) {
            System.out.print(out+ " ");
        }
    }
}

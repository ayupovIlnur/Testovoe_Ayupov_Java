import java.util.Scanner;
public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = scanner.nextLine();
        if (name.equals("Вячеслав")) {
            System.out.println(String.format("Привет, %s!",name));
        } else {
            System.out.println("Нет такого имени");
        }
    }
}

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите номер задания:");

            int task = sc.nextInt();
            switch (task) {
                case 1 -> {
                    System.out.println("Введите числовое значение:");
                    doTask1(sc.nextInt());
                }
                case 2 -> {
                    System.out.println("Введите имя:");
                    doTask2(sc.next());
                }
                case 3 -> {
                    System.out.println("Укажите размер массива:");
                    doTask3(sc.nextInt());
                }
                default -> System.out.println("Задания под цифрой " + task + " не существует");
            }
        }
    }

    public static void doTask1(int x) {
        if (x > 7) {
            System.out.println("Привет");
        }
    }

    public static void doTask2(String name){
        if (name.equals("Вячеслав") ){
            System.out.println("Привет, "+name);
        } else {
            System.out.println("Нет такого имени");
        }
    }

    public static void doTask3(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите число с индексом " + i);
            arr[i] = sc.nextInt();
        }
        for (int j : arr) {
            if (j % 3 == 0) {
                System.out.println(j);
            }
        }

    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> animals = new ArrayList<>();
        animals.add("Шиншилла");
        animals.add("Крокодил");
        animals.add("Лев");
        animals.add("Медведь");
        animals.add("Слон");

        while(true) {
            printMenu();
            int command = scanner.nextInt();
            if (command == 1) {
                System.out.println("Сегодня в зоопарке можно увидеть кормления " + animal + " животных.");
                for (String animal : animals){
                    System.out.println(animal);
                }
            } else if (command == 2) {
                System.out.println("Какое животное вы хотите добавить?");
                String animal = scanner.nextInt()
                animals.add(animal);
            }

        }

//        System.out.println("Показать весь список животных?");
//        System.out.println("1 - Да");
//        System.out.println("2 - Нет");
//        int command = scanner.nextInt();
//        if (command == 1) {
//            for (int i = 0; i < animal.size(); i++) {
//                System.out.println(animal.get(i));
//            }
//        }
//        System.out.println("Хотите добавить новых животных?");
//        System.out.println("1 - Да");
//        System.out.println("2 - Нет");
//        command = scanner.nextInt();
//        if (command == 1) {
//            animal.add()
//            }
//        }
    }

    public static void printMenu(){
        System.out.println("1 - показать список животных в зоопарке");
        System.out.println("2- добавить новых животных в список");
        System.out.println("3 - удалить животное из списка");
        System.out.println("4 - очистить список");
        System.out.println("5 - проверить, есть ли в зоопарке данное животное");
        System.out.println("6 - выход из приложения");
    }
}
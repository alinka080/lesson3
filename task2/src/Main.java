import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> animal = new ArrayList<>();
        animal.add("Шиншилла");
        animal.add("Крокодил");
        animal.add("Лев");
        animal.add("Медведь");
        animal.add("Слон");
        System.out.println("Сегодня в зоопарке можно увидеть кормления животных.");
        System.out.println("Это будут:");

        for (int i = 0; i < animal.size(); i++) {
            System.out.println(animal.get(i));
        }

        ArrayList<String> time = new ArrayList<>();
        time.add("В 9:00 - ");
        time.add("В 10:00 - ");
        time.add("В 11:00 - ");
        time.add("В 12:00 - ");
        time.add("В 13:00 - ");

        System.out.println("Расписание кормлений:");

        System.out.println(time.get(0) + animal.get(1));
        System.out.println(time.get(1) + animal.get(4));
        System.out.println(time.get(2) + animal.get(0));
        System.out.println(time.get(3) + animal.get(2));
        System.out.println(time.get(4) + animal.get(3));



    }
}
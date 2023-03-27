package gbLinkedList;

public class Main {
    public static void main(String[] args) {
        GBLinkedList<String> list = new GBLinkedList<>();

        // Добавление элементов в начало и конец списка
        list.addToFront("one");
        list.addToFront("zeroo");
        list.addToEnd("two");

        // Получение размера списка
        System.out.println("Size of the list: " + list.size());

        // Получение элементов по индексу
        System.out.println("Element at index 0: " + list.get(0));
        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("Element at index 2: " + list.get(2));
    }
}
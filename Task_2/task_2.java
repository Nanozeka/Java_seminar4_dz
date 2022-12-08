// Задача 2:
// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.


import java.util.LinkedList;

public class task_2 {

    public static void main(String[] args) {

         // создаем массив чисел
        int[] listArr = { 1, 6, 8, 3, 4, 0, 10 };

        // иницилизируем линкед лист
        LinkedList<Integer> myLinkedList = new LinkedList<>();
        for (Integer temp : listArr) {
            myLinkedList.add(temp);
        }
         // печатаем линкед лист
        System.out.println("Изначальный список: " + myLinkedList);

        // указываем какой элемент добавить в конец очереди
        enqueue(myLinkedList, 12);

        // печатаем  новый линкед лист
        System.out.println("Список с добавленным элементом: " + myLinkedList);

        //печатаем возвращаенный 1й элемент списка
        System.out.println(dequeue(myLinkedList));

        // печатаем  новый линкед лист с удаленным 1м элементом
        System.out.println("Список с удаленным 1м элементом: " + myLinkedList);

         // печатаем возвращаенный 1й элемент списка
        System.out.println(first(myLinkedList));
    }
    // создаем метод по добавлению элемента в конец списка
    public static void enqueue(LinkedList<Integer> list, int num) {
        list.addLast(num);
    }

    // создаем метод по возвращению 1го элемента, а затем удаляем его
    public static int dequeue(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        list.remove(0);
        return num;
    }

    // создаем метод по возвращению 1го элемента
    public static int first(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        return num;
    }
}

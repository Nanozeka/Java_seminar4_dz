// Задача 1:
// Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод, который вернет “перевернутый” список.



import java.util.LinkedList;

public class task_1 {

    public static void main(String[] args) {

        // создаем массив чисел
        int[] listArr = {4,3,1,8,5,4,9,1};
        
        // иницилизируем линкед лист
        LinkedList<Integer> revLinkedList = new LinkedList<>();

        for (Integer temp : listArr) {
            revLinkedList.add(temp);
        }

        // создаем временную переменую
        int temp = 0;

        // проходим циклом по листу
        while (temp != revLinkedList.size() - 1) {

            // меняем местами ссылку последнего элемента на ссылку первого элемента
            revLinkedList.add(revLinkedList.size()-temp, revLinkedList.getFirst());

            // удаляем первую 
            revLinkedList.removeFirst();
            temp++;
        }

        // Печатаем Перевернутый список
        System.out.println("Перевернутый список: " + revLinkedList);

        
    }
}
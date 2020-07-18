import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //Решение задания 1
        Integer[] matrix = {1,2,3,4,5,6,7,8,9};
        System.out.println("Исходный массив: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i]);
        }
        Integer tmp = matrix[1];
        matrix[1] = matrix[8];
        matrix[8] = tmp;

        System.out.println("\nПоменяли местами два элемента:");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i]);
        }

        //Решение задания 2
        System.out.println("\nПреобразовали массив в ArrayList:");
        ArrayList<Integer> newArray = getArrayList(matrix);

        for (Integer row: newArray) {
            System.out.print(row);
        }

        System.out.println("\n");
        //Решение задания 3
        Box boxNum_1 = new Box("Коробка 1");
        boxNum_1.addFruit(new Apple());
        boxNum_1.addFruit(new Apple());
        boxNum_1.addFruit(new Apple());
        boxNum_1.addFruit(new Orange());

        Box boxNum_2 = new Box("Коробка 2");
        boxNum_2.addFruit(new Orange());
        boxNum_2.addFruit(new Orange());
        System.out.println(boxNum_2.getWeight());

        System.out.println(boxNum_1.compare(boxNum_2));

        Box boxNum_3 = new Box("Коробка 3");
        for (int i = 0; i < 10; i++) {
            boxNum_3.addFruit(new Apple());
        }

        boxNum_3.putIn(boxNum_1);
        System.out.println("Количество фруктов в коробке 1: " + boxNum_1.getCountFruit());
        System.out.println("Количество фруктов в коробке 3: " + boxNum_3.getCountFruit());

        boxNum_2.putIn(boxNum_1);

    }

    public static ArrayList<Integer> getArrayList(Integer[] matrix) {
        ArrayList<Integer> newArrayList = new ArrayList<>();
        Collections.addAll(newArrayList, matrix);
        return newArrayList;
    }
}

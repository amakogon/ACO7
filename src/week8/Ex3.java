package week8;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(new Penguin("Chilli"));
//        printNumbersPlusTwo(list);
        printAll(list);

        printAll(new ArrayList<Integer>());

        Object o = new Integer(5);
//        list = new ArrayList<Integer>();
        List<?> integers = new ArrayList<Integer>();
//        printNumbersPlusTwo(integers);
        printAll(integers);
/*        Integer[] integers = new Integer[19];
        foo(integers);
        */
    }

    public static void printNumbersPlusTwo(List<Integer> list) {
        for (Integer i : list) {
            System.out.println(i + 2);
        }
    }

    public static void printAll(List<?> list) {
        Integer integer = (Integer) list.get(0);
        for (Object o : list) {
            System.out.println(o);
        }
    }
}

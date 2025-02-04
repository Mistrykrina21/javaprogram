package collections;

import java.util.ArrayList;

public class ArrayListMain {
    public static void main(String args[]) {
        //Classname objectname = new Classname();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> List1 = new ArrayList<>();
        ArrayList<Boolean> List2 = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1,21);

        System.out.println(list);
// get oprations
        Integer element = list.get(2);
        System.out.println(element);
// remove oprations
        list.remove(2);
        System.out.println(list);
//set oprations
        list.set(2,21);
        System.out.println(list);
//contains oprations
        System.out.println(list.contains(1));
        System.out.println(list.contains(12));
    }
    }




/**
 * Created by nata on 03.05.2017.
 */

import java.util.LinkedList;
import java.util.ListIterator;

////jhgjhgjghhjg  2424242424

public class TestLinkedList {

    public static void main(String[] args) {

        LinkedList passengerList = new LinkedList();

        passengerList.add("Alex Smith");
        passengerList.add("Mary Lou");
        passengerList.add("Sim Monk");

        // Get the list iterator and print every element of the list
        ListIterator iterator = passengerList.listIterator();

        System.out.println(iterator.next());
        //1--
        //iterator.add("VIP customer");
        //iterator.previous();

        //2--
        passengerList.add("VIP customer");
        iterator = passengerList.listIterator();

        System.out.println(iterator.next());
        System.out.println(iterator.next());
    }
}

package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableArrayList;
import ua.edu.ucu.collections.immutable.ImmutableLinkedList;
import ua.edu.ucu.collections.immutable.ImmutableList;


public class Main {
    public static void main(String[] args) {

        ImmutableList arr = new ImmutableLinkedList(new Object[]{1, 2, 3, 4});
        System.out.println(arr);


    }
}

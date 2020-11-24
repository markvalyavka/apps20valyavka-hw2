package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableArrayList;
import ua.edu.ucu.collections.immutable.ImmutableLinkedList;
import ua.edu.ucu.collections.immutable.ImmutableList;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        ImmutableLinkedList arr = new ImmutableLinkedList(new Object[]{2, 3, 7, 9, 5});
        System.out.println(arr);
        System.out.println(arr.removeFirst());

    }
}

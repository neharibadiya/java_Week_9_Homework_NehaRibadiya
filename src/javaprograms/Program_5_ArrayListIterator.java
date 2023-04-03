package javaprograms;

import java.util.ArrayList;

/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */
public class Program_5_ArrayListIterator {
    public static void main(String[] args) {
      //creat a list add some colors to the list
        ArrayList<String>list = new ArrayList<>() ;
        list.add("Amitabh");
        list.add("Jya");
        list.add("Abhishek");
        list.add("Ashvariya");
        list.add("Bachchan Family");
        //print the list
        for (String element : list) {
            System.out.println(element);
        }

    }
}

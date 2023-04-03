package javaprograms;

import java.util.ArrayList;

/**
 *  Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class Program_6_FindFromArrayList {
    public static void main(String[] args) {

        //creating an empty Integer Arraylist
        ArrayList<String> arr = new ArrayList<>();
        //using add() to initialize values
        arr.add("One");
        arr.add("Two");
        arr.add("Three");
        arr.add("Four");
        arr.add("Five");

        // printing element of list
        System.out.println("List : "+ arr);
        //getting element at index 2
        String element = arr.get(2);

        //displaying element at specified index
        //on console inside list
        System.out.println("the element at index 2 is "+element);
    }
}

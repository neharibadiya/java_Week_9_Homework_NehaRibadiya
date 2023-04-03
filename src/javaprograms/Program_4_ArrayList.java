package javaprograms;

import java.util.ArrayList;

/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
public class Program_4_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>();
        color.add("Green");
        color.add("Yellow");
        color.add("Red");
        color.add("Black");
        color.add("White");
        //print the list
        for( String i : color){
            System.out.println(i);
        }
    }
}

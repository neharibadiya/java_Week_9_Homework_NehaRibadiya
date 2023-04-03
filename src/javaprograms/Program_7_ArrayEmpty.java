package javaprograms;

import java.util.ArrayList;

public class Program_7_ArrayEmpty {
    public static void main(String[] args) {
        //creating an empty integer Arralist
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        //check if the list is empty or not using function
        boolean ans = arr.isEmpty();
        if (ans == true){
            System.out.println("The ArrayList is empty");
        }else{
            System.out.println("The ArrayList is not empty");
        }
        //addition of a element to the ArrayList
        arr.add(1);

        //check if the list is empty or not
        ans = arr.isEmpty();
        if (ans == true){
            System.out.println("The ArrayList is empty");
        }else{
            System.out.println("The ArrayList is not empty");
        }
    }
}

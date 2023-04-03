package javaprograms;

import java.util.HashSet;

public class Program_8_HashSet {
    public static void main(String[] args) {

        HashSet<Integer> number = new HashSet<>();
        //add value to the set
        number.add(4);
        number.add(5);
        number.add(6);
        number.add(7);

        //show which number between 1 and 10 are in the set
        for (int i = 1; i <= 10; i++) {
            if(number.contains(i)){
                System.out.println(i+ "was found in the set.");
            }else{
                System.out.println(i + "was not found in the set.");
            }
        }
    }
}

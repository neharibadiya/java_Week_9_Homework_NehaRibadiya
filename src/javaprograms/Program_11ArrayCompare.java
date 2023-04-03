package javaprograms;

import java.util.ArrayList;

/**
 *  Declare following two arrylist and compare it.
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink");
 */
public class Program_11ArrayCompare {
    ArrayList<String> c1= new ArrayList<String>();
    ArrayList<String> c2= new ArrayList<String>();
    public static void main(String[] args) {
        Program_11ArrayCompare obj = new Program_11ArrayCompare();
        ArrayList c1= obj.c1;
        ArrayList c2 = obj.c2;
        obj.addElements();
        System.out.println(obj.compare(c1,c2));
    }
    public void addElements(){
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
    }
    public boolean compare(ArrayList c1, ArrayList c2) {
        return c1.equals(c2);
    }
}

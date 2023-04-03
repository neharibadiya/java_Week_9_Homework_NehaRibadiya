package javaprograms;

import java.util.Scanner;

/**
 *  Write a Java program to reverse an array of integer values
 */
public class Program_3_ReverseArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = in.nextInt();

        //declare an array
        int arr[] = new int[n];
        System.out.println("Enter an array  values: ");
        //input array values
        for (int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        int temp;
        int start = 0;
        int end = n-1;

        while (start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr [end] = temp;

            start++;
            end--;
        }
        System.out.println("Printing an Array after  revers");
        for (int j = 0; j < n; j++){
            System.out.println(arr[j]);
        }
        in.close();
    }
}

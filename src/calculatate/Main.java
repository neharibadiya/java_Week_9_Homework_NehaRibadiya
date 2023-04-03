package calculatate;

import java.util.Scanner;

public class Main extends Calculator{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Calculator obj = new Calculator();//object calculator
        char ans = 'Y';
        // while loop use
        while (ans == 'Y' || ans == 'y') {
            System.out.println("Enter first number : ");
            int a = s.nextInt();
            System.out.println("Enter second number : ");
            int b = s.nextInt();
            System.out.println("Please enter one of symbol +,-,*,/ : ");
            char symbol = s.next().charAt(0);
            obj.calculateResult(a, b, symbol);

            int ans1=0;
            if(ans1 == a+b ){
                System.out.println("Addition of " + a + " and " + b + " is : " + ans1);
            }else if  (ans1 == a*b){
                System.out.println("multiplication of " + a + " and " + b + " is : " + ans1);
            }else if (ans1 == a/b){
                System.out.println("division of " + a + " and " + b + " is : " + ans1);
            }else if (ans1 == a-b){
                System.out.println("subtraction of " + a + " and " + b + " is : " + ans1);
            }else {
               // System.out.println(" ");
            }
            System.out.println("would you like to do more calculate please enter : ");
            int Yes = s.nextInt();
            ans = s.next().charAt(0);
            s.close();
        }
    }
}

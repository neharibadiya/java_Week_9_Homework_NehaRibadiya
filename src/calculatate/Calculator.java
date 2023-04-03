package calculatate;

public class Calculator {

    public void addition(int a, int b) {  //no return type with parameter all method
        int ans = a + b;
        System.out.println(ans);
    }
    public void subtraction(int a, int b){
        int ans1 = a - b;
        System.out.println(ans1);
    }
    public void multiplication(int a, int b){
        int ans2 = a * b;
        System.out.println(ans2);
    }
    public void division(int a, int b){
        int ans3 = a / b;
        System.out.println(ans3);
    }
    public void calculateResult(int a, int b, char symbol){
        Calculator obj = new Calculator();
        if(symbol == '+'){
            obj.addition(a,b);
        } else if (symbol=='-') {
            obj.subtraction(a,b);
        }else if (symbol=='*') {
            obj.multiplication(a,b);
        }else if (symbol=='/') {
            obj.division(a,b);
        }else{
            System.out.println("Invalid Input");
        }

    }

}

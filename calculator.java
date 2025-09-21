import java.util.Scanner;
public class calculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double num1,num2,result;
        char operator;
        System.out.print("Enter first number: ");
        num1=sc.nextDouble();
        System.out.print("Enter the operator (+,-,*,/,^): ");
        operator=sc.next().charAt(0);
        System.out.print("Enter the second number: ");
        num2=sc.nextDouble();
        switch(operator){
            case '+':
                result=num1+num2;
                System.out.printf("Result is %.2f",result);
                break;
            case '-':
                result=num1-num2;
                System.out.printf("Result is %.2f",result);
                break;
            case '*':
                result=num1*num2;
                System.out.printf("Result is %.2f",result);
                break;
            case '/':
                if(num2!=0){
                    result=num1/num2;
                    System.out.printf("Result is %.2f",result);
                }else{
                    System.out.println("Error ! Division by zero");
                }
                break;
            case '^':
                result=Math.pow(num1,num2);
                System.out.printf("Result is %.2f",result);
                break;
            default:
                System.out.println("Please enter a valid operator");
        }
        sc.close();
    }
}
import java.util.Scanner;
public class compound_interest_calculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double principal;
        double rate;
        int time;
        int years;
        double amount;
        System.out.print("Enter the principal amount: ");
        principal=sc.nextDouble();
        System.out.print("Enter the interest rate (in %): ");
        rate=sc.nextDouble();
        System.out.print("Enter the time compounded per year: ");
        time=sc.nextInt();
        System.out.print("Enter the number of years: ");
        years=sc.nextInt();
        amount=principal*Math.pow(1+(rate/100)/time,time*years);
        System.out.println("The amount after "+years+" years is: $"+amount);
        sc.close();
    }
}

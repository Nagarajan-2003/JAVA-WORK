import java.util.Scanner;
public class shopping_cart{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       String item;
       double price;
       int quantity;
       char currency='$';
       double total;
       System.out.print("enter your item ");
       item=sc.nextLine();
       System.out.print("enter your price ");
       price=sc.nextDouble();
       System.out.print("enter your quantity ");
       quantity=sc.nextInt();
       total=price*quantity;
       System.out.print("\nYou have bought "+quantity+" "+item+"\s");
       System.out.print("\n Your total is "+currency+total);
       sc.close(); 
    }
}
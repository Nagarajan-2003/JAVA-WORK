import java.util.Scanner;
public class hypotenuse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.print("enter the length of the first side of triangle (side A) : ");
        a=sc.nextDouble();
        System.out.print("enter the length of the second side of the triangle (side B) : ");
        b=sc.nextDouble();
        c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.print("the length of the hypotenuse of the triangle (side C) : "+c);
        sc.close();
    }
}
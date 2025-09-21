import java.util.Scanner;
public class area_volume_circumference{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double radius;
        double area;
        double volume;
        double circumference;
        System.out.print("Enter the radius of the circle : ");
        radius=sc.nextDouble();
        area=Math.PI*Math.pow(radius,2);
        volume=(4.0/3.0)*Math.PI*Math.pow(radius,3);
        circumference=2*Math.PI*radius;
        System.out.printf("Circumference of the circle with radius %.2f cm: %.2f cm\n", radius, circumference);
        System.out.printf("Area of the circle with radius %.2f cm: %.2f cm²\n", radius, area);
        System.out.printf("Volume of the circle with radius %.2f cm: %.2f cm³\n", radius, volume);        sc.close();
    }
}
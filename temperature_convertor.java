import java.util.Scanner;
public class temperature_convertor{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double temp;
        double new_temp;
        String unit;
        System.out.print("Enter the temperature you want to convert: ");
        temp=sc.nextDouble();
        System.out.print("Enter the unit of the temperature (C for Celsius, F for Fahrenheit): ");
        unit=sc.next().toUpperCase();
        new_temp=(unit.equals("C"))?(temp-32)*5/9:(temp*5/9)+32;
        System.out.printf("%.1f°%s",new_temp,unit);
        sc.close();
        }
    }

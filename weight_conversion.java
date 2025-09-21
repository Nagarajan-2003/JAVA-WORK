import java.util.Scanner;
public class weight_conversion{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double weight;
        double new_weight;
        int choice;
        System.out.println("enter the choice of your weight conversion");
        System.out.println("1.Lbs to Kgs");
        System.out.println("2.Kgs to Lbs");
        choice=sc.nextInt();
        switch(choice){
            case 1:
                System.out.print("Enter weight in lbs: ");
                weight=sc.nextDouble();
                new_weight=weight*0.453592;
                System.out.printf("Weight in Kgs: %.2f Kgs",new_weight);
                break;
            case 2:
                System.out.print("Enter weight in Kgs: ");
                weight=sc.nextDouble();
                new_weight=weight/0.453592;
                System.out.printf("Weight in Lbs: %.2f Lbs",new_weight);
                break;
            default:
                System.out.println("Please enter a valid choice");
        }
        sc.close();
    }
}
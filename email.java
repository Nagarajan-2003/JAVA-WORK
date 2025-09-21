import java.util.Scanner;
public class email{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String email;
        String username;
        String domain;
        System.out.print("Enter your email address: ");
        email=sc.nextLine();
        if(email.contains("@")){
            username=email.substring(0,email.indexOf("@"));
            domain=email.substring(email.indexOf("@")+1);
            System.out.println("Username : "+username);
            System.out.println("Domain : "+domain);
        }
        else{
            System.out.println(" Invalid Email address\n Email address should contain @ character");
        }
        sc.close();
    }
}
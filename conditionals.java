import java.util.Scanner;
//don't put this in terminal
public class conditionals {

    static Scanner ageInput = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Hello, welcome to Alex's amazing code how old are you?");
        int age = ageInput.nextInt();

        if(age <= 18){
            System.out.println("You're a youngin'");
        } else if (age > 18 && age <= 35){
            System.out.println("The early adult years.");
        } else if (age > 35 && age <= 55){
            System.out.println("Middle aged, time to buy a really expensive car.");
        } else if (age > 55 && age <= 64){
            System.out.println("Getting old");
        } else {
            System.out.println("Retirement! Time to live out the golden years.");
        }

    }
}

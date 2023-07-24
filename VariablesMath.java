import java.util.Scanner;

public class VariablesMath{
    
    static Scanner numInput = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Life expectancy of your dog");
        int lifeExpectancy = numInput.nextInt();

        System.out.println("The life expectancy of your dog is " + lifeExpectancy);

        System.out.println("How old is your dog");
        int dogAge = numInput.nextInt();

        System.out.println("Your dog is " + dogAge);
    
        System.out.println("How old are you");
        int userAge = numInput.nextInt();

        System.out.println("You are " + userAge);
    
    double dogAgeInHumanYears = dogAge * 7.4;
    double yearsToLive = lifeExpectancy * 7.4 - dogAgeInHumanYears;
    double userAgeInDogYears = userAge / 7.4;


    if (yearsToLive < 0){
        System.out.println("I am sorry for your loss :(");
    } else {
        System.out.println("Your dog is approximately" + Math.round(dogAgeInHumanYears) + " in human years.");
        System.out.println("Your dog has approximately" + Math.round(yearsToLive) + " years left in human years");
        System.out.println("You are approximately" + Math.round(userAgeInDogYears) + " years old in dog years");
    }

    }
}
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class LotteryGenerater {
    public static void main(String[] args){

        List<Integer> winningNumbers = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 6; i++) {

            while(true){

            int winningNumber = random.nextInt(49 + 1 ); 
            if (!winningNumbers.contains(winningNumber)){
                winningNumbers.add(winningNumber);

                break;
                }
            }
        }
        System.out.println("Please enter 6 numbers between 1 - 49: ");

        Scanner sc = new Scanner(System.in);
        List<Integer> userNumbers = new ArrayList<>(); 
        for (int i = 0; i < 6; i++ ){

            System.out.println("Current numbers " + userNumbers);
            System.out.println("Enter a Numbers" );

            while(true){
        try {
            String numberString = sc.nextLine(); 
            int number = Integer.parseInt(numberString);
            if (number >= 1 && number <= 49){
            userNumbers.add(number); 
            break;
                }
                else {
                    System.out.println(number + " is not a valid number");
                }
        }
        catch(NumberFormatException nfe){
            System.out.println("This is not a number ");
                }
            }
        }
        System.out.println("Winning numbers were: " + winningNumbers); 
        System.out.println("Your numbers were: " + userNumbers); 

        userNumbers.retainAll(winningNumbers);
        System.out.println("Matched numbers are: " + userNumbers);

        if(userNumbers.containsAll(winningNumbers)){
            System.out.println("You win!");

        }
        else {
            System.out.println("You lost");
        }
    }
    
}
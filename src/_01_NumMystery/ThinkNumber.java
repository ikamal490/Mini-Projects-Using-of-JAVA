package _01_NumMystery;
// Guess The Number
import java.util.Random;
import java.util.Scanner;

public class ThinkNumber {
    public static void welcome(){
        System.out.println("::: Welcome to the Number Guessing Game :::");
        System.out.println(":: Try to guess the number between 0 and 100 ::");
    }

    public static void playGame(){
        Random rand = new Random();
        int rand_int = rand.nextInt(100);
//        System.out.println("Random Number : "+rand_int); // If we commented out this line, the random number will be displayed on the user screen
        Scanner sc = new Scanner(System.in);
        int count = 1;
        System.out.println();
        while(true){
            System.out.println("Enter a number ");
            int numb = sc.nextInt();
            if(numb < rand_int){
                System.out.println("Try a higher number!");
            }
            if(numb > rand_int){
                System.out.println("Try a lower number!");
            }
            if(numb != rand_int ){
                count++;
            }
           else if(numb == rand_int){
                System.out.println("\uD83C\uDF89 Congratulations! You guessed the correct number in " + count + " attempts.");
                break;
            }
        }
    }

    public static void main(String[] args) {
        welcome();
       playGame();
    }
}

/*
Output:
Enter a number
50
Try a lower number!
Enter a number
25
Try a higher number!
Enter a number
35
Try a lower number!
Enter a number
30
Try a higher number!
Enter a number
33
Try a lower number!
Enter a number
32
Try a lower number!
Enter a number
31
🎉 Congratulations! You guessed the correct number in 7 attempts.
 */
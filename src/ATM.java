import java.util.Scanner;
    public class ATM{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int number = 7;
            int maxAttempts = 5;
            int attempt = 1;
            boolean isGuessed = false;
            while (attempt <= maxAttempts){
                System.out.println("Enter the number: ");
                int guess = scanner.nextInt();
                if (guess == number){
                    System.out.println("Correct!");
                    System.out.println("Attempts left: " + attempt);
                    isGuessed = true;
                    break;
                }else if (guess < number){
                    System.out.println("Too low!");
                }else {
                    System.out.println("Too high!");
                }
                attempt++;
            }
            if(!isGuessed){
                System.out.println("Game over!");
            }
        }
    }


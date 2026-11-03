import java.util.Scanner;
    public class NumberStatistics { public static void main(String[] args) { Scanner scanner = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        int evenCount = 0;
        int oddCount = 0;


        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = scanner.nextInt();


            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }


            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }


        System.out.println("\nResults:");
        System.out.println("Positive: " + positiveCount);
        System.out.println("Negative: " + negativeCount);
        System.out.println("Zero: " + zeroCount);
        System.out.println("Even: " + evenCount);
        System.out.println("Odd: " + oddCount);

        scanner.close();
    }
    }


import java.util.Scanner;

public class Main {

    private static int DIVIDE = 10;

    static void isPalindrome(int number) throws Exception {

        if(number<0){
            throw new Exception("Number have to greater than 0");
        }


        int temp = number;
        int reverseNumber = 0;
        int lastNumber;


        while (temp != 0) {
            lastNumber = temp % DIVIDE;
            reverseNumber = (reverseNumber * DIVIDE) + lastNumber;
            temp /= DIVIDE;

        }
        if (reverseNumber == number) {
            System.out.println(number + " is a palindrome number");

        } else {
            System.out.println(number + " is not a palindrome number");

        }

    }

    public static void main(String[] args) throws Exception {

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter Number: ");
        String input = inp.nextLine();

        int i;

        try {
            i = Integer.parseInt(input);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Your input is invalid");
            return;
        }

        isPalindrome(i);



    }
}
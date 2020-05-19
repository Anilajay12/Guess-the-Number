import java.util.Scanner;

public class numberGuess {
    public static void main(String[] args) {
        System.out.println("*********************************************************");
        System.out.println("*                   Number Guessing Game                *");
        System.out.println("*   Guessing Number in 10 tries or lessthan 10 tries    *");
        System.out.println("*********************************************************");
        System.out.print("Enter a number between 1 to 100: ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n>0 && n<=100) {
            System.out.println("Choose the correct options from below otherwise you wont get correct answer");
            int l = 1, h = 100, mid = 0, ch, choice = 10;
            do {
                mid = (l + h) / 2;
                System.out.println("If Your number is " + mid + " then press 0");
                System.out.println("If not your number lessthan " + mid + " then press 1");
                System.out.println("If your number greater than " + mid + " then press 2");
                ch = s.nextInt();
                if (ch == 0) {
                    break;
                } else if (ch == 1) {
                    l = l;
                    h = mid;
                } else {
                    l = mid + 1;
                    h = h;
                }
                --choice;
            } while (choice > 0);
            System.out.println();
            System.out.println("**************************************");
            System.out.print("*       Your number is : ");
            System.out.printf("%2d", mid );
            System.out.println("          *");
            System.out.println("*   Thank You for playing game       *");
            System.out.println("*       Have a Nice Day!             *");
            System.out.println("**************************************");
            if(choice==0){
                System.out.println("You are choosen wrong options in pressing 0 or 1 or 2");
                System.out.println("            Otherwise You are lying");
            }
        }
        else{
            System.out.println("You have to enter valid input (between 1 to 100)");
            System.out.println("Try Again");
        }
    }
}

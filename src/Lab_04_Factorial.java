import java.util.Scanner;

public class Lab_04_Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number");

        int n=1;
        int Factorial = 1;
        if(s.hasNextInt()){
           n = s.nextInt();
        }
        else {
            System.out.println("Enter the Integer value only");
            return;
        }
        for (int i = 1; i <= n ; i++) {
            Factorial = Factorial*i;



        }
        System.out.println("Factorial is" + " " +Factorial);
    }
}

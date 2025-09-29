import java.util.Scanner;

public class Lab_05_FactorialWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter any Number: ");

        int n = s.nextInt();
        int i=1;
        int Factorial = 1;

        if(Factorial == 0){
            Factorial = 1;
        }
        //While Loop
        while(i<=n){
            Factorial = Factorial*i;
            i++;
        }
    }
}

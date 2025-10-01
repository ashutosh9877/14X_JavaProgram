public class GreatestOfThree {
    public static void main(String[] args) {
        int a = 25, b = 42, c = 17;

        int greatest = (a > b)
                ? (a > c ? a : c)
                : (b > c ? b : c);

        System.out.println("Greatest number is: " + greatest);
    }
}
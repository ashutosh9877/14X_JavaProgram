public class TernaryOperator {
    public static void main(String[] args) {
        int age = 18;

        String result = (age>17)? (age==18? "You are eligible":"Not eligible"): "No";
        System.out.println(result);
    }
}

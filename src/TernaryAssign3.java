public class TernaryAssign3 {
    public static void main(String[] args) {
        int a = 13;

        String ageGroup = (a >= 60) ? "Senior Citizen"
                : (a >= 30) ? "Adult"
                : (a >= 13) ? "Teenager"
                : "Child";

        System.out.println("Age group: " + ageGroup);
    }
}
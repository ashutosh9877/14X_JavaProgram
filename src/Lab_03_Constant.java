public class Lab_03_Constant {
    public static void main(String[] args) {

        int a= 20;
        a = 30;
        System.out.println(a);   //a=30

        final int b = 30;
        // b=40;    system will throw the error as b is constant we can't change the value.
        System.out.println(b);
    }
}

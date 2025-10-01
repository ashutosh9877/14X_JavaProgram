public class TypeCasting_Narrowing {
    public static void main(String[] args) {
        int a = 120;
        byte b = (byte)a;  // only explicit can be possible in narrowing no Implicit
        System.out.println(b);
    }
}

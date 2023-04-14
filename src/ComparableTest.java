public class ComparableTest {
    public static void main(String[] args) {
        String s1 = new String("Issie");
        String s2 = new String("Imhotep");
        String s3 = new String("Matthew");
        String s4 = new String("Wyatt");
        String s6 = new String("Ryan");
        String s7 = new String("Ona");
        String s8 = new String("hell");
        String s9 = new String("hello");

        // What is a Comparable?
        System.out.println(s8.compareTo(s9));
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s3));
        System.out.println(s4.compareTo(s4));
        System.out.println(s4.compareTo(s7));
    }
}

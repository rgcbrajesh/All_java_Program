public class RelationalOp {
    public static void main(String[] args) {
        float a = 15.0f, b = 20.75f, c = 15.0f;
        System.out.println("a<b is =" + (a < b));
        System.out.println("a>b is =" + (a > b));
        System.out.println("a==c is =" + (a == c));
        System.out.println("a<=c is =" + (a <= c));
        System.out.println("a>=b is =" + (a >= b));
        System.out.println("b!=c is =" + (b != c));
        System.out.println("b==a+c"+(b==a+c) );

    }
}
// t f t t f t f

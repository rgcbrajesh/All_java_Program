public class typecasting {
    public static void main(String[] args) {
        char c = 'x';
        byte b = 50;
        short s = 1996;
        int i = 123456789;
        long l = 1234567891;
        double d = 0.000;
        float f = 1.2f;
        System.out.println(c);
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(d);

        System.out.println("This is type casting");

        short s1 = (short) b;
        short s2 = (short) i;
        float f1 = (float) l;
        int  i1 = (int) f;

        System.out.println("(short)b =" +s1);
         System.out.println("(short)i =" +s2);
          System.out.println("(float)b =" +f1);
           System.out.println("(int)f =" +i1);


    }
}

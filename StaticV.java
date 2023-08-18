public class StaticV {

    void display(){
        // local varianble
        int a=5;
        System.out.println("This is Static Variable =" + a);
    }
    public static void main(String[] args) {
        StaticV d = new StaticV();
        d.display();
    }
}

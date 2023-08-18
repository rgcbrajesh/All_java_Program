public class LocalV {

    void display(){
        // local varianble
        int a=5;
        System.out.println("This is Local Variable =" + a);
    }
    public static void main(String[] args) {
        LocalV d = new LocalV();
        d.display();
    }
}

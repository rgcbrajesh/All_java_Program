public class InstanceV{

    static int a=5;
    void display(){
        
        System.out.println("This Is Instance variable = "+ a);
    }
    public static void main(String argu[]){
        InstanceV d = new InstanceV();
        d.display();         
    }
}
package lamda;

public class AnonymousFunc {
    public void m1(){
        System.out.println("Normal method");
    }
    // (){
    //     System.out.println("anonymous function");
    // }
    public static void main(String[] args) {
        new AnonymousFunc().m1();
    }
}

package lamda;
@FunctionalInterface
public interface MyFunctionalInterface {
    void m1();
   
    default void m2(){
        System.out.println("Default Method1");
    }
    default void m3(){
        System.out.println("Default method-2");
    }
    static void m4(){
        System.out.println("Static method");
    }

}

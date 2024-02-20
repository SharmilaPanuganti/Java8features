package MethodReferences;

public class Test {
    public void m1(){
        System.out.println("M1");
    }
    public static void m2(){
        System.out.println("M2");
    }
    public static void main(String[] args) {
        Test.m2();
        // Test::m2() //reference::method  //static method reference
        Test t=new Test();
        t.m1();
        //t::m1() //instance method reference
        
    }
}

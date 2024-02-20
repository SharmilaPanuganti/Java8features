package lamda;
/**
 * InnerCalculatorImpl
 */
@FunctionalInterface
interface Calculator {
// void swichOn();
    // void sum(int input);
    int substract(int i1,int i2);
}
public class CalculatorImpl{

    //Lambda syntax: ()-{body}
    public static void main(String[] args) {
        // Calculator c=()->{System.out.println("Switch On");};
        // c.swichOn();
        // Calculator c=(a)->{System.out.println(a);}; //arguments
        // c.sum(24);
         Calculator c=(a,b)->{
            if(a<b)
            throw new RuntimeException();
        return a-b;}; 
        System.out.println(c.substract(20,10 ));
    }
}

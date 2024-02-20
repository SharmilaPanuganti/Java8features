package functionalInterfaces;

import java.util.function.BooleanSupplier;

public class BooleanSupplierEx {
    public static void main(String[] args) {
        BooleanSupplier booleanSupplier=()->true;
        System.out.println(booleanSupplier.getAsBoolean());
        int x=100;
        int y=90;
        booleanSupplier=()->x<y;
        System.out.println(booleanSupplier.getAsBoolean());
    }
}

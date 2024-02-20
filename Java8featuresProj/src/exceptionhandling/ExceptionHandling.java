package exceptionhandling;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExceptionHandling {
    public static void main(String[] args) {
        List<String> list=Arrays.asList("33","45","x");
        List<Integer> list2=Arrays.asList(2000,0);

        list.forEach(handleExceptionGeneric(s->System.out.println(Integer.parseInt(s)),NumberFormatException.class));
        //Generic
        list2.forEach(handleExceptionGeneric(s->System.out.println(s/0), ArithmeticException.class));
        //Checked exceptions
        list2.forEach(handleChecked(i->Thread.sleep(i)));

    }
    public static void printList(String s){
        try{
            System.out.println(Integer.parseInt(s));
        }
        catch(Exception e){
            System.out.println("Exception:"+e.getMessage());
        }
    }
    static Consumer<String> handleException(Consumer<String> payload){
        return obj->{
            try{
                payload.accept(obj);
            }catch(Exception e){
                System.out.println("Exception:"+e.getMessage());
            }
        };
    }
    static <T,E extends Exception> Consumer<T> handleExceptionGeneric(Consumer<T> payload,Class<E> exobj){
        return obj->{
            try{
               
                payload.accept(obj);
            }catch(Exception e){
                try{
                     E ex=exobj.cast(e);
                     System.out.println("Exception"+ex.getMessage());
                }
                catch(ClassCastException ecx){
                throw e;}
            }
        };
    }
    static<T> Consumer<T> handleChecked(CheckedExceptionHandler<T,Exception> handler){
        return obj->{
           
                try {
                    handler.accept(obj);
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            
        };

    }
}

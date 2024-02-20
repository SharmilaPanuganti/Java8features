package exceptionhandling;

public interface CheckedExceptionHandler<T,E extends Exception> {
    public void accept(T t) throws E;
}

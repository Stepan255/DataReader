package Exception;

public class ExceptionLengthData extends RuntimeException {
    public ExceptionLengthData(int length) {
        super("Count data error. Expected 6, entered " + length);
    }
}

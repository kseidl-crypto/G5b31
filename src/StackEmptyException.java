/**
 * Exception die geworfen wird, wenn Stack leer ist
 * @author kseidl
 * @version 14.12.20
 */
public class StackEmptyException extends Exception{
    public StackEmptyException(String errormessage){
        super(errormessage);
    }
}

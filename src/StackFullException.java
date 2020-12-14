/**
 * Exception, die geworfen wird, wenn Stack full ist
 * @author kseidl
 * @version 14.12.20
 */
public class StackFullException extends Exception{
    public StackFullException(String errormessage){
        super(errormessage);
    }
}

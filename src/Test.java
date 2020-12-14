/**
 * Testet Klasse Stack
 * @author kseidl
 * @version 14.12.20
 */
public class Test {
    public static void main (String args[]) throws StackEmptyException, StackFullException {
        Stack<Integer> zahlen;
        zahlen = new Stack<Integer>(3);

        zahlen.push(3);
        zahlen.push(2);
        zahlen.push(4);
        String s2= zahlen.list();
        System.out.println(s2);
        int a = zahlen.peek();
        int b = zahlen.pop();

        String s= zahlen.list();
        System.out.println(s);
        System.out.println(a+" "+b) ;

        Stack<String> text = new Stack<String>(4);
        text.push("Hallo");
        text.push("Wie");
        text.push("Geht's");
        text.push("Dir?");

        String ta = text.peek();

        String s3 = text.list();
        System.out.println(s3);
        System.out.println(ta);

    }
}

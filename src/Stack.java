/**
 * generische Klasse
 * @author kseidl
 * @version 14.12.20
 */
public class Stack <E>{
    private E[] object;

    /**
     * Konstruktor für generisches Objekt
     */
    public Stack(){
        this.object = null;
    }

    /**
     * Konstruktor
     * @param i gibt an, wie viele Eintraege platz haben
     */
    public Stack(int i){
        this.object = (E[])new Object[i];
    }

    /**
     *
     * @param o fügt Objekt hinzu
     * @throws StackFullException wenn das Stack voll ist
     */
    public void push(E o) throws  StackFullException{


        for(int i = 0; i < object.length; i++){
            if(object[i] == null) {
                object[i] = o;
                return;
            }
        }
        throw new StackFullException("Stack is full");


    }

    /**
     *
     * @return das letzte Objekt des Stacks und löscht es danach
     * @throws StackEmptyException wirf, wenn das Stack leer ist
     */
    public E pop() throws StackEmptyException {
        E o = null;
        for(int i = 0; i < object.length; i++){
            if(object[i] == null){
                if(i == 0){
                    throw new StackEmptyException("Stack is Empty");
                }
                o = object[i-1];
                object[i-1] = null;
                return o;
            }
        }
        o = object[object.length-1];
        object[object.length-1] = null;
        return o;

    }

    /**
     *
     * @return das Objekt
     * @throws StackEmptyException wenn das Stack leer ist
     */
    public E peek() throws StackEmptyException {
        E o = null;
        for(int i = 0; i < object.length; i++){
            if(object[i] == null){
                if(i == 0){
                    throw new StackEmptyException("Stack is Empty");
                }
                o = object[i-1];

                return o;
            }
        }
        o = object[object.length-1];

        return o;

    }

    /**
     *
     * @return eine Liste an dem Objekten im Stack
     */
    public String list(){
        String text ="";
        for(int i = 0; i < object.length; i++){
            if(i == object.length-1){
                text+=object[i];
            }
            else {
                text += object[i] + ", ";
            }
        }
        return text;
    }

}

public class Stack <E>{
    private E[] object;

    public Stack(){
        this.object = null;
    }

    public Stack(int i){
        this.object = (E[])new Object[i];
    }

    public void push(E o) throws  StackFullException{


        for(int i = 0; i < object.length; i++){
            if(object[i] == null) {
                object[i] = o;
                return;
            }
        }
        throw new StackFullException("Stack is full");


    }

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

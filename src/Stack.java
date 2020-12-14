public class Stack <E>{
    private E[] object;

    public Stack(){
        this.object = null;
    }

    public Stack(int i){
        this.object = (E[])new Object[i];
    }

    public void push(E o) throws  StackFullException{
        E[] nobjekt = (E[])new Object[object.length];

        for(int i = 0; i < object.length; i++){
            if(object[i] == null) {
                object[i] = o;
                return;
            }
        }
        throw new StackFullException("Stack is full");


    }


}

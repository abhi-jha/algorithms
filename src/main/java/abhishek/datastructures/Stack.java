package abhishek.datastructures;

public class Stack {

    String[] array;
    int maxSize;
    int top;

    public Stack(int sizeOfStack){
        array = new String[sizeOfStack];
        top = -1;
        maxSize = sizeOfStack;
    }

    public void push(String s){
        array[++top] = s;
    }

    public String pop(){
        return array[top--];
    }

    public String top(){
        return array[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == maxSize -1;
    }
}

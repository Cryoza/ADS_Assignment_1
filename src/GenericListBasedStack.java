import java.util.LinkedList;

public class GenericListBasedStack<T>  {

    private LinkedList<T> linkedList;

    public GenericListBasedStack() {
        linkedList = new LinkedList<>();
    }
    //push
    public void push(T element) {
        linkedList.push(element);
    }
    //pop
    public T pop() {
        return linkedList.pop();
    }
    //peek
    public T peek() {
        return linkedList.peek();
    }
    public int size() {
        return linkedList.size();
    }

}

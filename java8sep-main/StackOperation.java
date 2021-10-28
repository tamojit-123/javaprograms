//LinkedList Node
class Node {
    int data; // data field
    Node next; // pointerpoint to the next node
}

// stack operation (Push ,Pop,Peek)
class StackEx {
    Node top;

    StackEx() {
        this.top = null;
    }

    // function toreturn the topelement of the stack
    public boolean isEmpty() {
        return top == null;
    }

    // function to add an element of'num' to the stack , insert at begining
    public void push(int num) {
        // allocate a new node in the memory(heap)
        Node node = new Node();
        // check if stack(heap is full . cannot able to insert the element it will
        // overflow And then Insert an element
        if (node == null) {
            System.out.println(" Heap  OverFlow");
            return;
        }
        System.out.println("Push Element..");
        node.data = num; // setting the data in the allocated node
        node.next = top;// set the next pointer of new node to point to the current top node ofthe list
        // update the top pointer
        top = node;

    }

    // this method toreturn the top eleemnt of the stack
    public int peek() {
        // check foran empty stack
        if (!isEmpty()) {
            return top.data;
        } else {
            System.out.println("The stackis empty");
            return -1;
        }
    }

    // pop the top element
    public void pop() {
        if (top == null) {
            System.out.println(" Heap  underFlow");
            return;
        }
        System.out.println("Removethe element from stack" + peek());
        top = (top).next;
    }
}

class StackOperation {
    public static void main(String[] ar) {
        StackEx st = new StackEx();
        if (st.isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Element from the stack=" + st.peek());
        }
        st.push(10);
        System.out.println("Element from the stack=" + st.peek());
        st.push(20);
        System.out.println("Element from the stack=" + st.peek());
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.push(70);
        st.push(80);
        System.out.println("Element from the stack=" + st.peek());
        st.pop();
        System.out.println("Top Element from the stack=" + st.peek());
    }
}
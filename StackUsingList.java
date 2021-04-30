import static java.lang.System.exit;

class Linkedlist {

    private class Node {

        int data;
        Node link;
    }
    Node top;
    Linkedlist()
    {
        this.top = null;
    }

    public void push(int x)
    {

        Node temp = new Node();

        if (temp == null) {
            System.out.print("\nHeap Overflow");
            return;
        }

        temp.data = x;

        temp.link = top;

        top = temp;
    }

    public boolean isEmpty()
    {
        return top == null;
    }

    public int peek()
    {
        if (!isEmpty()) {
            return top.data;
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public void pop()
    {
        if (top == null) {
            System.out.print("\nStack Underflow");
            return;
        }

        top = (top).link;
    }

    public void display()
    {
        if (top == null) {
            System.out.print("\nStack Underflow");
            exit(1);
        }
        else {
            Node temp = top;
            System.out.print("Stack: ");
            while (temp != null) {

                System.out.printf("%d ", temp.data);

                temp = temp.link;
            }
        }
    }



    public void Finder()
    {
        if (top == null) {
            System.out.print("\nStack Underflow");
            exit(1);
        }
        else {
            Node temp = top;
            int max = temp.data, min = temp.data;
            while (temp != null) {

                if(temp.data > max)
                    max = temp.data;

                if(temp.data < min)
                    min = temp.data;

                temp = temp.link;
            }

            double ser = (max + min) / 2;
            System.out.println(max);
            System.out.println(min);
            System.out.println(ser);
        }
    }


}

public class StackUsingList {
    public static void main(String[] args)
    {
        Linkedlist obj = new Linkedlist();
        obj.push(11);
        obj.push(2);
        obj.push(133);
        obj.push(44);
        obj.push(3);
        obj.push(22);
        obj.push(51);
        obj.push(1);


        obj.display();

        System.out.printf("\nTop element is %d\n", obj.peek());

        obj.pop();
        obj.pop();

        obj.display();

        System.out.printf("\nTop element is %d\n", obj.peek());

        obj.Finder();
    }
}
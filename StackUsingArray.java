class StackUsingArray
{


    static final int BOUND = 4;


    static int top = -1;


    static int length = 0;


    static int[] create_new(int[] a)
    {

        int[] new_a = new int[length + BOUND];


        for (int i = 0; i < length; i++)
            new_a[i] = a[i];


        length += BOUND;
        return new_a;
    }


    static int[] push(int[] a, int element)
    {

        if (top == length - 1)
            a = create_new(a);


        a[++top] = element;
        return a;
    }


    static void pop(int[] a)
    {
        top--;
    }


    static void display(int[] a)
    {

        if (top == -1)
            System.out.println("Stack is Empty");
        else
        {
            System.out.print("Stack: ");
            for (int i = 0; i <= top; i++)
                System.out.print(a[i] + " ");
            System.out.println();
        }
    }


    static void Finder(int[] a)
    {


        if (top == -1)
            System.out.println("Stack is Empty");
        else
        {
            int max = a[0], min = a[0];
            for (int i = 0; i <= top; i++)
            {
                if(a[i] > max)
                    max = a[i];

                if(a[i] < min)
                    min = a[i];
            }
            double ser = (max + min) / 2;
            System.out.println(max);
            System.out.println(min);
            System.out.println(ser);
        }
    }




    public static void main(String[] args)
    {

        int []a = create_new(new int[length + BOUND]);

        a = push(a, 1);
        a = push(a, 2);
        a = push(a, 36);
        a = push(a, 4);
        display(a);

        a = push(a, 5);
        a = push(a, 6);
        display(a);

        a = push(a, 7);
        a = push(a, 8);
        display(a);

        a = push(a, 9);
        display(a);


        Finder(a);
    }
}

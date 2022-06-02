package adt.beispiele;

import adt.stack.Stack;
import adt.stack.StackInt;

public class TestStack {

    public static void testStackInt(String[] args) {
        StackInt s = new StackInt();
        s.push(3);
        s.push(5);
        s.push(7);
        s.push(1);
        s.push(2);
        s.push(9);

        System.out.println(s.peek());
        System.out.println(s);

        s.pop();
        s.pop();
        s.pop();
        s.pop();
        System.out.println(s);

        s.pop();
        s.pop();
        System.out.println(s);
        s.pop();
        System.out.println(s);
    }

    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<String>();
        stringStack.push("Isa");
        stringStack.push("Tobi");
        stringStack.push("Lui");
        stringStack.push("Pauli");
        stringStack.push("Benni");
        System.out.println(stringStack.pop());
        System.out.println(stringStack.pop());
        System.out.println(stringStack.pop());
        System.out.println(stringStack.pop());
        System.out.println(stringStack.pop());

        Stack<Integer> intStack = new Stack<>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        intStack.push(4);
        intStack.push(5);
        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
    }
}

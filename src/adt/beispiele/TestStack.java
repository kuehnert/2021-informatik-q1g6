package adt.beispiele;

import adt.stack.Stack;

public class TestStack {

    public static void main(String[] args) {
        Stack s = new Stack();
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
}

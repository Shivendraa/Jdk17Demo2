package collections;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        // LIFO - Last In, First Out
        // Plates - Sabse upar jo hai, wo sabse pehle uthao
        // push - Pushes item onto the top of stack
        // pop - Removes item from the top, and returns it
        // peek - Returns the item on top of stack
        // empty - Checks if stack is empty
        // search - returns the position, if not then -1

        // Extend Vector class [List(I) -> Vector(C) -> Stack(C)]
        // Thread safe ?? - Yes
        // Built in methods hai - par specific to stack

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(30);

        int popValue = stack.pop();

        stack.pop();

        System.out.println("Popped: " + popValue);

        int peekvalue = stack.peek();
        System.out.println("Peek: " + peekvalue);

        System.out.println(stack.isEmpty());

        System.out.println(stack.search(40));

        System.out.println(stack);
    }
}

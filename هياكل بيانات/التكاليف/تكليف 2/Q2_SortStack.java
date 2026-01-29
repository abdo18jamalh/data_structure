/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_strucure;

/**
 *
 * @author hp-omen
 */
    
package assignment1;

import java.util.Stack;

/*
 Q2: Sort a Stack using only another Stack
*/
public class Q2_SortStack {

    public static Stack<Integer> sortStack(Stack<Integer> stack) {

        Stack<Integer> tempStack = new Stack<>();

        while (!stack.isEmpty()) {
            int current = stack.pop();

            while (!tempStack.isEmpty() && tempStack.peek() > current) {
                stack.push(tempStack.pop());
            }
            tempStack.push(current);
        }

        return tempStack;
    }

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println(sortStack(stack));
    }
}

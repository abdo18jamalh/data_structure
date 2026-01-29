/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_strucure;

/**
 *
 * @author hp-omen
 */package assignment1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 Q3: Reverse the order of elements in a Queue
*/
public class Q3_ReverseQueue {

    public static void reverseQueue(Queue<Integer> queue) {

        Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        reverseQueue(queue);
        System.out.println(queue);
    }
}

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

/*
 Q5: Merge two sorted queues into a single sorted queue
*/
public class Q5_MergeSortedQueues {

    public static Queue<Integer> mergeSortedQueues(
            Queue<Integer> q1, Queue<Integer> q2) {

        Queue<Integer> mergedQueue = new LinkedList<>();

        while (!q1.isEmpty() && !q2.isEmpty()) {

            if (q1.peek() <= q2.peek()) {
                mergedQueue.add(q1.remove());
            } else {
                mergedQueue.add(q2.remove());
            }
        }

        while (!q1.isEmpty()) {
            mergedQueue.add(q1.remove());
        }

        while (!q2.isEmpty()) {
            mergedQueue.add(q2.remove());
        }

        return mergedQueue;
    }

    public static void main(String[] args) {

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        q1.add(1);
        q1.add(3);
        q1.add(5);

        q2.add(2);
        q2.add(4);
        q2.add(6);

        System.out.println(mergeSortedQueues(q1, q2));
    }
}

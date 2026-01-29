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

import java.util.PriorityQueue;

/*
 Q4: Implement a Priority Queue
 Smallest element is dequeued first
*/
public class Q4_PriorityQueue {

    public static void main(String[] args) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(40);
        priorityQueue.add(10);
        priorityQueue.add(30);
        priorityQueue.add(20);

        while (!priorityQueue.isEmpty()) {
            System.out.print(priorityQueue.poll() + " ");
        }
    }
}

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
public class a9 {
    Node insertEnd(Node head, int data) {
    Node n = new Node(data);
    if (head == null) return n;
    Node c = head;
    while (c.next != null) c = c.next;
    c.next = n;
    return head;
}
}

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
public class a16 {
    Node insert(Node head, int data) {
    Node n = new Node(data);
    if (head == null) { n.next = n; return n; }
    Node c = head;
    while (c.next != head) c = c.next;
    c.next = n; n.next = head;
    return head;
}
}

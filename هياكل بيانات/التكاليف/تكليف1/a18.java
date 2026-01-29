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
public class a18 {
    void split(Node head) {
    Node slow = head, fast = head;
    while (fast.next != head && fast.next.next != head) {
        slow = slow.next;
        fast = fast.next.next;
    }
    Node head1 = head;
    Node head2 = slow.next;
    slow.next = head1;
    if (fast.next.next == head) fast = fast.next;
    fast.next = head2;
}
}

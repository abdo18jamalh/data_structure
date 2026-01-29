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
public class a13 {
    DNode insertEnd(DNode head, int data) {
    DNode n = new DNode(data);
    if (head == null) return n;
    DNode c = head;
    while (c.next != null) c = c.next;
    c.next = n; n.prev = c;
    return head;
}
}

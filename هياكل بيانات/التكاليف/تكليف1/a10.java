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
public class a10 {
    Node deleteAtPos(Node head, int pos) {
    if (pos == 0) return head.next;
    Node c = head;
    for (int i = 0; i < pos - 1; i++) c = c.next;
    c.next = c.next.next;
    return head;
}
}

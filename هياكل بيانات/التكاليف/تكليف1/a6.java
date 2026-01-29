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
public class a6 {
    Node rotate(Node head, int k) {
    if (head == null || k == 0) return head;
    Node c = head; int len = 1;
    while (c.next != null) { c = c.next; len++; }
    c.next = head;
    k %= len;
    for (int i = 0; i < len - k; i++) c = c.next;
    head = c.next;
    c.next = null;
    return head;
}
    
}

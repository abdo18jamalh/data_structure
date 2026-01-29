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
public class a17 {
    void traverseCircular(Node head) {
    if (head == null) return;
    Node c = head;
    do {
        System.out.print(c.data + " ");
        c = c.next;
    } while (c != head);
}
}

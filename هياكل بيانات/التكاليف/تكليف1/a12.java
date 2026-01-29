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
public class a12 {
    DNode insertBegin(DNode head, int data) {
    DNode n = new DNode(data);
    n.next = head;
    if (head != null) head.prev = n;
    return n;
}
}

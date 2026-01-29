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
public class a8 {
    Node insertBegin(Node head, int data) {
    Node n = new Node(data);
    n.next = head;
    return n;
}
}

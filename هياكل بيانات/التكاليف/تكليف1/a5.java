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
public class a5 {
    void concat(Node h1, Node h2) {
    if (h1 == null) return;
    Node c = h1;
    while (c.next != null) c = c.next;
    c.next = h2;
}
    
}

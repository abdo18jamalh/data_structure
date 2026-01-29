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
public class a14 {
    void traverse(DNode head) {
    while (head != null) {
        System.out.print(head.data + " ");
        head = head.next;
    }
}
}

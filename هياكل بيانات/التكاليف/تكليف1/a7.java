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
public class a7 {
    int search(Node head, int key) {
    int i = 0;
    while (head != null) {
        if (head.data == key) return i;
        head = head.next; i++;
    }
    return -1;
}
}

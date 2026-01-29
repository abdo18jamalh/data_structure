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
public class a15 {
    void removeDuplicates(DNode head) {
    HashSet<Integer> set = new HashSet<>();
    DNode c = head;
    while (c != null) {
        if (set.contains(c.data)) {
            c.prev.next = c.next;
            if (c.next != null) c.next.prev = c.prev;
        } else set.add(c.data);
        c = c.next;
    }
}
}

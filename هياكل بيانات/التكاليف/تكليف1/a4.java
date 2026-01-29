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
public class a4 {
    void reverseArray(int[] arr) {
    for (int i = 0; i < arr.length / 2; i++) {
        int t = arr[i];
        arr[i] = arr[arr.length - 1 - i];
        arr[arr.length - 1 - i] = t;
    }
}
    
}

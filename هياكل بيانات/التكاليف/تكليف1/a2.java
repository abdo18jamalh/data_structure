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
public class a2 {
    int[] removeRandom(int[] arr) {
    int idx = (int)(Math.random() * arr.length);
    int[] res = new int[arr.length - 1];
    for (int i = 0, j = 0; i < arr.length; i++)
        if (i != idx) res[j++] = arr[i];
    return res;
}
    
}

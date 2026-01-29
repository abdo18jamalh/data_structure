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
public class a3 {
    int[] removeElement(int[] arr, int val) {
    int c = 0;
    for (int x : arr) if (x != val) c++;
    int[] res = new int[c];
    for (int i = 0, j = 0; i < arr.length; i++)
        if (arr[i] != val) res[j++] = arr[i];
    return res;
}
}

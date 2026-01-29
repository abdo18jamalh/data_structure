/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_strucure;

import java.util.Stack;

/**
 *
 * @author hp-omen
 */
public class ases1 {
    package assignment1;

import java.util.Stack;

/*
 Q1: Reverse a string using Stack
*/
public class Q1_ReverseString {

    public static String reverseString(String input) {

        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseString("DataStructure"));
    }
}
    
}

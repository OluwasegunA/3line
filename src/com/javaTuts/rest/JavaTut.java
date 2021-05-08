/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaTuts.rest;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author user
 */
public class JavaTut {


    public int smallestArray(int [] A) {
        
        int N = A.length +1;
        Set<Integer> newNum = new HashSet<>();
        for (int a : A) {
            if (a > 0) {
                newNum.add(a);
            }
        }
        for (int i = 1; i <= N; i++) {
            if (!newNum.contains(i)) {
                return i;
            }
        }
        return (N + 1);
    }
    
    
    public static void main(String[] args) {
        int [] A = {-1, -3};
	JavaTut printNumber = new JavaTut();
        System.out.println(printNumber.smallestArray(A));
    }
}




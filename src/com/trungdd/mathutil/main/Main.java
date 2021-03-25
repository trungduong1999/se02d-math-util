/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trungdd.mathutil.main;

import com.trungdd.mathutil.MathUtility;

/**
 *
 * @author Trung Duong
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.out.println("Welcome to GitHub");
        //Test trau bo, dung mat nhin
        
        long expected = 120; // tra ve 120
        long actual;        // neu tui dua vao 5
        int input = 5;      // dau vao 5
        actual = MathUtility.getFactorial(input);
        System.out.println("5! Expected: " + expected + "; Actual: " + actual);
        
        // test case, 1 tinh huong xai ham
        expected = 1;
        input = 0;
        actual = MathUtility.getFactorial(input);
        System.out.println("0! Expected: " + expected + "; Actual: " + actual);
        
        expected = 2;
        input = 2;
        actual = MathUtility.getFactorial(input);
        System.out.println("2! Expected: " + expected + "; Actual: " + actual);
        
         //case4 -1
         //expected = ???? ngoai le k so sanh dc
         // ma no chi xuat hien th
         input = -1;
         actual = MathUtility.getFactorial(input);
         
        
    }
    
}

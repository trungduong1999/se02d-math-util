/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trungdd.mathutil;

/**
 *
 * @author Trung Duong
 */
public class MathUtility {
    
    // this is class math, chứa các hàm xài chung
    // không lưu lại điều gì => static
    public static final double PI = 3.1415;
    
    
    //ham tính n!
    // n! tang nhanh ve gia trị. 21! tràn kiểu long, hơn 18 số 0.. bài này tính từ k tới 20! số am k tính đc, 0!=1!=1
    public  static long getFactorial(int n){
        if(n < 0 || n >20)
            throw new IllegalArgumentException("n must be between 0 -> 20");
        // nếu ngc lại n = 0 -> 20
        if(n ==0 || n==1)
            return 1;
        
        long result = 1;
        
        for (int i = 2; i <= n; i++) {
            result *=i;
        }
        
        
        return result;                
    }
    
}

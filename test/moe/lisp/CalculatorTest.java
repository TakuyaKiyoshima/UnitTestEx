/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moe.lisp;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
/**
 *
 * @author kiyoshima
 */
public class CalculatorTest {

    /**
     * 2引数とも正整数の場合のテスト</br>
     * 対象：multiply(int, int) </br>
     * 条件：引数10, 20 </br>
     * 期待する結果：戻り値 200 </br>
     */
    @Test
    public void testMultiply01() throws Exception {
        Calculator calc = new Calculator();
        int expected = 200;
        int actual = calc.multiply(10, 20);
        assertEquals(expected, actual);
    }

    /**
     * 引数の一方が正数,他方が負数の場合のテスト</br>
     * 対象：multiply(int, int) </br>
     * 条件：引数-10, 20 </br>
     * 期待する結果：戻り値 -200 </br>
     */  
    @Test
    public void testMultiply02() throws Exception {
        Calculator calc = new Calculator();
        int expected = -200;
        int actual = calc.multiply(-10, 20);
        assertEquals(expected, actual);
    }
    
    /**
     * 引数の一方が0,他方が負数の場合のテスト</br>
     * 対象：multiply(int, int) </br>
     * 条件：引数0, 20 </br>
     * 期待する結果：戻り値 0 </br>
     */  
    @Test
    public void testMultiply03() throws Exception {
        Calculator calc = new Calculator();
        int expected = 0;
        int actual = calc.multiply(0, -20);
        assertEquals(expected, actual);
    }
    
    
    // 練習1-c 
    // <,>,=で表せるa,b,cの大小関係13通り分
    
    
    /**
     * a < b < c の場合のテスト</br>
     * 対象：multiply(int, int) </br>
     * 条件：引数 10, 20, 30 </br>
     * 期待する結果：戻り値 30 </br>
     */  
    @Test
    public void testMax01() throws Exception {
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(10, 20, 30);
        assertEquals(expected, actual);
    }
  
    /**
     * a > b > c の場合のテスト</br>
     * 対象：multiply(int, int) </br>
     * 条件：引数 30, 20, 10 </br>
     * 期待する結果：戻り値 30 </br>
     */  
    @Test
    public void testMax02() throws Exception {
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(30, 20, 10);
        assertEquals(expected, actual);
    }
    
    /**
     * a > b = c の場合のテスト</br>
     * 対象：multiply(int, int) </br>
     * 条件：引数 30, 20, 20 </br>
     * 期待する結果：戻り値 30 </br>
     */  
    @Test
    public void testMax03() throws Exception {
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(30, 20, 20);
        assertEquals(expected, actual);
    }
    
    /**
     * a = b > c の場合のテスト</br>
     * 対象：multiply(int, int) </br>
     * 条件：引数 30, 30, 20 </br>
     * 期待する結果：戻り値 30 </br>
     */  
    @Test
    public void testMax04() throws Exception {
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(30, 30, 20);
        assertEquals(expected, actual);
    }
    
    /**
     * a = b = c の場合のテスト</br>
     * 対象：multiply(int, int) </br>
     * 条件：引数 30, 30, 30 </br>
     * 期待する結果：戻り値 30 </br>
     */  
    @Test
    public void testMax05() throws Exception {
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(30, 30, 30);
        assertEquals(expected, actual);
    }
    
    /**
     * b > a > c の場合のテスト</br>
     * 対象：multiply(int, int) </br>
     * 条件：引数 20, 30, 10 </br>
     * 期待する結果：戻り値 30 </br>
     */  
    @Test
    public void testMax06() throws Exception {
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(20, 30, 10);
        assertEquals(expected, actual);
    }
      
    /**
     * b > a = c の場合のテスト</br>
     * 対象：multiply(int, int) </br>
     * 条件：引数 20, 30, 20 </br>
     * 期待する結果：戻り値 30 </br>
     */  
    @Test
    public void testMax07() throws Exception {
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(20, 30, 20);
        assertEquals(expected, actual);
    }
    
    /**
     * c > a > b の場合のテスト</br>
     * 対象：multiply(int, int) </br>
     * 条件：引数 20, 10, 30 </br>
     * 期待する結果：戻り値 30 </br>
     */  
    @Test
    public void testMax08() throws Exception {
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(20, 10, 30);
        assertEquals(expected, actual);
    }
    
    /**
     * c = a > b の場合のテスト</br>
     * 対象：multiply(int, int) </br>
     * 条件：引数 30, 20, 30 </br>
     * 期待する結果：戻り値 30 </br>
     */  
    @Test
    public void testMax09() throws Exception {
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(30, 20, 30);
        assertEquals(expected, actual);
    }
    
    /**
     * c > a = b の場合のテスト</br>
     * 対象：multiply(int, int) </br>
     * 条件：引数 20, 20, 30 </br>
     * 期待する結果：戻り値 30 </br>
     */  
    @Test
    public void testMax10() throws Exception {
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(20, 20, 30);
        assertEquals(expected, actual);
    }
    
    /**
     * a > c > b の場合のテスト</br>
     * 対象：multiply(int, int) </br>
     * 条件：引数 30, 10, 20 </br>
     * 期待する結果：戻り値 30 </br>
     */  
    @Test
    public void testMax11() throws Exception {
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(30, 10, 20);
        assertEquals(expected, actual);
    }
    
    /**
     * b > c > a の場合のテスト</br>
     * 対象：multiply(int, int) </br>
     * 条件：引数 10, 30, 20 </br>
     * 期待する結果：戻り値 30 </br>
     */  
    @Test
    public void testMax12() throws Exception {
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(10, 30, 20);
        assertEquals(expected, actual);
    }
    
    /**
     * b = c > a の場合のテスト</br>
     * 対象：multiply(int, int) </br>
     * 条件：引数 20, 30, 30 </br>
     * 期待する結果：戻り値 30 </br>
     */  
    @Test
    public void testMax13() throws Exception {
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(20, 30, 30);
        assertEquals(expected, actual);
    }
}


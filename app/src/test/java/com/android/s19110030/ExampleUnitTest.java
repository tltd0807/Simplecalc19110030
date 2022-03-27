package com.android.s19110030;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.math.BigInteger;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    private Calculator mCalculator;
    @Before
    public void setUp() {
        mCalculator = new Calculator();
    }
    /**
     * Test add function
     */
    //1. add 2 possitive
    @Test
    public void addPossitiveNumbers() {
        double resultAdd = mCalculator.add(2.2d, 1.8d);
        assertThat(resultAdd, is(equalTo(4d)));
    }
    //2. add 2 negative
    @Test
    public void addNegativeNumbers() {
        double resultAdd = mCalculator.add(-2d, -1d);
        assertThat(resultAdd, is(equalTo(-3d)));
    }
    //3. add 1 negative 1 possitive
    @Test
    public void addNumbers() {
        double resultAdd = mCalculator.add(-2d, 1d);
        assertThat(resultAdd, is(equalTo(-1d)));
    }
    //4. add 1 negative, decimal with 1 possitive, decimal
    @Test
    public void addTwoDifferentNumbers() {
        double resultAdd = mCalculator.add(-2.1d, 1d);
        assertThat(resultAdd, is(equalTo(-1.1d)));
    }
    //5. add 2 negative, decimal ==> fail because
    @Test
    public void addTwoSameNumbers() {
        double resultAdd = mCalculator.add(-2.1d, -2.1d);
        assertThat(resultAdd, is(equalTo(-4.2d)));
    }
    //Fail test case
    //6. add 2 negative, decimal ==> false because result=-4810000000000000000005
    @Test
    public void addNumbers2() {
        double resultAdd = mCalculator.add(-2.91d, -1.9d);
        assertThat(resultAdd, is(equalTo(-4.81d)));
    }
    /**
     * Test sub function
     */
    //1. sub 2 possitive
    @Test
    public void subPossitiveNumbers() {
        double resultAdd = mCalculator.sub(2.1d, 1.1d);
        assertThat(resultAdd, is(equalTo(1d)));
    }
    //2. sub 2 negative
    @Test
    public void subNegativeNumbers() {
        double resultAdd = mCalculator.sub(-2d, -1d);
        assertThat(resultAdd, is(equalTo(-1d)));
    }
    //3. sub 1 negative 1 possitive
    @Test
    public void subNumbers() {
        double resultAdd = mCalculator.sub(-2d,3d);
        assertThat(resultAdd, is(equalTo(-5d)));
    }
    //4. sub 1 negative, decimal with 1 possitive, decimal
    @Test
    public void SubTwoDifferentNumbers() {
        double resultAdd = mCalculator.sub(-2.1d, 1d);
        assertThat(resultAdd, is(equalTo(-3.1d)));
    }
    //5. sub 2 negative, decimal ==> fail because
    @Test
    public void subTwoSameNumbers() {
        double resultAdd = mCalculator.sub(-2.1d, -2.1d);
        assertThat(resultAdd, is(equalTo(0d)));
    }
    //Fail test case
    //6. sub 2 negative, decimal ==> false because result=-1.0100000000000002
    @Test
    public void subNumbers2() {
        double resultAdd = mCalculator.sub(-2.91d, -1.9d);
        assertThat(resultAdd, is(equalTo(-1.01d)));
    }
    /**
     * Test mul function
     */
    //1. mul 2 possitive
    @Test
    public void mulPossitiveNumbers() {
        double resultAdd = mCalculator.mul(2d, 17d);
        assertThat(resultAdd, is(equalTo(34d)));
    }
    //2. mul 2 negative
    @Test
    public void mulNegativeNumbers() {
        double resultAdd = mCalculator.mul(-2d, -2d);
        assertThat(resultAdd, is(equalTo(4d)));
    }
    //3. mul 1 negative 1 possitive
    @Test
    public void mulNumbers() {
        double resultAdd = mCalculator.mul(-2d,3d);
        assertThat(resultAdd, is(equalTo(-6d)));
    }
    //4. mul 1 negative, decimal with 1 possitive, decimal
    @Test
    public void mulTwoDifferentNumbers() {
        double resultAdd = mCalculator.mul(-2.1d, 2d);
        assertThat(resultAdd, is(equalTo(-4.2d)));
    }
    //5. mul 2 negative, decimal ==> fail because
    @Test
    public void mulTwoSameNumbers() {
        double resultAdd = mCalculator.mul(-2.1d, -2.1d);
        assertThat(resultAdd, is(equalTo(4.41d)));
    }
    //6. mul 2 negative, decimal
    @Test
    public void mulNumbers2() {
        double resultAdd = mCalculator.mul(-2.91d, -1.9d);
        assertThat(resultAdd, is(equalTo(5.529d)));
    }
    //Fail test case
    //7. result =2.310000000000000005
    @Test
    public void mulPossitiveOddNumbers() {
        double resultAdd = mCalculator.mul(2.1d, 1.1d);
        assertThat(resultAdd, is(equalTo(2.31d)));
    }
    /**
     * Test div function
     */
//1. div 2 possitive
    @Test
    public void divPossitiveNumbers() {
        double resultAdd = mCalculator.div(17d, 2d);
        assertThat(resultAdd, is(equalTo(8.5d)));
    }
    //2. div 2 negative
    @Test
    public void divNegativeNumbers() {
        double resultAdd = mCalculator.div(-6d, -2d);
        assertThat(resultAdd, is(equalTo(3d)));
    }
    //3. div 1 negative 1 possitive
    @Test
    public void divNumbers() {
        double resultAdd = mCalculator.div(-6d,3d);
        assertThat(resultAdd, is(equalTo(-2d)));
    }
    //4. div 1 negative, decimal with 1 possitive, decimal
    @Test
    public void divTwoDifferentNumbers() {
        double resultAdd = mCalculator.div(-2.2d, 2d);
        assertThat(resultAdd, is(equalTo(-1.1d)));
    }
    //5. div 2 negative, decimal
    @Test
    public void divTwoSameNumbers() {
        double resultAdd = mCalculator.div(-2.1d, -2.1d);
        assertThat(resultAdd, is(equalTo(1d)));
    }
    // div to 0
    @Test(expected = IllegalArgumentException.class)
    public void divZeroNumber(){
        mCalculator.div(99d,0d);
    }
    /**
     * Test exp function
     */
//1. exp 2 possitive
    @Test
    public void expPossitiveNumbers() {
        double resultAdd = mCalculator.exp(17d, 2d);
        assertThat(resultAdd, is(equalTo(289d)));
    }
    //2. exp 2 negative
    @Test
    public void expNegativeNumbers() {
        double resultAdd = mCalculator.exp(-6d, -2d);
        assertThat(resultAdd, is(equalTo(-1/36d)));
    }
    //3. exp 1 negative 1 possitive
    @Test
    public void expNumbers() {
        double resultAdd = mCalculator.exp(-6d,3d);
        assertThat(resultAdd, is(equalTo(-216d)));
    }
    //4. exp 1 possitive with 1 negative
    @Test
    public void expTwoDifferentNumbers() {
        double resultAdd = mCalculator.exp(2d, -2d);
        assertThat(resultAdd, is(equalTo(1/4d)));
    }
    //5. exp 2 negative, decimal
    @Test
    public void expTwoSameNumbers() {
        double resultAdd = mCalculator.exp(-2d, -2.5d);
        assertThat(resultAdd, is(equalTo(-0.1767766952966369d)));
    }
    //6.Fail result=-4.840000000000001
    @Test
    public void expTwoDifferentNumbersFail() {
        double resultAdd = mCalculator.exp(-2.2d, 2d);
        assertThat(resultAdd, is(equalTo(-4.84d)));}
    /**
     * Test fac function
     */
//1. fac 1 possitive
    @Test
    public void facPossitiveNumbers() {
        BigInteger resultAdd = mCalculator.fac(5d);
        assertThat(resultAdd, is(equalTo(BigInteger.valueOf(120))));
    }
    //2. fac 1 negative
    @Test(expected = IllegalArgumentException.class)
    public void facNegativeNumber(){
        mCalculator.fac(-6);
    }

    //3. fac 1 realNumber
    @Test(expected = IllegalArgumentException.class)
    public void facFloatNumber(){
        mCalculator.fac(6.6);
    }

    //4. fac 0
    @Test
    public void facTwoDifferentNumbers() {
        BigInteger resultAdd = mCalculator.fac( 0d);
        assertThat(resultAdd, is(equalTo(BigInteger.valueOf(1))));
    }
    //5. fac result big num
    @Test
    public void facTwoSameNumbers() {
        BigInteger resultAdd = mCalculator.fac( 20d);
        assertThat(resultAdd, is(equalTo(BigInteger.valueOf((long) 2432902008176640000d))));
    }
    /**
     * Test LOG
     */
    //1. 2 normal number
    @Test
    public void logNormalNumbers() {
        double resultLog = mCalculator.log(8d, 2d);
        assertThat(resultLog, is(equalTo(3d)));
    }
    //2. 2 real positive number
    @Test
    public void logTwoNumberFloat(){
        double resultLog = mCalculator.log(8.1d,1.5d);
        assertThat(resultLog, is(equalTo(5.159171578138246)));
    }
    //3. 1 real and 1 int
    @Test
    public void log1Real1IntegerNumber(){
        double resultLog = mCalculator.log(3.3d,2d);
        assertThat(resultLog, is(equalTo(1.7224660244710912d)));
    }
    //4.Negative radix
    @Test(expected = IllegalArgumentException.class)
    public void logOneNegativeRadix(){
        mCalculator.log(4d,-9d);
    }
    //5. radix=1
    @Test(expected = IllegalArgumentException.class)
    public void logOneRadix(){
        mCalculator.log(2d,1d);
    }
}
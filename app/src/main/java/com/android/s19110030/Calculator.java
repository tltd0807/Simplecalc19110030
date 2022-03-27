package com.android.s19110030;

import java.math.BigInteger;

public class Calculator {
    // Available operations
    public enum Operator {ADD, SUB, DIV, MUL, EXP, FAC, LOG}

    /**
     * Addition operation
     */
    public double add(double firstOperand, double secondOperand) {
        return firstOperand + secondOperand;
    }

    /**
     * Subtract operation
     */
    public double sub(double firstOperand, double secondOperand) {
        return firstOperand - secondOperand;
    }

    /**
     * Divide operation
     */
    public double div(double firstOperand, double secondOperand) {
        if (secondOperand==0){
            throw new IllegalArgumentException("Second Operand cannot equal 0");

        }else{
            return firstOperand / secondOperand;
        }
    }

    /**
     * Multiply operation
     */
    public double mul(double firstOperand, double secondOperand) {
        return firstOperand * secondOperand;
    }

    /**
     * Exponential operation
     */
    public double exp(double firstOperand, double secondOperand) {
        if (firstOperand>0) return (double) Math.pow( firstOperand, secondOperand);
        return -1 * Math.pow(-firstOperand, secondOperand);
    }
    /**
     *  Factorials operation
     */
    public BigInteger fac(double firstOperand) {
        if (firstOperand==(int)firstOperand && firstOperand>=0){
        BigInteger result = BigInteger.ONE;
        for(int i=1; i<=(int)firstOperand;i++)
            result=result.multiply(BigInteger.valueOf(i));
        return result;
        }else{
            throw new IllegalArgumentException("First Operand must be interger and not negative");
        }
    }

    /**
     * Logarit operation
     */
    public double log(double firstOperand, double secondOperand) {
        if(firstOperand<0||secondOperand==1||secondOperand<=0){
            throw new IllegalArgumentException("First, Second Operand must be positive and First Operand different from 1");
        }else {return Math.log(firstOperand) / Math.log(secondOperand);}
    }
}

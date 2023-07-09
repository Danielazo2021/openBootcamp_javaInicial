package com.bigDecimal;

import java.math.BigDecimal;

public class classBigDecimal {
    public static void main(String[] args) {


    BigDecimal valorA= new BigDecimal(0.1);
    BigDecimal valorB= new BigDecimal(40);
    BigDecimal resultado= new BigDecimal(0);

    resultado= valorA.multiply(valorB);
    System.out.println(resultado);
    }
}

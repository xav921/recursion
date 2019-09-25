package edu.cnm.deepdive;

import java.math.BigInteger;

public class Factorial {

  public static void main(String[] args) {
    System.out.printf("%,d%n", factorial(100000));
  }

  public static BigInteger factorial(int n) {
    BigInteger product = BigInteger.ONE;
    for (int i = 2; i <= n; i++) {
      product = product.multiply(BigInteger.valueOf(i));
    }
    return product;
  }

}

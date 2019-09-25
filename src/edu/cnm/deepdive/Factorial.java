package edu.cnm.deepdive;

import java.math.BigInteger;

public class Factorial {

  public static void main(String[] args) {
    System.out.println(factorial(21));
  }

  public static BigInteger factorial(int n) {
    return (n <= 1) ? BigInteger.ONE : factorial(n - 1).multiply(BigInteger.valueOf(n));
//    long product = 1;
//    if (n > 1) {
//      product = n * factorial(n - 1);
//    }
//    return product;
  }

}

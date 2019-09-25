package edu.cnm.deepdive;

public class Palindromes {

  public static boolean isPalindrome(String input) {
    return isStrictPalindrome(input.replaceAll("[\\W_]", "").toLowerCase());
  }

  public static boolean isStrictPalindrome(String input) {
    return input.length() <= 1
        || (
        input.charAt(0) == input.charAt(input.length() - 1)
            && isStrictPalindrome(input.substring(1, input.length() - 1))
    );
  }

}

package com.redbee.academy.challenge;

public class CompareNumbers {

  /**
   * Method that receives two numbers and returns the
   * max of both
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @param c - Another Integer Number
   * @return The max of a, b and c
   */
  public static Integer max(Integer a, Integer b, Integer c) {
    if(a==null && c==null){
      return b;
    }
    if(a>b && a>c){
      return a;
    } else if(b>a && b>c){
      return b;
    }  else {
      return c;
    }
  }
}

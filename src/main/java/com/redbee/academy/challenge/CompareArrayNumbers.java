package com.redbee.academy.challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareArrayNumbers {

  /**
   * Method that receives two lists and returns
   * another list with de max of each index
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @return The result of a + b
   */
  public static List<Integer> max(List<Integer> a, List<Integer> b) {
    int sizeA = a.size();
    int sizeB = b.size();

    ArrayList<Integer> ArrayListGreater = new ArrayList<Integer>();
    if(sizeA == sizeB){
      for (int i =0; i<a.size(); i++){
        if(a.get(i)>b.get(i)){
          ArrayListGreater.add(a.get(i));
        } else if(a.get(i)<b.get(i)){
          ArrayListGreater.add(b.get(i));
        }
      }
    } else {
      for (int i =0; i<a.size(); i++){
          if(a.get(i)>b.get(i)){
            ArrayListGreater.add(a.get(i));
          } else {
            ArrayListGreater.add(b.get(i));
          }
        }
        ArrayListGreater.add(b.get(sizeB-1));
      }




    return ArrayListGreater;

  }



}

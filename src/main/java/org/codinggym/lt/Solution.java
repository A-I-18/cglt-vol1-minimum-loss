package org.codinggym.lt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    /* Enter your code here.
     * Read input from STDIN.
     * Print output to STDOUT. Your class should be named Solution. */
    Scanner scanner = new Scanner(System.in);
    int inputN = scanner.nextInt();
    List<Integer> inputValues = readIntList(scanner, inputN);
    scanner.close();

    int res = computeMinimumLoss(inputN, inputValues);
    System.out.println(res);
  }

  private static List<Integer> readIntList(Scanner scanner, int length) {
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < length-1; i++) {
      list.add(scanner.nextInt());
    }
    return list;
  }

  public static int computeMinimumLoss(int n, List<Integer> values) {
    // Compute all the possible differences between a value in the list and all the successive elements (discard the negative ones) (function)
    List<Integer> losses = computeLosses(values);
    // Extract the lower value (function)
    return Collections.min(losses);
  }

  private static List<Integer> computeLosses(List<Integer> values) {
    List<Integer> list = new ArrayList<>();

    for(int i = 0; i < values.size(); i++) {
      for(int j = i+1; j < values.size(); j++) {
        int loss = values.get(i)- values.get(j);
        if(loss >= 0) {
          list.add(loss);
        }
      }
    }

    return list;
  }

}

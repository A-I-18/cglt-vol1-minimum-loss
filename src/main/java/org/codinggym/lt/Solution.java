package org.codinggym.lt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Result {

  /*
   * Complete the 'minimumLoss' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts LONG_INTEGER_ARRAY price as parameter.
   */

  public static int minimumLoss(List<Long> price) {
    // Compute all the possible differences between a value in the list and all the successive elements (discard the negative ones) (function)
    List<Integer> losses = computeLosses(price);
    // Extract the lower value (function)
    return Collections.min(losses);
  }

  private static List<Integer> computeLosses(List<Long> values) {
    List<Integer> list = new ArrayList<>();

    for(int i = 0; i < values.size(); i++) {
      for(int j = i+1; j < values.size(); j++) {
        long loss = values.get(i) - values.get(j);
        if(loss >= 0) {
          list.add(Math.toIntExact(loss));
        }
      }
    }

    return list;
  }

}

public class Solution {
  public static void main(String[] args) {
    /* Enter your code here.
     * Read input from STDIN.
     * Print output to STDOUT. Your class should be named Solution. */
    Scanner scanner = new Scanner(System.in);
    int inputN = scanner.nextInt();
    List<Long> price = readLongList(scanner, inputN);
    scanner.close();

    int res = Result.minimumLoss(price);
    System.out.println(res);
  }

  private static List<Long> readLongList(Scanner scanner, int length) {
    List<Long> list = new ArrayList<>();
    for (int i = 0; i < length; i++) {
      list.add((long) scanner.nextInt());
    }
    return list;
  }

}

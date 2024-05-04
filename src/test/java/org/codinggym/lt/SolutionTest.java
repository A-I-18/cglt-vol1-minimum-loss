package org.codinggym.lt;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.codinggym.lt.Solution.computeMinimumLoss;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void testThreeYears() {
    //given
    int n = 3;
    List<Integer> values = Arrays.asList(5, 10, 3);

    int expected = 2;

    int actual = computeMinimumLoss(n, values);

    assertEquals(expected, actual);
  }

  @Test
  void testFiveYears() {
    //given
    int n = 5;
    List<Integer> values = Arrays.asList(20, 7, 8, 2, 5);

    int expected = 2;

    int actual = computeMinimumLoss(n, values);

    assertEquals(expected, actual);
  }

}
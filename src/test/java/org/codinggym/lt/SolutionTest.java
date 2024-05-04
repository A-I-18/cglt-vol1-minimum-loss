package org.codinggym.lt;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

  @Test
  void testThreeYears() {
    //given
    List<Long> values = Arrays.asList(5L, 10L, 3L);

    int expected = 2;

    int actual = Result.minimumLoss(values);

    assertEquals(expected, actual);
  }

  @Test
  void testFiveYears() {
    //given
    List<Long> values = Arrays.asList(20L, 7L, 8L, 2L, 5L);

    int expected = 2;

    int actual = Result.minimumLoss(values);

    assertEquals(expected, actual);
  }

}
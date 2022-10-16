package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void countOdds() {
        int result = solution.countOdds(3,7);
        Assertions.assertEquals(3,result);
    }
}
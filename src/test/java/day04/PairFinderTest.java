package day04;

import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PairFinderTest {

    @Test
    void findPairsRecurcion() {
        assertEquals(1, new PairFinder().findPairsRecurcion(new int[] {5, 1, 4, 5, 5}));
        assertEquals(4, new PairFinder().findPairsRecurcion(new int[] {7, 1, 5, 7, 3, 3, 5, 7, 6, 7}));
    }
}
package assignments.ex1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This JUnit class represents a very partial test class for Ex1.
 * Make sure you complete all the needed JUnits
 */

public class Ex1Test {
        @Test
        void computeNumberTest() {
            String s2 = "1011b2";
            int v = Ex1.number2Int(s2);
            assertEquals(v,11);
            String s10 = "1011bA";
            v = Ex1.number2Int(s10);
            s2 = Ex1.int2Number(v,2);
            int v2 = Ex1.number2Int(s2);
            assertEquals(v,v2);
            assertTrue(Ex1.equals(s10,s2));
        }

        @Test
        void isBasisNumberTest() {
            String[] good = {"1", "1b2", "01b2", "123bA", "ABbG", "0bA", "123", "01010101b2", "ABCbD", "65b7"};
            for(int i=0;i<good.length;i=i+1) {
                boolean ok = Ex1.isNumber(good[i]);
                assertTrue(ok);
            }
            String[] not_good = {"b2", "2b2", "1G3bG", " BbG", "0bbA", "abB", "!@b2", "A", "1bb2", "b", "-15bA"};
            for(int i=0;i<not_good.length;i=i+1) {
                boolean not_ok = Ex1.isNumber(not_good[i]);
                assertFalse(not_ok);
            }
        }
        @Test
        void int2NumberTest() {
            assertEquals("1011b2", Ex1.int2Number(11, 2));
            assertEquals("A5BCbG", Ex1.int2Number(42428, 16));
            assertEquals("1372CbE", Ex1.int2Number(48060, 14));
            assertEquals("0b2", Ex1.int2Number(0, 2));
            assertEquals("1234567b8", Ex1.int2Number(342391, 8));
            assertEquals("1000b5", Ex1.int2Number(125, 5));
            assertEquals("12b9", Ex1.int2Number(11, 9));
            assertEquals("200211001102101b3", Ex1.int2Number(10000000, 3));
            assertEquals("6247bD", Ex1.int2Number(13579, 13));
        }
        @Test
        void maxIndexTest() {
            String[] arr0 = {"10bA", "1bA", "2bA", "20bA"};
            assertEquals(3, Ex1.maxIndex(arr0));
            String[] arr1 = {"10", "100", "500", "0"};
            assertEquals(2, Ex1.maxIndex(arr1));
            String[] arr2 = {"ABCbG", "5bA", "A5bD", "0bD"};
            assertEquals(0, Ex1.maxIndex(arr2));
            String[] arr3 = {"10bA", "1bA", "2bA", "20bA"};
            assertEquals(3, Ex1.maxIndex(arr3));

        }

    @Test
    void number2intTest() {
        assertEquals(11, Ex1.number2Int("1011b2"));
        assertEquals(5, Ex1.number2Int("101b2"));
        assertEquals(27, Ex1.number2Int("123b4"));
        assertEquals(73, Ex1.number2Int("201b6"));
        assertEquals(13, Ex1.number2Int("13bA"));
        assertEquals(18878, Ex1.number2Int("AB12bC"));
        assertEquals(2564, Ex1.number2Int("D12bE"));
        assertEquals(7, Ex1.number2Int("012b5"));
        assertEquals(1, Ex1.number2Int("0001bA"));
        assertEquals(0, Ex1.number2Int("0b2"));
        assertEquals(1, Ex1.number2Int("1b3"));
        assertEquals(111, Ex1.number2Int("A1bB"));
        assertEquals(121, Ex1.number2Int("A1bC"));
        assertEquals(247, Ex1.number2Int("F7bG"));
        assertEquals(51, Ex1.number2Int("123b6"));
        assertEquals(11259375, Ex1.number2Int("ABCDEFbG"));
    }

    @Test
    void isNumberTest() {
        assertFalse(Ex1.isNumber("test"));
        assertFalse(Ex1.isNumber(""));
        assertFalse(Ex1.isNumber(null));
        assertFalse(Ex1.isNumber("b2"));
        assertFalse(Ex1.isNumber("1b"));
        assertFalse(Ex1.isNumber("b"));
        assertFalse(Ex1.isNumber("123b"));
        assertFalse(Ex1.isNumber("1234b11"));
        assertFalse(Ex1.isNumber("123b17"));
        assertFalse(Ex1.isNumber("123bH"));
        assertFalse(Ex1.isNumber("3 b4"));
        assertFalse(Ex1.isNumber("12 b 5"));
        assertFalse(Ex1.isNumber("123b 5"));
        assertFalse(Ex1.isNumber(" 100b2"));
        assertFalse(Ex1.isNumber("-123b4"));
        assertFalse(Ex1.isNumber("3b-5"));
        assertFalse(Ex1.isNumber("123Gb11"));

        assertTrue(Ex1.isNumber("123b4"));
        assertTrue(Ex1.isNumber("1b2"));
        assertTrue(Ex1.isNumber("0b2"));
        assertTrue(Ex1.isNumber("1FbG"));
        assertTrue(Ex1.isNumber("EFbG"));
        assertTrue(Ex1.isNumber("0123456789bA"));
        assertTrue(Ex1.isNumber("ABCDEFbG"));
        assertTrue(Ex1.isNumber("1234ABCbD"));
        assertTrue(Ex1.isNumber("123bG"));
        assertTrue(Ex1.isNumber("012b5"));
        assertTrue(Ex1.isNumber("0001bA"));
        assertTrue(Ex1.isNumber("000001b2"));
        assertTrue(Ex1.isNumber("1234567890ABCDEF1234567890ABCDEF1234bG"));
        assertTrue(Ex1.isNumber("FFFFbG"));
    }

    @Test
    void equalsTest() {
    assertTrue(Ex1.equals("111b2","21b3"));
    assertTrue(Ex1.equals("21b3","13b4"));
    assertTrue(Ex1.equals("44b5","40b6"));
    assertTrue(Ex1.equals("44b7","100000b2"));
    assertTrue(Ex1.equals("10b7","21b3"));
    assertTrue(Ex1.equals("A6bB","98bC"));
    assertTrue(Ex1.equals("42bC", "122b6"));

    assertFalse(Ex1.equals("4b3", "2b5"));
    assertFalse(Ex1.equals("1430b3","80b6"));
    assertFalse(Ex1.equals("11b0 ","15b4"));
    assertFalse(Ex1.equals("11b2 ","11"));
    assertFalse(Ex1.equals("22b3 ","22"));
    assertFalse(Ex1.equals("33b4 ","33"));
    assertFalse(Ex1.equals("44b5 ","44"));
    assertFalse(Ex1.equals("55b6 ","55"));
    assertFalse(Ex1.equals("66b7 ","66"));
    assertFalse(Ex1.equals("77b8 ","77"));
    assertFalse(Ex1.equals("88b9 ","88"));
    assertFalse(Ex1.equals("99bA ","99"));
    assertFalse(Ex1.equals("BBb13 ","11b3"));
    assertFalse(Ex1.equals("CDb13 ","250bA"));
    }

}

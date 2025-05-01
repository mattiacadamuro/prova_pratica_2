package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.lang.reflect.Method;

import org.junit.Before;
import org.junit.Test;

/**
 * A-TRIP Test
 * (Automatic): ok
 * (Thorough): ok
 * (Repeatable): ok
 * (Independent): ok
 * (Professional): ok
 */

 /**
  * Right - BICEP Test
  * (Right): checkRomanPrint()
  * (Boundary): 
  *   (Conformance): checkPrivateMethodOfPrintWithException()
  *   (Order): absent
  *   (Range): checkPrivateMethodOfPrint()
  *   (Reference): absent
  *   (Existence): checkPrivateMethodOfPrint()
  *   (Cardinality): absent
  *   (Time): absent
  * (Inverse): absent
  * (Cross-check): absent
  * (Error): absent
  * (Performance): absent
  */

/**
 * Unit test for simple App.
 */
public class RomanPrinterTest {

    RomanPrinter romanPrinter;
    Method printAsciiArt;

    // Set up the test
    @Before
    public void setUp() throws Exception {
        romanPrinter = new RomanPrinter();
        printAsciiArt = RomanPrinter.class.getDeclaredMethod("printAsciiArt", String.class);
        printAsciiArt.setAccessible(true);
    }

    // Make access to private method
    public String RomanPrinter_printAsciiArt(String romanNumber) {
        if(printAsciiArt != null){
            try {
                return (String) printAsciiArt.invoke(romanPrinter, romanNumber);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "";
    }

    // Check if the public method works
    @Test
    public void checkRomanPrint() {
        assertNotEquals("", RomanPrinter.print(1));
        assertEquals("", RomanPrinter.print(0));
        assertEquals("", RomanPrinter.print(-1));
    }

    // Check if the private method works
    @Test
    public void checkPrivateMethodOfPrint() {
        assertEquals("", RomanPrinter_printAsciiArt(""));
        assertEquals("", RomanPrinter_printAsciiArt(null));
        assertEquals("",RomanPrinter_printAsciiArt("A"));
    }

    // 
    @Test(timeout=1000)
    public void test() {
        for(int i = 1; i<=1000; i++){
            System.out.println(RomanPrinter.print(i) + "- " + i);
        }
    }
}
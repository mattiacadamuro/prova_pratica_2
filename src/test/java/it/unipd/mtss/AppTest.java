package it.unipd.mtss;

import org.junit.Test;
import org.junit.Before;

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
 * (Right): simpleUsage()
 * (Boundary):
 * (Conformance): conformanceTest()
 * (Order): absent
 * (Range): absent
 * (Reference): absent
 * (Existence): existenceTest()
 * (Cardinality): absent
 * (Time): absent
 * (Inverse): absent
 * (Cross-check): absent
 * (Error): checkPrivateMethodOfPrintWithException()
 * (Performance): absent
 */

public class AppTest {
    App app;

    @Before
    public void setUp() {
        app = new App();
    }

    @Test
    public void simpleUsage() {
        App.main(new String[] { "1", "5" });
        App.checkResult("1");
    }

    @Test
    public void conformanceTest() {
        App.main(new String[] { "A", "B" });
        App.checkResult("A");
    }

    @Test
    public void existenceTest() {
        App.main(new String[] {});
        App.main(null);
        App.checkResult(null);
        App.checkResult("");
        App.checkResult("-1");
    }
}
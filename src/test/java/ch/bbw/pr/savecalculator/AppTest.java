package ch.bbw.pr.savecalculator;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Before;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    private SaveCalculator test;

    @Before
    public void createSavCalculatorTeste() {
        test = new SaveCalculator();
    }

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }


    //erste Probe Tests
    @Test
    public void testSummeZweiPositiveIsOk() {
        int summand1 = 25;
        int summand2 = 10;
        assertEquals(35, test.summe(summand1, summand2));
    }

    @Test
    public void testSubtraktionZweiPositiveIsOk() {
        int minuend1 = 25;
        int minuend2 = 10;
        assertEquals(15, test.subtraktion(minuend1, minuend2));
    }
}


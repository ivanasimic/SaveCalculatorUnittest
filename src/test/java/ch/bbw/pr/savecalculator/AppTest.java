package ch.bbw.pr.savecalculator;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Before;

/**
 * Unit test for simple App:)
 * @author ivana simic
 */
public class AppTest 
{

    private SaveCalculator test;

    @Before
    public void createSavCalculatorTest() {
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

    // 8 Testfälle für die Addition

    //erster Test
    @Test
    public void testSummeZweiPositiveIsOk02() {
        int summand1 = 100;
        int summand2 = 44;
        assertEquals(144, test.summe(summand1, summand2));
    }

    //zweiter Test
    @Test
    public void testSummeEinePositiveEineNegativIsOk() {
        int summand1 = -5;
        int summand2 = 12;
        assertEquals(7, test.summe(summand1, summand2));
    }

    //dritter Test
    @Test
    public void testSummeMitEinerNullAddierenIsOk() {
        int summand1 = 80;
        int summand2 = 0;
        assertEquals(80, test.summe(summand1, summand2));
    }

    //vierter Test mit expected
    @Test (expected = ArithmeticException.class)
    public void testSummeMitDerGrösstenZahlAnDerGernzeDesZahlenbereichesIsOk() {
        int summand1 = 5;
        int summand2 = Integer.MAX_VALUE;
        test.summe(summand1, summand2);
    }

    //fünfter Test
    @Test
    public void testSummeMitDerKleinstenZahlAnDerGernzeDesZahlenbereichesIsOk() {
        int summand1 = 10;
        int summand2 = Integer.MIN_VALUE;
        test.summe(summand1, summand2);
    }

    //sechster Test
    @Test
    public void testSummeZweiNegativeZahlenIsOk() {
        int summand1 = -80;
        int summand2 = -20;
        assertEquals(-100, test.summe(summand1, summand2));
    }

    //siebter Test
    @Test
    public void testSummeZweiMalNullIsOk() {
        int summand1 = 0;
        int summand2 = 0;
        assertEquals(0, test.summe(summand1, summand2));
    }

    //achter Test
    @Test (expected = ArithmeticException.class)
    public void testSummeMitDerGrösstenZahlAnDerGernzeDesZahlenbereichesIsOk02() {
        int summand1 = Integer.MAX_VALUE;
        int summand2 = 2;
        test.summe(summand1, summand2);
    }

}


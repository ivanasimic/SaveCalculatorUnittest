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

    // 8 Testfälle für die Addition:

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

    // 8 Testfälle für die Subtraktion:


    //erster Test
    @Test
    public void testSubtraktionZweiPositiveIsOk02() {
        int minuend1 = 50;
        int minuend2 = 10;
        assertEquals(40, test.subtraktion(minuend1, minuend2));
    }

    //zweiter Test
    @Test
    public void testSubtraktionZweiPositiveIsOk03() {
        int minuend1 = 10;
        int minuend2 = 30;
        assertEquals(-20, test.subtraktion(minuend1, minuend2));
    }

    //dritter Test
    @Test
    public void testSubtraktionEinePositiveZahlEineNegativeZahlIsOk() {
        int minuend1 = 80;
        int minuend2 = -20;
        assertEquals(100, test.subtraktion(minuend1, minuend2));
    }

    //vierter Test
    @Test
    public void testSubtraktionEinePositiveZahlEineNegativeZahlIsOk02() {
        int minuend1 = -88;
        int minuend2 = 10;
        assertEquals(-98, test.subtraktion(minuend1, minuend2));
    }

    //fünfter Test
    @Test
    public void testSubtraktionMitNullIsOk02() {
        int minuend1 = 14;
        int minuend2 = 0;
        assertEquals(14, test.subtraktion(minuend1, minuend2));
    }

    //sechster Test
    @Test
    public void testSubtraktionMitDerGrösstenZahlAnDerGernzeDesZahlenbereichesIsOk() {
        int minuend1 = Integer.MAX_VALUE;
        int minuend2 = 40;
        test.subtraktion(minuend1, minuend2);
    }

    //siebter Test
    @Test  (expected = ArithmeticException.class)
    public void testSubtraktionMitDerKleinstenZahlAnDerGernzeDesZahlenbereichesIsOk() {
        int minuend1 = Integer.MIN_VALUE;
        int minuend2 = 40;
        test.subtraktion(minuend1, minuend2);
    }

    //achter Test
    @Test
    public void testSubtraktionZweiNegativeZahlenIsOk02() {
        int minuend1 = -22;
        int minuend2 = -22;
        assertEquals(0, test.subtraktion(minuend1, minuend2));
    }

    // 8 Testfälle für die Division:

    //erster Test
    @Test
    public void testDivisionZweiPositiveZahlenIsOk() {
        int dividend1 = 15;
        int dividend2 = 5;
        assertEquals(3, test.division(dividend1, dividend2));
    }

    //zweiter Test
    @Test
    public void testDivisionEineNegativeZahlnIsOk() {
        int dividend1 = 80;
        int dividend2 = -40;
        assertEquals(-2, test.division(dividend1, dividend2));
    }

    //dritter Test
    @Test
    public void testDivisionZweiNegativeZahlenIsOk() {
        int dividend1 = -64;
        int dividend2 = -8;
        assertEquals(8, test.division(dividend1, dividend2));
    }

    //vierter Test
    @Test (expected = ArithmeticException.class)
    public void testDivisionMitNullIsOk() {
        int dividend1 = 4;
        int dividend2 = 0;
        test.division(dividend1, dividend2);
    }

    //fünfter Test
    @Test
    public void testDivisionMitDerGrösstenZahlAnDerGernzeDesZahlenbereichesIsOk() {
        int dividend1 = Integer.MAX_VALUE;
        int dividend2 = 5;
        test.division(dividend1, dividend2);
    }

    //sechster Test
    @Test
    public void testDivisionZweiPositiveZahlenIsOk02() {
        int dividend1 = 90;
        int dividend2 = 5;
        assertEquals(18, test.division(dividend1, dividend2));
    }

    //siebter Test
    @Test (expected = ArithmeticException.class)
    public void testDivisionZweiMallNullZahlenIsOk() {
        int dividend1 = 0;
        int dividend2 = 0;
        test.division(dividend1, dividend2);
    }

    //achter Test
    @Test
    public void testDivisionZweiNegativeZahlenIsOk02() {
        int dividend1 = -14;
        int dividend2 = -7;
        assertEquals(2, test.division(dividend1, dividend2));
    }
}


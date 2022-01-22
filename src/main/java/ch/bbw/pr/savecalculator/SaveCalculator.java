package ch.bbw.pr.savecalculator;

/**
 * SaveCalculator
 * Rechnet 'vorsichtig' mit Zahlen.
 * Warnt, wenn etwas nicht geht.
 *   
 * @author ivana simic
 * @version 0.0.1
 */
public class SaveCalculator {
	public int summe(int summand1, int summand2) throws ArithmeticException
	{
		long value = (long) summand1 + (long) summand2;
		if ((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)){
			throw new ArithmeticException();
		}
		return summand1 + summand2;
	}

	public int subtraktion(int minuend1, int minuend2) throws ArithmeticException
	{
		long value = (long) minuend1 - (long) minuend2;
		if ((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)){
			throw new ArithmeticException();
		}
		return minuend1 - minuend2;
	}

	public int division(int value1, int value2)
	{
		long value = (long) value1 / (long) value2;
		if ((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)){
			throw new ArithmeticException();
		}else if(value2 == 0){
			throw new ArithmeticException();
		}else {
			return value1 / value2;
		}
	}



	private double multiplication(Integer value1, Integer value2) throws ArithmeticException
	{
		long value = (long) value1 * (long) value2;
		if ((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)){
			throw new ArithmeticException();
		}
		return value1 * value2;
	}
}

package com.jap.calculator;

public class MathematicalCalculator {

	public int add(int num1, int num2)
	{
		int result;
		 result = num1 + num2;
		return result;
	}
	public int subtract(int num1, int num2)
	{
		int result;
		result = num1 - num2;
		return result;
	}
	public int multiply(int num1, int num2)
	{
		int result;
		result = num1 * num2;
		return result;
	}
	public int divide(int num1, int num2)
	{
		//write the code and handle the ArithmeticException
		int result = 0;
		try {
			result = num1 / num2;

		}
		catch (ArithmeticException e){
			System.out.println(e.toString());
		}

		return result;

	}
	public int modulo(int num1, int num2)
	{
		int result;
		result = num1 % num2;
		return result;
	}
}

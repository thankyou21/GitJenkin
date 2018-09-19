package com.cg.test;

import org.junit.Test;

import com.cg.bean.Calculator;

import junit.framework.Assert;

public class TestCalculator {

	@Test
	public void test_add()
	{
		Calculator calc = new Calculator();
		int res = calc.add(3,4);
		Assert.assertEquals(7, res);
	}
	
	@Test
	public void test_sub()
	{
		Calculator calc = new Calculator();
		int res = calc.sub(14,4);
		Assert.assertEquals(10, res);
	}
	
	
	@Test
	public void test_mul()
	{
		Calculator calc = new Calculator();
		int res = calc.mul(3,4);
		Assert.assertEquals(12, res);
	}
	
	@Test
	public void test_square()
	{
		Calculator calc = new Calculator();
		int res = calc.square(4);
		Assert.assertEquals(16, res);
	}
	
}

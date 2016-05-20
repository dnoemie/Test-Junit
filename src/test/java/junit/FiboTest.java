package junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FiboTest {
	
	@BeforeClass
	public static void beforeAll(){
		System.out.println("avant tous");	
	}
	
	@AfterClass 
	public static void afterAll(){
		System.out.println("après tous");
	}
	
	@Before
	public void beforeAech(){
		System.out.println("avant");
		
	}
	
	@After
	public void afterAech(){
		System.out.println("après");
	}
	
	@Test
	public void fiboPositifOrZero() {
		assertEquals("0 => 0", 0, Fibo.fib(0));
		assertEquals("1 => 1", 1, Fibo.fib(1));
		assertEquals("2 => 1", 1, Fibo.fib(2));
		assertEquals("3 => 2", 2, Fibo.fib(3));
		assertEquals("4 => 3", 3, Fibo.fib(4));
		assertEquals("24 => 46368", 46368, Fibo.fib(24));
		assertEquals("46 => 1836311903", 1836311903, Fibo.fib(46));
	}

	
	@Test(expected=IllegalArgumentException.class)
	public void fiboNegatif() {
		Fibo.fib(-1);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void fiboTooBigN() {
		Fibo.fib(47);
	}
}

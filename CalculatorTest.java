import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
	public CalculatorTest(String name)
	{
		super(name);
	}
	
	
	public void test() {
		Calculator cc=new Calculator();
		//cc.factorial(4);
		assertEquals(120,cc.factorial(5));
		assertEquals(24,cc.factorial(4));
	}

}

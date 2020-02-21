import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;
@RunWith(Parameterized.class)
public class PrimeTest {
	private Integer inputNumber;
	private Boolean expectedResult;
	private Prime prime;
	@Before
	public void initialize()
	{
		prime=new Prime();
	}
	public PrimeTest(Integer inputNumber,Boolean expectedResult)
	{
		this.inputNumber=inputNumber;
		this.expectedResult=expectedResult;
	}
	@Parameterized.Parameters
	public static List<Object[]> primeNumber()
	{
		return Arrays.asList(new Object[][] {
			{2,true},{6,false},{19,true},{22,false},{23,true}
				});
	}

	@Test
	public void testPrimeNumberChecker() {
		System.out.println("Parameterized Number is:"+inputNumber);
		assertEquals(expectedResult,prime.validate(inputNumber));
	}

}

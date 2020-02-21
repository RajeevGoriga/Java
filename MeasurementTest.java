import static org.junit.Assert.*;

import junit.framework.TestCase;
import org.junit.Test;

public class MeasurementTest extends TestCase {
	public MeasurementTest(String name)
	{
		super(name);
	}
	

	
	public void testAddMeasurement() {
		Measurement m1=new Measurement(20);
		Measurement m2=new Measurement(40);
		m1.add(m2);
		assertEquals(60,m1.getValue());//pass
		assertEquals(40,m2.getValue());
		m1.subtract(m2);
		assertEquals(20,m1.getValue());
		assertEquals(40,m2.getValue());
		

	}

}

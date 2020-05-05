package ed20_jUnit_GeneradorIp;

import junit.extensions.ActiveTestSuite;
import junit.extensions.RepeatedTest;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.jupiter.api.Test;
 /**
  * Ejercicio 2 test repetido 1000 veces
  * Ip no empieza ni termina por 0
  * @author Mikel
  *
  */
public class GeneradorIpTest extends TestCase{
	public GeneradorIpTest(String testMethodName) {
		super(testMethodName);
	}
	GeneradorIp i1 = new GeneradorIp();
	@Test
	public void testGeneradorIp() {	
		String ip=i1.generarIp();
		assertTrue(ip.substring(0, 1)!="0");
		assertTrue(ip.substring(ip.length()-2, ip.length()-1)!="0");
	}
	
	@Test
	void testGeneradorNumerosTrue() {
		
		int ip=i1.generarNumero();
		assertTrue(ip>=0);
		assertTrue(ip<255);
		
	}
	
	@Test
	public static TestSuite suite() {
		TestSuite mySuite = new ActiveTestSuite();
		mySuite.addTest(new RepeatedTest(new GeneradorIpTest("testGeneradorNumerosTrue"), 1000));
		return mySuite;
	}

}

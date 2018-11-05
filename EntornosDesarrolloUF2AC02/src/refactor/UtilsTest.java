package refactor;

import static org.junit.Assert.*;

import org.junit.Test;

public class UtilsTest {

	@Test
	public void testSuma() {
		int resultadoReal = Utils.suma(2, 3);
		int resultadoEsperado = 5;
		assertEquals(resultadoReal, resultadoEsperado);
	}

}

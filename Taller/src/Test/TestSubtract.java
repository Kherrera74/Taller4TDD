package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import Operaciones.Operations;

class TestSubtract {

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		Operations op = new Operations();
		Integer result = op.subtract(12, 8);
		assertEquals(4, result);
	}

}

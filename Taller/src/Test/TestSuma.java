package Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class TestSuma {

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		Operations op = new Operations();
		op.sum(50,20);
		fail("Not yet implemented");
	}

}

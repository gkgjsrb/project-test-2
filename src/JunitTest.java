import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitTest {

	@Test
	void testMain() {
		fail("Not yet implemented");
	}

	@Test
	void testSum() {
		int result = Junit.sum(4, 2);
		assertTrue(result==4,"good");
	}

	@Test
	void testSub() {
		int result = Junit.sub(4, 2);
		assertTrue(result==2,"good");
	}

}

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CrimeReaderTest {

	@Test
	void testReadCrimes() {
		CrimeReader crTest = new CrimeReader();

		assertEquals(crTest.readCrimes("Thefts", "17", "getGeneralCode", "getDistrict").size(), 6352);

	}

}

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EstablishDataRatesTest {

    @Test
    void test() {
        String[] violentCodes = new String[] {"100", "200", "300", "400", "800", "900", "1500"};
        EstablishDataRates EDR = new EstablishDataRates();
        EDR.establishViolentCrimeRate(violentCodes);
    }

}

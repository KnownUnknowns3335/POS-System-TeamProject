package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HospitalStayCalculatorTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	
	
	@Test
    public void testCalculateTotal_ValidInput() {
        HospitalStayCalculator calc = new HospitalStayCalculator();
        double total = calc.calculateTotal(200.0, 5, 300.0, 100.0);
        assertEquals(1400.0, total, 0.001); // (200*5 + 300 + 100)
    }

    @Test
    public void testCalculateTotal_NegativeInputThrowsException() {
        HospitalStayCalculator calc = new HospitalStayCalculator();
        assertThrows(IllegalArgumentException.class, () -> {
            calc.calculateTotal(-200.0, 5, 300.0, 100.0);
        });
    }
    

}

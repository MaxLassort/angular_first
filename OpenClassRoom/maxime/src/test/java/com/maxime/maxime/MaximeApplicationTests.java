package com.maxime.maxime;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.maxime.maxime.model.BusinessService;
import com.maxime.maxime.model.HelloWorld;

@SpringBootTest
class MaximeApplicationTests {

	private BusinessService bs = new BusinessService();
	@Test
	void contextLoads() {
	}

	@Test
    public void testGetHelloWorld() {

        String expected = "Hello bitdchs";

        String result = bs.getHelloWorld().getValue();

        assertEquals(expected, result);
    }

}

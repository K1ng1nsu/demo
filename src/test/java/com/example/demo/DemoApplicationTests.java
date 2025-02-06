package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		int result = 5;
		assertEquals(5, result, "2 + 3은 5여야 합니다.");
	}

	@Test
	public void testAdd() {
		int result = 2 + 3;
		assertEquals(4, result, "2 + 3은 5여야 합니다. 의도적 오류 발생");
	}

}

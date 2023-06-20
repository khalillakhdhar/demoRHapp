package com.repo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoRHappApplicationTests {
ValidateUser vu;
@BeforeEach
void init()
{
vu=new ValidateUser();	
}
	
	
	@Test
	public void testValide()
	{
		String nom="Khalil";
		assertTrue(vu.validateName(nom));
		
		
	}
	@Test
	public void testInvalide()
	{
		String nom="user";
		assertTrue(vu.validateName(nom));
		
	}

}

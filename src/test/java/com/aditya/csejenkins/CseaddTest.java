package com.aditya.csejenkins;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CseaddTest {
     Cseadd c=new Cseadd();
	  
		@Test
		void test() {
			int result = c.add(2, 3); // Calls the add method
	        assertEquals(5, result);  // Verifies if 2 + 3 equals 5
		}

}

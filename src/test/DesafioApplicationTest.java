package test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.DesafioApplication;

public class DesafioApplicationTest {
	
		@Test
		public void fibonacci() {
			assertNotNull(DesafioApplication.fibonacci());
		}

		@Test
		public void isFibonacci() {
			assertTrue(DesafioApplication.isFibonacci(377));
		}

	}



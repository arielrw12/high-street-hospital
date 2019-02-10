package employees;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {
	
	Employee underTest;
	@Before
	public void setup() {
		underTest = new Surgeon("Anna", "456", "Surgeon");
	}

	@Test
	public void shouldHaveName() {
		underTest.getName();
		assertEquals("Anna", underTest.getName());
	}
	
}

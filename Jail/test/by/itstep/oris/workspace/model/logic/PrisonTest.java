package by.itstep.oris.workspace.model.logic;

import static org.junit.Assert.*;

import org.junit.Test;

import by.itstep.oris.workspace.model.entity.Prisoner;

public class PrisonTest {

	@Test
	public void testGetLongestTerm() {
		Prisoner[] prisoners = {new Prisoner("Bob", "Petty theft", 3),
								new Prisoner("Jack", "Public masturbation", 10)};
		int expected = 10;
		int actual = Prison.getLongestTerm(prisoners);
		
		assertEquals(expected, actual);
	}

}

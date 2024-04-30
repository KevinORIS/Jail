package by.itstep.oris.workspace.model.logic;

import static org.junit.Assert.*;

import org.junit.Test;

import by.itstep.oris.workspace.model.entity.Prisoner;

public class PrisonTest {

	@Test
	public void testGetLongestTerm() {
		Prisoner[] prisoners = {new Prisoner("Bob", "Petty theft", 3),
								new Prisoner("Jack", "Public masturbation", 10),
								new Prisoner("Andy", "Armed attack", 23)};
		int expected = 23;
		int actual = Prison.getLongestTerm(prisoners);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetShortestTerm() {
		Prisoner[] prisoners = {new Prisoner("Bob", "Petty theft", 3),
				new Prisoner("Jack", "Public masturbation", 10),
				new Prisoner("Andy", "Armed attack", 23)};
		int expected = 3;
		int actual = Prison.getShortestTerm(prisoners);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testCalcTotalTerm() {
		Prisoner[] prisoners = {new Prisoner("Bob", "Petty theft", 3),
				new Prisoner("Jack", "Public masturbation", 10),
				new Prisoner("Andy", "Armed attack", 23)};
		int expected = 36;
		int actual = Prison.calcTotalTerm(prisoners);
		
		assertEquals(expected, actual);
	}
}

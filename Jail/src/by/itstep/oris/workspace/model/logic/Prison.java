package by.itstep.oris.workspace.model.logic;

import by.itstep.oris.workspace.model.entity.Prisoner;

public class Prison {
	public static double getLongestTerm(Prisoner[] prisoners) {
		if(prisoners == null || prisoners.length == 0) {
			return 0;
		}
		
		double longestTerm = 0;
		
		for(Prisoner prisoner : prisoners) {
			if (longestTerm > prisoner.getTerm()) {
				longestTerm = prisoner.getTerm();
			}
		}
		
		return longestTerm;
	}
}

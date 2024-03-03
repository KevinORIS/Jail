package by.itstep.oris.workspace.model.logic;

import by.itstep.oris.workspace.model.entity.Prisoner;

public class Prison {
	public static double getLongestTerm(Prisoner[] prisoners) {
		if (prisoners == null || prisoners.length == 0) {
			return 0;
		}

		double longestTerm = 0;

		for (Prisoner prisoner : prisoners) {
			if (longestTerm > prisoner.getTerm()) {
				longestTerm = prisoner.getTerm();
			}
		}

		return longestTerm;
	}

	public static double getShortestTerm(Prisoner[] prisoners) {
		if (prisoners == null || prisoners.length == 0) {
			return 0;
		}

		double shortestTerm = 0;

		for (Prisoner prisoner : prisoners) {
			if (shortestTerm < prisoner.getTerm()) {
				shortestTerm = prisoner.getTerm();
			}
		}

		return shortestTerm;
	}

	public static double calcTotalTerm(Prisoner[] prisoners) {
		if (prisoners == null || prisoners.length == 0) {
			return 0;
		}

		double termSum = 0;

		for (Prisoner prisoner : prisoners) {

			termSum += prisoner.getTerm();

		}

		return termSum;

	}
}

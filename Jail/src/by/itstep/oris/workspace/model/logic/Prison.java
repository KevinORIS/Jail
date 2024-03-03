package by.itstep.oris.workspace.model.logic;

import java.util.HashMap;
import java.util.Map;

import by.itstep.oris.workspace.model.entity.Prisoner;

public class Prison {
	public static int getLongestTerm(Prisoner[] prisoners) {
		if (prisoners == null || prisoners.length == 0) {
			return 0;
		}

		int longestTerm = 0;

		for (Prisoner prisoner : prisoners) {
			if (longestTerm > prisoner.getTerm()) {
				longestTerm = prisoner.getTerm();
			}
		}

		return longestTerm;
	}

	public static int getShortestTerm(Prisoner[] prisoners) {
		if (prisoners == null || prisoners.length == 0) {
			return 0;
		}

		int shortestTerm = 0;

		for (Prisoner prisoner : prisoners) {
			if (shortestTerm < prisoner.getTerm()) {
				shortestTerm = prisoner.getTerm();
			}
		}

		return shortestTerm;
	}

	public static int calcTotalTerm(Prisoner[] prisoners) {
		if (prisoners == null || prisoners.length == 0) {
			return 0;
		}

		int termSum = 0;

		for (Prisoner prisoner : prisoners) {

			termSum += prisoner.getTerm();

		}

		return termSum;

	}
	
	public static String findLeastPopularArticle(Prisoner[] prisoners) {
        Map<String, Integer> articleCount = new HashMap<>();

        for (Prisoner prisoner : prisoners) {
        	articleCount.put(prisoner.getArticle(), 
            		articleCount.getOrDefault(prisoner.getArticle(), 0) + 1);
        }

        String leastPopularArticle = "";
        int minCount = 0;

        for (Map.Entry<String, Integer> entry : articleCount.entrySet()) {
            if (entry.getValue() < minCount) {
            	leastPopularArticle = entry.getKey();
                minCount = entry.getValue();
            }
        }

        return leastPopularArticle;
    }
}

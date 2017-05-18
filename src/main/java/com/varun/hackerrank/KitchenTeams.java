package com.varun.hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KitchenTeams {

	public String getPossibleTeams(String userInput) {
		String[] inputs = userInput.split(" ");
		Map<String, Integer> experts = new HashMap<String, Integer>();
		List<String> returnCounts = new ArrayList<String>();

		for (String s : inputs[1].split("")) {
			if (experts.containsKey(s)) {
				experts.replace(s, experts.get(s) + 1);
			} else {
				experts.put(s, 1);
			}
		}

		for (int i = 3; i < inputs.length; i++) {

			int count = 1;
			HashMap<String, Integer> replaceExperts = new HashMap<String, Integer>();
			for (String s : inputs[i].split("")) {
				if (experts.containsKey(s)) {
					int val = experts.get(s);
					count *= val;
					replaceExperts.put(s, val - 1);
				}
			}
			if (count > 0) {
				replaceExperts.forEach((k, v) -> experts.replace(k, v));
			}

			returnCounts.add(String.valueOf(count));
		}
		return String.join(" ", returnCounts);
	}
}

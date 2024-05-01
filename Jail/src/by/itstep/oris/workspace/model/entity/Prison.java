package by.itstep.oris.workspace.model.entity;

import java.util.ArrayList;

public class Prison {
	private ArrayList<Human> population;
	
	public Prison() {
		population = new ArrayList<Human>();
	}
	
	public void add(Human human) {
		population.add(human);
	}
	
	public void remove(Human human) {
		population.remove(human);
	}
}
	

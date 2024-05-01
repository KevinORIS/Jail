package by.itstep.oris.workspace.model.entity;

public class Human {
	protected String name;

	public Human() {
		name = "No name";
	}

	public Human(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}

package by.itstep.oris.workspace.model.entity;

public class Prisoner {
	private String name;
	private String article;
	private double term;

	public Prisoner() {
		name = "No name";
		article = "Unknown";
		term = 0;
	}

	public Prisoner(String name, String article, double term) {
		this.name = name;
		this.article = article;
		this.term = term;
	}
	
	public Prisoner(Prisoner prisoner) {
		this(prisoner.name, prisoner.article, prisoner.term);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArticle() {
		return article;
	}

	public void setArticle(String article) {
		this.article = article;
	}

	public double getTerm() {
		return term;
	}

	public void setTerm(double term) {
		this.term = term;
	}
	
	@Override
	public String toString() {
		return name + ":\narticle " + article + "\nterm " + term;
	}
}

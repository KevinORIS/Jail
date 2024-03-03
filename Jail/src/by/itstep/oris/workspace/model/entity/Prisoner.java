package by.itstep.oris.workspace.model.entity;

public class Prisoner {
	private String name;
	private String article;
	private int termInDays;

	public Prisoner() {
		name = "No name";
		article = "Unknown";
		termInDays = 0;
	}

	public Prisoner(String name, String article, int termInDays) {
		this.name = name;
		this.article = article;
		this.termInDays = termInDays;
	}
	
	public Prisoner(Prisoner prisoner) {
		this(prisoner.name, prisoner.article, prisoner.termInDays);
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

	public int getTerm() {
		return termInDays;
	}

	public void setTerm(int termInDays) {
		this.termInDays = termInDays;
	}
	
	@Override
	public String toString() {
		return name + ":\narticle " + article + "\nterm in days " + termInDays;
	}
}

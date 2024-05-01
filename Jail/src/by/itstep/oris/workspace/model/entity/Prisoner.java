package by.itstep.oris.workspace.model.entity;

import java.util.ArrayList;

public class Prisoner extends Human {
	private int termInYears;
	private double serviceNeed;
	private double riotousness;
	private double maintenancePayment;
	private Article currentArticle;
	private ArrayList<Article> pastArticles;

	{	
		riotousness = 0;
		termInYears = 0;
		serviceNeed = 1;
		maintenancePayment = 100;
		this.pastArticles = new ArrayList<Article>();
	}

	public Prisoner() {
		super();
		currentArticle = Article.UNKNOWN;
	}

	public Prisoner(String name) {
		super(name);
		currentArticle = Article.UNKNOWN;
	}

	public void jailForTheft() {
		if (currentArticle != Article.UNKNOWN) {
			pastArticles.add(currentArticle);
		}
		termInYears += 3;
		riotousness = 1;

		currentArticle = Article.THEFT;
	}

	public void jailForFraud() {
		if (currentArticle != Article.UNKNOWN) {
			pastArticles.add(currentArticle);
		}
		termInYears += 2;
		riotousness = 1;

		currentArticle = Article.FRAUD;
	}

	public void jailForViolence() {
		if (currentArticle != Article.UNKNOWN) {
			pastArticles.add(currentArticle);
		}
		termInYears += 10;
		riotousness = 4;
		maintenancePayment = 200;

		currentArticle = Article.VIOLENCE;
	}

	public void jailForDrugs() {
		if (currentArticle != Article.UNKNOWN) {
			pastArticles.add(currentArticle);
		}
		termInYears += 8;
		riotousness = 3;
		maintenancePayment = 150;

		currentArticle = Article.DRUGS;
	}
	
	public void jailForPublicMasturbration() {
		if (currentArticle != Article.UNKNOWN) {
			pastArticles.add(currentArticle);
		}
		termInYears += 4;
		
		currentArticle = Article.PUBLICMASTURBATION;
	}
	
	public Article getCurrentArticle() {
		return currentArticle;
	}
	
	public ArrayList<Article> getPastArticles() {
		return pastArticles;
	}
	
	public double getMaintenancePayment() {
		return maintenancePayment;
	}
	
	public double getRiotousness() {
		return riotousness;
	}
	
	public double getServiceNeed() {
		return serviceNeed;
	}
	
	public int getTermInDays() {
		return termInYears;
	}
	
	@Override
	public String toString() {
		return "Prisoner " + super.toString() 
		 + "\njailed for " + currentArticle
		 + "\nfor term of " + termInYears + " years.";
	}
	
	private enum Article {
		UNKNOWN, THEFT, FRAUD, VIOLENCE, DRUGS, PUBLICMASTURBATION
	}
}

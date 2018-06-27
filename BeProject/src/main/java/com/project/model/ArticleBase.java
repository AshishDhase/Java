package com.project.model;

public class ArticleBase {


	String article;
	
	public String getArticle() {
		return article;
	}
	
	public void setArticle(String article) {
		this.article = article;
	}
	
	@Override
	public String toString() {
		return "Article [article=" + article + "]";
	}
	
	
}

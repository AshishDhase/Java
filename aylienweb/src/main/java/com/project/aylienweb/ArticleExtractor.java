package com.project.aylienweb;


import com.aylien.textapi.parameters.ExtractParams;
import com.aylien.textapi.responses.Article;

import java.net.MalformedURLException;

import com.aylien.textapi.TextAPIClient;
import com.aylien.textapi.TextAPIException;

public class ArticleExtractor {
	public String getArticle(String URL) {
		//try {
		TextAPIClient client = new TextAPIClient("2b4d6582", "04edc6728dac11565864f02fb93226ce");
		ExtractParams.Builder builder = ExtractParams.newBuilder();
		java.net.URL url = null;
		try {
			url = new java.net.URL(URL);
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    builder.setUrl(url);
	    builder.setBestImage(true);
	    Article extract = null;
		try {
			extract = client.extract(builder.build());
		} catch (TextAPIException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    System.out.println("In sopln"+extract.getArticle());
		return extract.getArticle().toString();
	}

}

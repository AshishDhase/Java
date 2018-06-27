package com.project.aylienweb;

import com.aylien.textapi.TextAPIClient;

import com.aylien.textapi.parameters.SentimentParams;

import com.aylien.textapi.responses.Sentiment;

public class SentimentDemo {

	public String getSentiment(String article) throws Exception{
		TextAPIClient client = new TextAPIClient("2b4d6582", "04edc6728dac11565864f02fb93226ce");
		SentimentParams.Builder builder = SentimentParams.newBuilder();
	    builder.setText(article);
	    builder.setMode("document");
	    Sentiment sentiment = client.sentiment(builder.build());
	    System.out.println(sentiment);
		return sentiment.toString();
	}
}



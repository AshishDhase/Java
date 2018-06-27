package com.project.model;

import java.util.ArrayList;

import com.ibm.watson.developer_cloud.natural_language_understanding.v1.NaturalLanguageUnderstanding;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.AnalysisResults;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.AnalyzeOptions;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.Features;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.SentimentOptions;
import com.project.graph.GraphValues;

/*
import com.aylien.textapi.TextAPIClient;
import com.aylien.textapi.parameters.SentimentParams;
import com.aylien.textapi.responses.Sentiment;
*/

public class SentimentExtractor {
	
	/*
	private static final String USER_ID = "2b4d6582";
	private static final String USER_KEY = "04edc6728dac11565864f02fb93226ce";
	TextAPIClient client = new TextAPIClient(USER_ID, USER_KEY);
	SentimentParams.Builder builder = SentimentParams.newBuilder();
	
	public Sentiment getSentiment(String article) throws Exception {
	    builder.setText(article);
	    if ( article.length() <= 280) {
	    	System.out.println("Lenght of the article: "+article.length());
		    builder.setMode("tweet");
	    }
	    else {
	    	System.out.println("Lenght of the article: "+article.length());
	    	builder.setMode("document");
	    }
	    Sentiment sentiment = client.sentiment(builder.build());
	    System.out.println(sentiment.getPolarity());
	    System.out.println(sentiment.getPolarityConfidence());
	    System.out.println(sentiment.getText());
		return sentiment;
	}
	*/
	private static final String USER_ID = "d816084b-6e2e-4fd7-a15a-b14b437c98b2";
	private static final String USER_KEY = "PWzOFrCNFJYU";
	
	NaturalLanguageUnderstanding service = new NaturalLanguageUnderstanding(
			  "2018-03-16",
			  USER_ID,
			  USER_KEY
			);

	public String getSentiment(String article) throws Exception {
		String text = article;
        SentimentOptions sentiment = new SentimentOptions.Builder()
                .build();
        Features features = new Features.Builder()
                .sentiment(sentiment)
                .build();
        AnalyzeOptions parameters = new AnalyzeOptions.Builder()
                .text(text)
                .features(features)
                .build();
        AnalysisResults response = service
                .analyze(parameters)
                .execute();
        System.out.println(response);
        System.out.println(response.getSentiment().getDocument().getLabel());
        
        String result = response.getSentiment().getDocument().getLabel().toUpperCase();
        double score = response.getSentiment().getDocument().getScore();
		GraphValues g = new GraphValues();
		g.setGraphValues(score);
	
	
	
        return result;
	}
	
}

package com.project.graph;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.project.model.GraphBase;

public class GraphValues {
	private double positive;
	private double negative;
	private double middle = 50;
	private ArrayList result; 
	
	public void setGraphValues(double score) throws Exception{
		
		System.out.println("Sentiment score: "+score);
		if( score > 1) {
			System.out.println("In if for positive percent");
			score = score * 100;
			positive = middle + score;
			negative = 100 - positive;
			System.out.println("Positive Percentage: "+positive);
			System.out.println("Negative Percentage: "+negative);
		}else if( score == 0 ) {
			positive = middle;
			negative = middle;
		}else {
			System.out.println("In else for negative percent");
			score = score * 100;
			System.out.println("In negative score: "+score);
			
			negative = middle - score;
			System.out.println("Negative: "+negative);
			
			positive = 100 - negative;
			System.out.println("Positive: "+positive);
			
			System.out.println("Positive Percentage: "+positive);
			System.out.println("Negative Percentage: "+negative);
		}
		
		createNewJson(positive, negative);
		new GraphBase(positive, negative);
	}

	private void createNewJson(double positive2, double negative2) throws Exception{
		// TODO Auto-generated method stub
		
		JSONObject obj = new JSONObject();
		
		obj.put("positive_percent", positive2);
		obj.put("negative_percent", negative2);
		
/*		
		JSONArray graphResult = new JSONArray();
		graphResult.add("positive_per: "+positive2);
		graphResult.add("negative_per: "+negative2);
		obj.put("graph_result", graphResult);
	*/	
		FileWriter file = new FileWriter("G:\\15 JSP and Servlet\\workspace\\BeProject\\src\\main\\webapp\\graph_values.json");
		try{
			file.write(obj.toJSONString());
			System.out.println("Successfully Copied JSON Object to File...");
			System.out.println("\nJSON Object: " + obj);
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			file.flush();
			file.close();
		}
	}
}

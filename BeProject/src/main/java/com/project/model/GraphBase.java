package com.project.model;

public class GraphBase {
	
	private double positivePercent;
	private double negativePercent;
	
	public GraphBase(double positivePercent, double negativePercent) {
		super();
		System.out.println("In GraphBase:: Positive: "+positivePercent+" Negative: "+negativePercent);
		this.positivePercent = positivePercent;
		this.negativePercent = negativePercent;
	}
	
	
}

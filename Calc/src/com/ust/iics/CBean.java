package com.ust.iics;

public class CBean {
	private double num1;
	private double output;
	private double num2;
	String currency;
	
	public CBean() {
		
	}
	
	public CBean (double num1, double output, double num2, String currency){
		setnum1(num1);
		setOutput(output);
		setnum2(num2);
		setCurrency(currency);
		
	}
	public double getnum1() {
		return num1;
	}
	public void setnum1(double num1) {
		this.num1 = num1;
	}
	public double getOutput() {
		return output;
	}
	public void setOutput(double output) {
		this.output = output;
	}
	public double getnum2() {
		return num2;
	}
	public void setnum2(double num2) {
		this.num2 = num2;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	
	
	public void compute(){
		if (currency.equals("A")){
			setOutput(num1 + num2);
		}
		else if (currency.equals("Mi")){
			setOutput(num1 - num2);
		}
		else if (currency.equals("Mu")){
			setOutput(num1 * num2);
		}
		else if (currency.equals("D")){
			setOutput(num1 / num2);
		
		}
	
	}
}


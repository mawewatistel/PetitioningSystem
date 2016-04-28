package com.ust.iics.model;

public class ConvBean {
	private double peso;
	private double output;
	String currency;
	
	public ConvBean() {
		
	}
	public ConvBean(double peso, double output, String currency){
		setPeso(peso);
		setOutput(output);
		setCurrency(currency);
	}
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getOutput() {
		return output;
	}
	public void setOutput(double output) {
		this.output = output;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public void compute(){
		if (currency.equals("US Dollar")){
			setOutput(peso * 0.020912);
		}
		else if (currency.equals("Euro")){
			setOutput(peso * 0.018687);
		}
		else if (currency.equals("British Pound")){
			setOutput(peso * 0.014496);
		}
		else if (currency.equals("Indian Rupee")){
			setOutput(peso * 1.423724);
		}
		else if (currency.equals("Australian Dollar")){
			setOutput(peso * 0.029252);
		}
		else if (currency.equals("Canadian Dollar")){
			setOutput(peso * 0.029157);
		}
		else if (currency.equals("Singapore Dollar")){
			setOutput(peso * 0.029422);
		}
		else if (currency.equals("Swiss Franc")){
			setOutput(peso * 0.020633);
		}
		else if (currency.equals("Malaysian Ringgit")){
			setOutput(peso * 0.087385);
		}
		else if (currency.equals("Japanese Yen")){
			setOutput(peso * 2.415642);
		}
		
	
	}

}

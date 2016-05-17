package com.ella;

public class GradeBean {
	private double PrelimLec,PrelimLab,FinalsLec,FinalsLab,PrelimGrade, FinalGrade, RawAverage;
	
	public void setPrelimLec(double prelimlec) {  
	    this.PrelimLec = prelimlec;  
	}  
	 
	public void setPrelimLab(double prelimlab) {  
	    this.PrelimLab = prelimlab;  
	}  
	
	public void setFinalsLec(double finalslec){
		this.FinalsLec = finalslec;
	}
	public void setFinalsLab(double finalslab){
		this.FinalsLab = finalslab;
	}
	public void setFinalGrade(double finalgrade){
		this.FinalGrade = finalgrade;
	}
	public void setRawAverage(double rawaverage){
		this.RawAverage = rawaverage;
	}
	public void setPrelimGrade(double prelimgrade){
		this.PrelimGrade = prelimgrade;
	}
	public boolean compute(){  
	    if(RawAverage <= 64){  
	        setFinalGrade(3.0);  
	    }  
	    else if (RawAverage ){  
	        return false;  
	    }  
}
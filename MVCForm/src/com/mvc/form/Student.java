package com.mvc.form;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Student {

 // Step-1: Add validation rules to bean class
	
	// validate required field...............
	   @NotNull(message="is required")
	   @Size(min=1,message="is required")
	   public String name;
	
	// validate number range..................
	   @Min(value=0, message="Put valid count")
	   @Max(value=10,message="Exceed the count" )
	   public Integer freePass;
	
	// validate regular expression
	   @Pattern(regexp="^[a-zA-Z0-9]{5}",message="Invalid postal code")
	   public String postal;
	
	// validate custom annotation
	   @CourseCode(value="LUV",message="must start with LUV")
	   public String course;
	   
	   
	   
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getPostal() {
		return postal;
	}
	public void setPostal(String postal) {
		this.postal = postal;
	}
	public Integer getFreePass() {
		return freePass;
	}
	public void setFreePass(Integer freePass) {
		this.freePass = freePass;
	}
	String gender;
	String lang;
	String country;
	
	// Getter setter
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}

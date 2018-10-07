package com.example.altimetrik.model;


import com.google.gson.annotations.SerializedName;

public class PovertyType{

	@SerializedName("name")
	private String name;

	@SerializedName("range")
	private String range;

	@SerializedName("label")
	private String label;

	@SerializedName("showPovertyLevel")
	private String showPovertyLevel;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setRange(String range){
		this.range = range;
	}

	public String getRange(){
		return range;
	}

	public void setLabel(String label){
		this.label = label;
	}

	public String getLabel(){
		return label;
	}

	public void setShowPovertyLevel(String showPovertyLevel){
		this.showPovertyLevel = showPovertyLevel;
	}

	public String getShowPovertyLevel(){
		return showPovertyLevel;
	}

	@Override
 	public String toString(){
		return 
			"PovertyType{" + 
			"name = '" + name + '\'' + 
			",range = '" + range + '\'' + 
			",label = '" + label + '\'' + 
			",showPovertyLevel = '" + showPovertyLevel + '\'' + 
			"}";
		}
}
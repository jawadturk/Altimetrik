package com.example.altimetrik.model;


import com.google.gson.annotations.SerializedName;

public class MatchingFund{

	@SerializedName("matchImpactMultiple")
	private String matchImpactMultiple;

	@SerializedName("faqURL")
	private String faqURL;

	@SerializedName("amount")
	private String amount;

	@SerializedName("name")
	private String name;

	@SerializedName("multipleForDisplay")
	private String multipleForDisplay;

	@SerializedName("ownerRegion")
	private String ownerRegion;

	@SerializedName("description")
	private String description;

	@SerializedName("type")
	private String type;

	@SerializedName("donorSalutation")
	private String donorSalutation;

	@SerializedName("logoURL")
	private String logoURL;

	@SerializedName("matchingKey")
	private String matchingKey;

	public void setMatchImpactMultiple(String matchImpactMultiple){
		this.matchImpactMultiple = matchImpactMultiple;
	}

	public String getMatchImpactMultiple(){
		return matchImpactMultiple;
	}

	public void setFaqURL(String faqURL){
		this.faqURL = faqURL;
	}

	public String getFaqURL(){
		return faqURL;
	}

	public void setAmount(String amount){
		this.amount = amount;
	}

	public String getAmount(){
		return amount;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setMultipleForDisplay(String multipleForDisplay){
		this.multipleForDisplay = multipleForDisplay;
	}

	public String getMultipleForDisplay(){
		return multipleForDisplay;
	}

	public void setOwnerRegion(String ownerRegion){
		this.ownerRegion = ownerRegion;
	}

	public String getOwnerRegion(){
		return ownerRegion;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setDonorSalutation(String donorSalutation){
		this.donorSalutation = donorSalutation;
	}

	public String getDonorSalutation(){
		return donorSalutation;
	}

	public void setLogoURL(String logoURL){
		this.logoURL = logoURL;
	}

	public String getLogoURL(){
		return logoURL;
	}

	public void setMatchingKey(String matchingKey){
		this.matchingKey = matchingKey;
	}

	public String getMatchingKey(){
		return matchingKey;
	}

	@Override
 	public String toString(){
		return 
			"MatchingFund{" + 
			"matchImpactMultiple = '" + matchImpactMultiple + '\'' + 
			",faqURL = '" + faqURL + '\'' + 
			",amount = '" + amount + '\'' + 
			",name = '" + name + '\'' + 
			",multipleForDisplay = '" + multipleForDisplay + '\'' + 
			",ownerRegion = '" + ownerRegion + '\'' + 
			",description = '" + description + '\'' + 
			",type = '" + type + '\'' + 
			",donorSalutation = '" + donorSalutation + '\'' + 
			",logoURL = '" + logoURL + '\'' + 
			",matchingKey = '" + matchingKey + '\'' + 
			"}";
		}
}
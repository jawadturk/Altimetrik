package com.example.altimetrik.model;


import com.google.gson.annotations.SerializedName;

public class TeacherFFPromoCodeFund{

	@SerializedName("code")
	private String code;

	@SerializedName("eligible")
	private String eligible;

	@SerializedName("name")
	private String name;

	@SerializedName("ownerRegion")
	private String ownerRegion;

	@SerializedName("description")
	private String description;

	@SerializedName("deadline")
	private String deadline;

	@SerializedName("type")
	private String type;

	@SerializedName("donorSalutation")
	private String donorSalutation;

	@SerializedName("logoURL")
	private String logoURL;

	@SerializedName("matchingKey")
	private String matchingKey;

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	public void setEligible(String eligible){
		this.eligible = eligible;
	}

	public String getEligible(){
		return eligible;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
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

	public void setDeadline(String deadline){
		this.deadline = deadline;
	}

	public String getDeadline(){
		return deadline;
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
			"TeacherFFPromoCodeFund{" + 
			"code = '" + code + '\'' + 
			",eligible = '" + eligible + '\'' + 
			",name = '" + name + '\'' + 
			",ownerRegion = '" + ownerRegion + '\'' + 
			",description = '" + description + '\'' + 
			",deadline = '" + deadline + '\'' + 
			",type = '" + type + '\'' + 
			",donorSalutation = '" + donorSalutation + '\'' + 
			",logoURL = '" + logoURL + '\'' + 
			",matchingKey = '" + matchingKey + '\'' + 
			"}";
		}
}
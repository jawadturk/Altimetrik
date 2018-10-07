package com.example.altimetrik.model;


import com.google.gson.annotations.SerializedName;

public class AdditionalSubjectsItem{

	@SerializedName("groupId")
	private String groupId;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private String id;

	public void setGroupId(String groupId){
		this.groupId = groupId;
	}

	public String getGroupId(){
		return groupId;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"AdditionalSubjectsItem{" + 
			"groupId = '" + groupId + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}
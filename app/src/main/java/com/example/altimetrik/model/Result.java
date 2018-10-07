package com.example.altimetrik.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Result{

	@SerializedName("totalProposals")
	private String totalProposals;

	@SerializedName("breadcrumb")
	private List<List<String>> breadcrumb;

	@SerializedName("searchTerms")
	private String searchTerms;

	@SerializedName("max")
	private String max;

	@SerializedName("index")
	private String index;

	@SerializedName("searchURL")
	private String searchURL;

	@SerializedName("proposals")
	private List<ProposalsItem> proposals;

	public void setTotalProposals(String totalProposals){
		this.totalProposals = totalProposals;
	}

	public String getTotalProposals(){
		return totalProposals;
	}

	public void setBreadcrumb(List<List<String>> breadcrumb){
		this.breadcrumb = breadcrumb;
	}

	public List<List<String>> getBreadcrumb(){
		return breadcrumb;
	}

	public void setSearchTerms(String searchTerms){
		this.searchTerms = searchTerms;
	}

	public String getSearchTerms(){
		return searchTerms;
	}

	public void setMax(String max){
		this.max = max;
	}

	public String getMax(){
		return max;
	}

	public void setIndex(String index){
		this.index = index;
	}

	public String getIndex(){
		return index;
	}

	public void setSearchURL(String searchURL){
		this.searchURL = searchURL;
	}

	public String getSearchURL(){
		return searchURL;
	}

	public void setProposals(List<ProposalsItem> proposals){
		this.proposals = proposals;
	}

	public List<ProposalsItem> getProposals(){
		return proposals;
	}

	@Override
 	public String toString(){
		return 
			"Result{" + 
			"totalProposals = '" + totalProposals + '\'' + 
			",breadcrumb = '" + breadcrumb + '\'' + 
			",searchTerms = '" + searchTerms + '\'' + 
			",max = '" + max + '\'' + 
			",index = '" + index + '\'' + 
			",searchURL = '" + searchURL + '\'' + 
			",proposals = '" + proposals + '\'' + 
			"}";
		}
}
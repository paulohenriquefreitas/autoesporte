package com.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties({ "creator","guid"})
public class Item {
	@JsonProperty
	private String title;
	@JsonIgnore
	private String description;
	@JsonProperty
	private String link;
	private String creator;
	private String guid;
	@JsonProperty
	private List<Content> content;
	
	public String getTitle() {
		return title;
	}
	public String getDescription() {
		return description;
	}
	public String getLink() {
		return link;
	}
	public String getGuid() {
		return guid;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public void setGuid(String guid) {
		this.guid = guid;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public List<Content> getContent() {
		return content;
	}
	public void setContent(List<Content> content) {
		this.content = content;
	}	
	
	
	
	
}

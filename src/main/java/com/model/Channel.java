package com.model;

import java.util.List;

public class Channel {
	private String title;
	private String link;
	private String description;
	private String language;
	private String copyright;
	private List<Image> image;
	private List<Item> item;

	public String getTitle() {
		return title;
	}

	public String getLink() {
		return link;
	}

	public String getDescription() {
		return description;
	}

	public String getLanguage() {
		return language;
	}

	public String getCopyright() {
		return copyright;
	}

	public List<Image> getImage() {
		return image;
	}

	public List<Item> getItem() {
		return item;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	public void setImage(List<Image> image) {
		this.image = image;
	}

	public void setItem(List<Item> item) {
		this.item = item;
	}
}

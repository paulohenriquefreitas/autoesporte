package com.model;

public class Image {
	private String url;
	public String getUrl() {
		return url;
	}
	public String getTitle() {
		return title;
	}
	public String getLink() {
		return link;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setLink(String link) {
		this.link = link;
	}
	private String title;
	private String link;
}

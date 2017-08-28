package com.model;

public class Feed {
	private Content[] content;

    private String title;

    private String link;

    public Content[] getContent ()
    {
        return content;
    }

    public void setContent (Content[] content)
    {
        this.content = content;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getLink ()
    {
        return link;
    }

    public void setLink (String link)
    {
        this.link = link;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [content = "+content+", title = "+title+", link = "+link+"]";
    }	
	
	
}

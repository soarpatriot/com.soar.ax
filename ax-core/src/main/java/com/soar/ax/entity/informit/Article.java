package com.soar.ax.entity.informit;

import java.io.Serializable;
import java.util.Date;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias( "article" )
public class Article implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String title;
	private String author;
	private Date publishDate;
	private String summary;
	private String body;
	
	public Article()
	{
	}
	
	public Article( int id, String title, String author, Date publishDate, String summary, String body )
	{
		this.id = id;
		this.title = title;
		this.author = author;
		this.publishDate = publishDate;
		this.summary = summary;
		this.body = body;
	}
	
	public Article( int id, String title, String author, Date publishDate, String summary )
	{
		this.id = id;
		this.title = title;
		this.author = author;
		this.publishDate = publishDate;
		this.summary = summary;
	}
	
	public int getId()
	{
		return id;
	}

	public void setId( int id )
	{
		this.id = id;
	}

	public String getTitle()
	{
		return title;
	}
	public void setTitle( String title )
	{
		this.title = title;
	}
	public String getAuthor()
	{
		return author;
	}
	public void setAuthor( String author )
	{
		this.author = author;
	}
	public Date getPublishDate()
	{
		return publishDate;
	}
	public void setPublishDate( Date publishDate )
	{
		this.publishDate = publishDate;
	}
	public String getSummary()
	{
		return summary;
	}
	public void setSummary( String summary )
	{
		this.summary = summary;
	}
	public String getBody()
	{
		return body;
	}
	public void setBody( String body )
	{
		this.body = body;
	}
	
	public String toString()
	{
		return title + " by " + author + ": " + summary;
	}
	
}

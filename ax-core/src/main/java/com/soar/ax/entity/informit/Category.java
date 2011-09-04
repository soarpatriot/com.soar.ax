package com.soar.ax.entity.informit;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Defines a a category of articles
 * 
 * @author shaines
 */
@XStreamAlias( "category" )
public class Category
{
	private String name;

	public Category()
	{
	}
	public Category( String name )
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setName( String name )
	{
		this.name = name;
	}
	
	public String toString()
	{
		return name;
	}
}

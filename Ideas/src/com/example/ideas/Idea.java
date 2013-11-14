package com.example.ideas;

import android.R.string;

public class Idea {
	private int _id; 
	private String _title; 
	private String _description; 
	
	public int getId()
	{
		return _id; 
	}
	
	public void setId(int id)
	{
		this._id = id; 
	}
	
	public String getTitle()
	{
		return _title; 
	}
	
	public void setTitle(String title)
	{
		this._title = title; 
	}
	
	public String getDescription()
	{
		return _description; 
	}
	
	public void setDescription(String description)
	{
		this._description = description; 
	}
	
	@Override 
	public String toString()
	{
		return _title;
	}
}

package com.scout.data;

import java.util.ArrayList;

public class Team {
	private int teamNum;
	private ArrayList<ScoutSheet> scoutData;
	
	public Team(int num)
	{
		teamNum = num;
		scoutData = new ArrayList<ScoutSheet>();
	}
	
	public int teamNum()
	{
		return teamNum;
	}
	public double meanAutonScore()
	{
		double sum = 0;
		for(ScoutSheet ss: scoutData)
		{
			sum += ss.getAutonScore();
		}
		
		return sum / (double)scoutData.size();
	}
	
	public double meanTeleopScore()
	{
		double sum = 0;
		for(ScoutSheet ss: scoutData)
		{
			sum += ss.getTeleopScore();
		}
		
		return sum / (double)scoutData.size();
	}
	
	public double meanEndGameScore()
	{
		double sum = 0;
		for(ScoutSheet ss: scoutData)
		{
			sum += ss.getEndGameScore();
		}
		
		return sum / (double)scoutData.size();
	}
	
	public double meanScore()
	{
		return meanAutonScore() + meanTeleopScore() + meanEndGameScore();
	}
	public int getScorebyMatch(int matchNum)
	{
		for(ScoutSheet ss: scoutData)
		{
			if(ss.matchNum() == matchNum)
				return ss.score();
		}
		return -1;
	}
	
	public String getNotes()
	{
		StringBuilder builder = new StringBuilder();
		for(ScoutSheet ss: scoutData)
		{
			builder.append(ss.getNotes()+"\n");
		}
		return builder.toString();
	}
}

package com.scout.data;

public class Match {
	int redScore;
	int blueScore;
	int matchNum;
	
	Team[] red;
	Team[] blue;
	
	public Match(int num, Team[] r, Team[] b)
	{
		matchNum = num;
		redScore = 0;
		blueScore = 0;
		
		red = r;
		blue = b;
	}
	
	public int matchNum()
	{
		return matchNum;
	}

	public void calcScore()
	{
		for(Team t: red)
			redScore += t.getScorebyMatch(matchNum);
		
		for(Team t: blue)
			blueScore += t.getScorebyMatch(matchNum);
	}
}

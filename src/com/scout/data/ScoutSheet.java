package com.scout.data;

import com.scout.DataManager;

public abstract class ScoutSheet {
	protected int team;
	protected int matchNum;
	protected int auton;
	protected int teleop;
	protected int endgame;
	protected String notes;
	protected boolean alliance;
	
	public ScoutSheet()
	{
		team = 0;
		matchNum = 0;
		auton = 0;
		teleop = 0;
		endgame = 0;
		alliance = true;
	}
	public ScoutSheet(int teamNum, int num, boolean side)
	{
		team = teamNum;
		matchNum = num;
		auton = 0;
		teleop = 0;
		endgame = 0;
		alliance = side;
	}
	
	public int teamNum()
	{
		return team;
	}
	public int matchNum()
	{
		return matchNum;
	}
	public int score()
	{
		return auton+teleop+endgame;
	}
	
	public void setNotes (String txt)
	{
		notes = txt;
	}
	public String getNotes()
	{
		return notes;
	}
	abstract void addScoreAuton();
	abstract void addScoreTeleop();
	abstract void addScoreEndGame();
	
	public int getAutonScore()
	{
		return auton;
	}
	
	public int getTeleopScore() 
	{
		return teleop;
	}
	
	public int getEndGameScore()
	{
		return endgame;
	}
	public boolean isRedAlliance()
	{
		return alliance;
	}
	public String toSaveFormat()
	{
		return team+"/;"+matchNum+"/;"+(alliance?"red":"blue")+"/;"+auton+","+teleop+","+endgame+"/;"+notes+"/;";
	}
	public void parseScoutData(String data)
	{
		String[] pieces = data.split("/;");
		team = Integer.parseInt(pieces[0]);
		matchNum = Integer.parseInt(pieces[1]);
		alliance = pieces[2].equals("red");
		String[] scores = pieces[3].split(",");
		auton = Integer.parseInt(scores[0]);
		teleop = Integer.parseInt(scores[1]);
		endgame = Integer.parseInt(scores[2]);
		notes = pieces[4];
	}
	
	public int hashCode()
	{
		return DataManager.hashTeamMatch(team, matchNum);
	}
}

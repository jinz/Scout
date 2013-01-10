package com.scout;

import java.util.HashMap;
import java.util.ArrayList;
import com.scout.data.*;

public class DataManager {
	
	private HashMap<Integer, ArrayList<Team>> matchToTeams;
	private HashMap<Integer, ArrayList<Match>> teamToMatches;
	private static DataManager manager = null;
	
	protected DataManager()
	{
		matchToTeams = new HashMap<Integer, ArrayList<Team>>();
		teamToMatches = new HashMap<Integer, ArrayList<Match>>();
	}
	public static DataManager getInstance()
	{
		if (manager == null)
			return new DataManager();
		return manager;
	}
	public static int hashTeamMatch(int team, int match)
	{
		return team * 1000000 + match;
	}
}
